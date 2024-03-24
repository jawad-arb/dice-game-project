package com.arbahi.dicegameproject.game;

import lombok.Getter;

import java.util.Random;

public class Game {
    private int die1;
    private int die2;
    private int die3;
    @Getter
    private int score;
    private Random random;

    public Game() {
        random=new Random();
        resetGame();
    }

    public void resetGame() {
        die1=die2=die3=0;
        score=-1;
    }

    public int rollDie(int dieNumber) throws Exception {
        int roll=random.nextInt(6)+1;
        switch (dieNumber){
            case 1:
                if (die1 != 0) throw new Exception("Die 1 has already been rolled");
                die1=roll;
                break;
            case 2:
                if (die2 != 0) throw new Exception("Die 2 has already been rolled");
                die2=roll;
                break;
            case 3:
                if (die3 != 0) throw new Exception("Die 3 has already been rolled");
                die3=roll;
                break;

        }
        return roll;
    }

    public void calculateScore() {
        if (die1 < die2 && die2 < die3) {
            score = die1 + die2 + die3;
        } else {
            score = 0;
        }
    }
    public boolean allDiceRolled() {
        // Check if all dice have been rolled
        return die1 != 0 && die2 != 0 && die3 != 0;
    }

    public boolean isGameOver() {
        return die1 == 6 || (die1 != 0 && die2 != 0 && die3 != 0);
    }
}
