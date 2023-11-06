package com.art;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;


@WebServlet("/hello")

public class Hello implements Servlet {



    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public ServletConfig getServletConfig() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getServletInfo() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // TODO Auto-generated method stub

        PrintWriter print = res.getWriter();
        print.println("</b>hello world</b>");
    }
}    