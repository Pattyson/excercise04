import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Patrick Brookshire
 */

public class Solution04{

    public static void main(String[] agrs) {

        String answer = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a verb");
        answer += " ";
        answer += input.nextLine();
        answer += " your";

        System.out.println("Enter a adjective");
        answer += " ";
        answer += input.nextLine();

        System.out.println("Enter a noun");
        answer += " ";
        answer += input.nextLine();

        System.out.println("Enter a adverb");
        answer += " ";
        answer += input.nextLine();

        System.out.println("Do you" + answer + "? That's funny.");

    }
}