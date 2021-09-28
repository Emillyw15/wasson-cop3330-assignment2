/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emilly Wasson
 */

package ex25;
import java.util.Scanner;

public class prog25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a password and I will tell you how strong it is. ");
        System.out.print("What is the password? ");
        String password = in.nextLine();
        int grade = passwordValidator(password);
        String strength;
        switch (grade) {
            case 0:
                strength = "very weak";
                break;
            case 1:
                strength = "weak";
                break;
            case 2:
                strength = "strong";
                break;
            case 3:
                strength = "very strong";
                break;
            default:
                strength = "not supported";
                break;
        }
        System.out.println("The password " + password + " is a " + strength + " password.");

    }

    public static int passwordValidator(String s) {
        int score = 0;
        String special = "!@#$%^&*";

        // letter check
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                score += 1;
                break;
            }
        }

        // length check
        if (s.length() >= 8) {
            boolean hasNumAndLen = false;

            // number check
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    score += 1;
                    hasNumAndLen = true;
                    break;
                }
            }

            if (!hasNumAndLen) {
                return score;
            }
        }

        // special char check
        for (int i = 0; i < special.length(); i++) {
            if (s.contains(Character.toString(special.charAt(i)))) {
                score += 1;
                break;
            }
        }

        return score;
    }
}
