/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emilly Wasson
 */

package ex36;
import java.util.ArrayList;
import java.util.Scanner;

public class computingStatistics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        double total = 0;

        while (true) {
            System.out.print("Enter a number: ");
            String number = in.nextLine();

            if (number.equals("done")) {
                break;
            } else {
                numberList.add(Integer.parseInt(number));
                total += Double.parseDouble(number);
            }
        }

        double average = total / numberList.size();
        int min = numberList.get(0);
        int max = numberList.get(0);

        for (int i = 1; i < numberList.size(); i++) {
            if (numberList.get(i) < min) {
                min = numberList.get(i);
            }
        }

        for (int i = 1; i < numberList.size(); i++) {
            if (numberList.get(i) > max) {
                max = numberList.get(i);
            }
        }

        double standardDev = 0;
        double sDev = 0;
        for (int i = 0; i < numberList.size(); i++) {
            int value = numberList.get(i);
            standardDev = Math.pow(value - average, 2);
            sDev = Math.sqrt(standardDev / numberList.size());
        }

        System.out.println("Numbers: " + numberList);
        System.out.println("The average is " + average);
        System.out.println("The minimum is " + min);
        System.out.println("The maximum is " + max);
        System.out.println("The standard deviation is " + sDev);
    }

    double average(int total, int size) {
        return total / size;
    }
}
