package com.arbahi.dicegameproject.servletHandler;

import com.arbahi.dicegameproject.game.Game;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import javax.swing.*;
import java.io.IOException;
import java.util.Random;

@WebServlet("/game")
public class GameServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        Game game=(Game) session.getAttribute("game");
        if (game == null){
            game = new Game();
            session.setAttribute("game",game);
        }
        try{
            int dieNumber = Integer.parseInt(req.getParameter("dieNumber"));
            int rollResult=game.rollDie(dieNumber);
            session.setAttribute("rollResult",rollResult);
            //check if all dices has been rolled
            if (game.allDiceRolled()){
                game.calculateScore();
                if (game.isGameOver()){
                    session.setAttribute("score",game.getScore());
                    game.resetGame();
                    resp.sendRedirect("endGame.jsp");
                }else {
                    resp.sendRedirect("game.jsp");
                }
            } else{
                resp.sendRedirect("game.jsp");
            }
                //check if game is over
                //else // continue the game

        }catch (Exception e){
            req.setAttribute("errorMessage", e.getMessage());
            req.getRequestDispatcher("error.jsp").forward(req, resp);
        }
    }
}
