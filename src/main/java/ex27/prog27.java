/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emilly Wasson
 */

package ex27;

import java.util.InputMismatchException;
import java.util.Scanner;

public class prog27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String f = in.nextLine();
        System.out.print("Enter the last name: ");
        String l = in.nextLine();
        System.out.print("Enter the zip code: ");
        String zipcode = in.nextLine();
        System.out.print("Enter the employee ID: ");
        String employee = in.nextLine();

        boolean firstname = firstname(f);
        boolean lastname = lastname(l);
        boolean id = id(employee);
        boolean zip = zip(zipcode);

        if (firstname && lastname && zip && id) {
            System.out.println("There were no errors found.");
        }
    }

    public static boolean firstname(String f) {
        boolean pass = true;
        if (f.length() < 2) {
            System.out.println("The first name must be at least 2 characters long.");
            pass = false;
        }
        if (f.length() == 0) {
            System.out.println("The first name must be filled in.");
            pass = false;
        }
        return pass;
    }

    public static boolean lastname(String l) {
        boolean pass = true;
        if (l.length() < 2) {
            System.out.println("The last name must be at least 2 characters long.");
            pass = false;
        }
        if (l.length() == 0) {
            System.out.println("The last name must be filled in.");
            pass = false;
        }
        return pass;
    }

    public static boolean zip(String code) {
        try {
            int zip = Integer.parseInt(code);
            if (code.length() != 5) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            System.out.println("The zipcode must be a 5 digit number.");
            return false;
        }
        return true;
    }

    public static boolean id(String id) {
        try {
            InputMismatchException e = new InputMismatchException();
            if (!Character.isLetter(id.charAt(0))) {
                throw e;
            }

            if (!Character.isLetter(id.charAt(1))) {
                throw e;
            }

            if (id.charAt(2) != '-') {
                throw e;
            }

            if (!Character.isDigit(id.charAt(3))) {
                throw e;
            }

            if (!Character.isDigit(id.charAt(4))) {
                throw e;
            }

            if (!Character.isDigit(id.charAt(5))) {
                throw e;
            }

            if (id.length() > 7) {
                throw e;
            }

            return true;
        } catch (InputMismatchException e) {
            System.out.println("The employee ID must be in the format of AA-1234.");
            return false;
        }
    }
}
