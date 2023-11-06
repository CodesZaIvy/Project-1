package com.art.auth;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.art.parties.entity.User;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("Kwako");
        String password = request.getParameter("76543");

        User user = UserDatabase.getUser(username);

        if (user != null && user.getPassword().equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("Kwako", username);
            response.sendRedirect("./gallery.html"); // Redirect to the gallery page after successful login
        } else {
            response.sendRedirect("./index.html"); // Redirect back to login page
        }
    }
}

