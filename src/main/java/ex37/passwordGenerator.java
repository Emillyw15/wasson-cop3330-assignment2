/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emilly Wasson
 */

package ex37;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class passwordGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        String allSpecial = "!@#$%^&*";
        String allNumbers = "1234567890";
        String allLetters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        ArrayList<Character> specialList = new ArrayList<>();
        ArrayList<Character> numberList = new ArrayList<>();
        ArrayList<Character> letterList = new ArrayList<>();
        String passwordGen = new String();

        System.out.print("What's the minimum length? ");
        int length = in.nextInt();
        System.out.print("How many special characters? ");
        int special = in.nextInt();
        System.out.print("How many numbers? ");
        int number = in.nextInt();

        for (int i = 0; i < special; i++) {
            specialList.add(allSpecial.charAt(random.nextInt(allSpecial.length())));
        }

        for (int i = 0; i < number; i++) {
            numberList.add(allNumbers.charAt(random.nextInt(allNumbers.length())));
        }

        for (int i = 0; i < length - special - number; i++) {
            letterList.add(allLetters.charAt(random.nextInt(allLetters.length())));
        }

        int numSpecial = 0, numNumber = 0;

        for (int i = 0; i < length; i++) {
            switch(random.nextInt(3)) {
                case 0:
                    if (numSpecial < special) {
                        passwordGen += (specialList.get(numSpecial));
                        numSpecial++;
                    }
                    else
                        i--;
                    continue;
                case 1:
                    if (numNumber < number) {
                        passwordGen += (numberList.get(numNumber));
                        numNumber++;
                    }
                    else
                        i--;
                    continue;
                case 2:
                    passwordGen += (letterList.get(random.nextInt(letterList.size())));
                    continue;
            }
        }

        System.out.println("Your password is " + passwordGen);
    }
}
