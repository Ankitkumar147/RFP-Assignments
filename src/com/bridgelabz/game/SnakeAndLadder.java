package com.bridgelabz.game;
public class SnakeAndLadder {
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int winPosition = 100;

    public static void main(String[] args) {

        System.out.println("Welcome to the Snake & Ladder Game.");

        //variable declaring starting position
        //variable declaring starting position
        int startPosition = 0;
        int currentPosition = 0;
        int winPosition = 100;
        int NO_PLAY = 0;
        int LADDER = 1;
        int SNAKE = 2;

        System.out.println("The initial position of the player is :- " + startPosition);

        while  ( currentPosition < winPosition ) {
            int rollDice = (int) Math.floor(Math.random() * 10 % 6 + 1);
            int choice = (int) Math.floor(Math.random() * 10 % 3);
            System.out.println("Yay you got the number :- " + rollDice);
            System.out.println("Your Choice is :- " + choice);
            // if Condition for the options of NO_Play, Ladder and Snake.
            if (choice == NO_PLAY) {
                System.out.println("Sorry you can not Play. You are at the same Position. Try Again !!");
            } else if (choice == LADDER) {
                System.out.println("Yay its the Ladder. Move forward by :-  " + rollDice);
                currentPosition += rollDice;
                System.out.println("Your current positin is = "+currentPosition);
            } else if (choice == SNAKE) {
                System.out.println("OOOPS its a Snake. Move back by :- " + rollDice);
                if (currentPosition != 0) {
                    currentPosition -= rollDice;
                }
                else if(currentPosition < 0) {
                    currentPosition = 0;
                }
                System.out.println("Your current positin is = "+currentPosition);
            }
        }
        System.out.println("The Current position of the player is = " + currentPosition);
    }
}



