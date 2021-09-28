/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Emilly Wasson
 */

package ex33;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class magicBall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("What is your question? ");
        String question = in.nextLine();

        ArrayList<String> responses = new ArrayList<>();
        responses.add("Yes");
        responses.add("No");
        responses.add("Maybe");
        responses.add("Ask again later.");

        System.out.println(responses.get(random.nextInt(responses.size())));
    }
}
