/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emilly Wasson
 */

package ex29;
import java.util.InputMismatchException;
import java.util.Scanner;

public class prog29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean test = false;
        int rate = 0;

        while (test == false) {
            try {
                System.out.print("What is the rate of return? ");
                rate = in.nextInt();

                if (rate == 0) {
                    throw new InputMismatchException();
                }

                test = true;

            } catch (InputMismatchException e) {
                System.out.println("Sorry. That's not a valid input.");
            }
            in.nextLine();
        }

        int years = 72 / rate;
        System.out.print("It will take " + years + " years to double your initial investment.");
    }
}