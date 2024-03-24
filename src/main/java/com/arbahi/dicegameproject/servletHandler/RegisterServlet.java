package com.arbahi.dicegameproject.servletHandler;

import com.arbahi.dicegameproject.user.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        User user=new User();
        user.setName(name);
        user.setLogin(login);
        user.setPassword(password);

        getServletContext().setAttribute(login,user);

        resp.sendRedirect("login.jsp");
    }
}
