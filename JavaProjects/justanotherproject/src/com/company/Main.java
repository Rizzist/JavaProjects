package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 80;
        int levelCompleted = 5;
        int bonus = 100;
        int finall = calcScore(gameOver, score, levelCompleted, bonus);
        System.out.println(finall);
    }

    public static int calcScore(boolean gameOver,
                                 int score,
                                 int levelCompleted,
                                 int bonus) {
        int finalScore = score + (levelCompleted * bonus);
        if(gameOver) {

            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }
}
