package com.bridgelabz.game;

/** Refactor : Conditions for exact winning till 100,
 *           : Counted the no. of time dice is rolled.
 */
public class SnakeAndLadder {
    //constants variable
    public static final int NO_PLAY = 1;
    public static final int LADDER = 2;
    public static final int SNAKE = 3;
    public static final int winPosition = 100;

    public static void main(String[] args) {

        System.out.println("Welcome to the Snake & Ladder Game.");

        //variable declaring Starting position
        //variable declaring Current position
        //variable declaring for dice count.
        int startPosition = 0;
        int currentPosition = 0;
        int diceCount = 0;

        System.out.println("The initial position of the player is :- " + startPosition);

        while (currentPosition < winPosition) {
            int rollDice = (int) Math.floor(Math.random() * 10 % 6 + 1);
            int choice = (int) Math.floor(Math.random() * 10 % 3+1);
            System.out.println("\n Yay you got the number :- " + rollDice);
            System.out.println("Your Choice is :- " + choice);

            // if Condition for the options of NO_Play, Ladder and Snake.

            switch (choice) {
                case NO_PLAY:
                    System.out.println("Sorry you can not Play. You are at the same Position. Try Again !!");
                    break;
                case LADDER:
                    System.out.println("Yay its the Ladder. Move forward by :-  " + rollDice);
                    if ((currentPosition + rollDice) <= winPosition) {
                        currentPosition += rollDice;
                    } else if ((currentPosition +rollDice ) > winPosition ){
                        System.out.println( "OOps sorry you are at the same position u got :- " +rollDice); }
                    break;
                case SNAKE: {
                    System.out.println("OOOPS its a Snake. Move back by :- " + rollDice);
                    currentPosition -= rollDice;
                    if (currentPosition < 0) {
                        currentPosition = 0;
                    }
                }
                break;
            }
            System.out.println("The Current position of the player is = " + currentPosition);
            diceCount++;
        }
        System.out.println("You have rolled the dice = "+diceCount);
    }
}