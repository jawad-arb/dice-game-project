package com.arbahi.dicegameproject.servletHandler;

import com.arbahi.dicegameproject.user.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login=req.getParameter("login");
        String password=req.getParameter("password");

        // retrieve the user from application context
        User user=(User) getServletContext().getAttribute(login);

        if (user != null && user.getLogin().equals(login) && user.getPassword().equals(password)){
            HttpSession session=req.getSession();
            session.setAttribute("user",user);

        // redirect to game.jsp
            resp.sendRedirect("game.jsp");
        }else {
            resp.sendRedirect("login.jsp");
        }
    }
}
