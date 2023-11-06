package com.art;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ivy")

public class Hallo extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

        PrintWriter print = res.getWriter();
        print.println("<b>Calc</b><br/>");

        String numeroString1 = req.getParameter("numero1");
        String numeroString2 = req.getParameter("numero2");


        BigDecimal numero1 = new BigDecimal(numeroString1);
        BigDecimal numero2 = new BigDecimal(numeroString2);

        print.print(numeroString1+ " * " + numeroString2+ " = "+ numero1.multiply(numero2));

        
}
}