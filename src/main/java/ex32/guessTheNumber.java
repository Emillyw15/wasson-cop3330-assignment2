/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emilly Wasson
 */

package ex32;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class guessTheNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        String playAgain = "y";

        System.out.println("Let's play Guess the Number!");

        while (playAgain.toLowerCase(Locale.ROOT).equals("y")) {
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            int difficulty = in.nextInt();
            in.nextLine();

            int answer = 0;

            switch (difficulty) {
                case 1:
                    answer = random.nextInt(10);
                    break;
                case 2:
                    answer = random.nextInt(100);
                    break;
                case 3:
                    answer = random.nextInt(1000);
                    break;
                default:
                    System.exit(0);
            }

            System.out.print("I have my number. What's your guess? ");

            int numGuesses = 0;
            boolean wrong = true;

            while (wrong) {
                int guess = in.nextInt();
                numGuesses++;
                in.nextLine();

                if (answer > guess)
                    System.out.print("Too low. Guess again: ");
                else if (guess > answer)
                    System.out.print("Too high. Guess again: ");
                else {
                    wrong = false;
                    System.out.println("You got it in " + numGuesses + " guesses!\n");
                    System.out.print("Do you wish to play again (Y/N)? ");
                    playAgain = in.nextLine();

                    numGuesses = 0;
                }
            }
        }
    }
}
