/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emilly Wasson
 */

package ex28;
import java.util.ArrayList;
import java.util.Scanner;

public class prog28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            input.add(in.nextInt());
        }
        System.out.println("The total is " + addNumber(input));
    }

    public static int addNumber(ArrayList<Integer> input) {
        int total = 0;
        for (int i = 0; i < input.size(); i++) {
            total += input.get(i);
        }
        return total;
    }
}
