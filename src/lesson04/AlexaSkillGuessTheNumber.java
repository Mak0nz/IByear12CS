package lesson04;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import helpers.Keyboard;
/**
 * Can you read your teacher's code? yes
 * Run the code, experiment with input, and fill in the // with your explainers.
 * Filling in the comments is not optional so do not ask whether you can not do it *eye roll*.
 */
public class AlexaSkillGuessTheNumber {
    public static void main(String[] args) {
        // Introduces the game
        System.out.println("Hello there, let's play: Guess The Number.");
        System.out.println("Are you ready?");
        String response = Keyboard.readString();

        // Asks user if they want to play
        if (response.equals("yes") || response.equals("y")) {
            System.out.println("Hmm... all right let me think of a number...");

            // picks a number between 0 and 10
            int number = (new Random()).nextInt(10);
            
            // System pretends to think
            System.out.print(".");
            pause(1);
            System.out.print(".");
            pause(1);
            System.out.print(".");
            pause(1);
            System.out.println("");

            // number of tries provided to the player
            int triesLeft = 2;
            System.out.println("Ok. You have 3 tries left. Have a go at your first guess.");
            int guess = Keyboard.readInt();
            
            // Tells user their guess is incorrect
            while (guess != number && triesLeft > 0) {
                if (guess < number) { // number is larger than the users guess
                    System.out.println("You are not correct! The number I am thinking of, is larger. Take another guess...");
                } else { // number is smaller than the users guess
                    System.out.println("You are not correct! The number I am thinking of, is smaller. Take another guess...");
                }
                // removes 1 try from the remainder of tries
                guess = Keyboard.readInt();
                triesLeft = triesLeft - 1;
            }
               
            // You guessed the number correctly response
            if (triesLeft > 0 && guess == number) { //
                System.out.println("Well done, you guessed. That was a good round.");
            } else { // yu didnt guess the number correctly, good luck next time
                System.out.println("You lost! The number I thought of was: " + number);
                System.out.println("Better luck next time.");
            }

        } else { // user doesnt want to play sadge
            System.out.println("That is all right. Maybe some other time...");
            System.out.println("Have a great day!");
        }
    }
    //
    //
    //
    private static void pause(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }
}