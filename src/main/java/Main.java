import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Strickland
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("What is the input string? ");
        try (Scanner scan = new Scanner(System.in)) {
            String input = scan.nextLine();
            System.out.println(input + " has " + input.split("").length + " characters.");
        }
    }
}
