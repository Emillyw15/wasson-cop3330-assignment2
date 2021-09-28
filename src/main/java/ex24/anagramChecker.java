/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emilly Wasson
 */

package ex24;
import java.util.Arrays;
import java.util.Scanner;

public class anagramChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams. ");
        System.out.print("Enter the first string: ");
        String first = in.nextLine();
        String firstString = first.trim().replace(" ", "");

        System.out.print("Enter the second string: ");
        String second = in.nextLine();
        String secondString = second.trim().replace(" ", "");

        if (check(firstString, secondString)) {
            System.out.print(first + " and " + second + " are anagrams.");
        } else {
            System.out.print(first + " and " + second + " are not anagrams.");
        }
    }

    public static boolean check(String firstString, String secondString) {
        boolean status = true;
        if (firstString.length() != secondString.length()) {
            status = false;
        } else {
            char[] array1 = firstString.toLowerCase().toCharArray();
            char[] array2 = secondString.toLowerCase().toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            status = Arrays.equals(array1, array2);
        }
        return status;
    }
}
