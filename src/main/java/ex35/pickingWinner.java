/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emilly Wasson
 */

package ex35;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class pickingWinner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> people = new ArrayList<>();
        Random random = new Random();

        while (true) {
            System.out.print("Enter a name: ");
            String name = in.nextLine();

            if (name.isEmpty())
                break;
            else
                people.add(name);
        }

        System.out.println("The winner is... " + (people.get(random.nextInt(people.size()))));
    }
}
