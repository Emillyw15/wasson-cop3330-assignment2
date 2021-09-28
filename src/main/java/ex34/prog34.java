/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emilly Wasson
 */

package ex34;
import java.util.ArrayList;
import java.util.Scanner;

public class prog34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("There are 5 employees: ");

        ArrayList<String> names = new ArrayList<>();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.print("Enter an employee to remove: ");
        String employee = in.nextLine();

        if (names.contains(employee)) {
            names.remove(employee);
        }
        System.out.println("There are 4 employees: ");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
