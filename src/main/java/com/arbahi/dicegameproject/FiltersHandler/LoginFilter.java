package com.arbahi.dicegameproject.FiltersHandler;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter({"/game.jsp","/error.jsp","/endGame.jsp"})
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session= request.getSession(false);

        if (session == null || session.getAttribute("user") == null){
            response.sendRedirect(request.getContextPath()+"/login.jsp");
        }else {
            filterChain.doFilter(req,resp);
        }
    }
}
