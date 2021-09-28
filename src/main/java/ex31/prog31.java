/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emilly Wasson
 */

package ex31;
import java.util.Scanner;

public class prog31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = in.nextInt();
        System.out.print("What is your resting heart rate? ");
        int rate = in.nextInt();
        System.out.println();

        System.out.println("Resting Pulse: " + rate + "        Age: " + age);
        System.out.println();
        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");

        for (int i = 55; i <= 95; i += 5) {
            int target = (((220 - age) - rate) * i/100) + rate;
            System.out.println(i + "%          | " + target + " bpm");
        }
    }
}
