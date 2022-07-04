public class diceRollUC2 {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake & Ladder Game.");
        //variable declaring starting position
        int startPosition = 0;
        int rollDice = (int)Math.floor(Math.random()*10 %6+1);
        System.out.println("The initial position of the player is :- " +startPosition);
        System.out.println("Yay u got the number :- "+ rollDice );
    }
}
