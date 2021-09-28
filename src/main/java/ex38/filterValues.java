/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emilly Wasson
 */

package ex38;
import java.util.Scanner;

public class filterValues {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");

        String input = in.nextLine();
        String numberStringList[] = input.split(" ");

        System.out.print("The even numbers are:");
        for (int i = 0; i < numberStringList.length; i++) {
            int num = Integer.parseInt(numberStringList[i]);
            if (filterEvenNumbers(num)) {
                System.out.print(" " + num);
            }
        }
    }

    public static boolean filterEvenNumbers(int x) {
        if (x % 2 == 0)
            return true;
        return false;
    }
}
