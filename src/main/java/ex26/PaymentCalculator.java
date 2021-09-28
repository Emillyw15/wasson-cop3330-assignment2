/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emilly Wasson
 */

package ex26;
import java.util.Scanner;
import static java.lang.Math.log;

public class PaymentCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your balance? ");
        double balance = in.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        double percent = in.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        double monthly = in.nextDouble();

        int months = calculateMonthsUntilPaidOff(balance, percent, monthly);
        System.out.println("It will take you " + months + " months to pay off this card.");
    }

    public static int calculateMonthsUntilPaidOff(double balance, double percent, double monthly) {
        double rate = 0;
        int n = 0;

        percent /= 100;
        rate = percent / 365;

        double a = -(1f/30f) * log(1 + balance / monthly * (1 - Math.pow((1 + rate), 30))) / log(1 + rate);
        a = Math.ceil(a);
        n = (int) a;

        return n;
    }
}
