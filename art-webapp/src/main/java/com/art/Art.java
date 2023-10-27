package com.art;
//!Created an abstract class called Art  
//Art class abstracts away the details of how to artpieces such as a painting or a sculpture.
public  abstract class Art {
    //? After using Abstraction :Art the class can not be instantiated

    //!Encapsulation is achieved using private instance variables below
    //!Encasulation also occurs  providing public getters and setters to access and modify these variables. 
    //?This helps in hiding the internal implementation details of the Art class and its subclasses.
    private String medium;
    private int year;
    private String size;
    private String artistName;
public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public abstract void artpieces();
}


//!Polymophism
//This is the ability of objects of different classes to respond to the same method artpieces() in different ways by printing differnt outputs
//This program creates an array of Art objects, which can contain objects of any class that inherits from Art. 
//?The program then iterates over the array and calls the artpieces() method on each object.
//each object in the array has a different implementation of the artpieces() method, the program will print different output for each object




//! Inheritance
//s the process of creating a new class that inherits from an existing class.
//?The Paintings,Sculpture,and Photographs subclasses inherit from the Art class. 
//All the three classes have access to all of the methods and properties of the Art class, including the artpieces() method.
class Paintings extends Art {
    private String paintType;

    public String getPaintType() {
        return paintType;
    }

    public void setPaintType(String paintType) {
        this.paintType = paintType;
    }

    @Override
    public void artpieces() {
        System.out.println("Paintings: If you hear a voice within you say you cannot paint, then by all means paint and that voice will be silenced - Vincent Willem van Gogh    \n   "); 
        System.out.println("This painting was made using " + getMedium() + " and " + paintType + " of size " +
                getSize() + " by " + getArtistName() + " painted in the year " + getYear()) ;
    }

    public void setYear (String string) {

    }
}

class Sculptures extends Art {
    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void artpieces() {
        System.out.println("Sculptures: When you slow down enough to sculpt, you discover all kinds of things you never noticed before - Karen Jobe      \n   " );
        System.out.println("This sculpture was made using " + getMedium() + " and " + material + " in the year " +
                getYear() + " by " + getArtistName());
    }
}

class Photographs extends Art {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void artpieces() {
        System.out.println("Photographs: A photograph can be an instant of life captured for eternity that will never cease looking back at you - Brigitte Bardot     \n     ");
        System.out.println("This photograph of size " + getSize() + " was shot by " + getArtistName() +
                " in " + getColor() + " in the year " + getYear());
    }
}


//?Single Responsibility Principle (SRP): This principle states that a class should have only one reason to change. 
//?In the given code, each class (Paintings, Sculptures, Photographs) has a single responsibility of representing a specific type of art and displaying information about it.


//? Open/Closed Principle (OCP) : This principle states that a class should be open for extension but closed for modification. 
//?In the given code, the classes are closed for modification as they are declared and implemented as intended by the original author. However, they can be extended by creating new subclasses for different types of art.

//?Liskov Substitution Principle (LSP) : This principle states that objects of a superclass should be replaceable with objects of its subclasses without altering correctness. 
//? In the given code, objects of each subclass (Paintings, Sculptures, Photographs) can be used interchangeably with the Art class without affecting the behavior of the program. 