package com.art;

public class Main {

    public static void main(String[] args) {
        Paintings painting = new Paintings();
        painting.setMedium("Oil");
        painting.setPaintType("Watercolor");
        painting.setSize("Medium");
        painting.setArtistName("Cartoon");
        painting.setYear("2018");
        painting.artpieces();

        Sculptures sculpture = new Sculptures();
        sculpture.setMedium("Clay");
        sculpture.setMaterial("Copper");
        sculpture.setSize("Large");
        sculpture.setArtistName("Mephis");
        sculpture.setYear(2002);
        sculpture.artpieces();

        Photographs photograph = new Photographs();
        photograph.setMedium("Physical");
        photograph.setColor("Black and White");
        photograph.setSize("Small");
        photograph.setArtistName("Hunter");
        photograph.setYear(2015);
        photograph.artpieces();
    }
}
