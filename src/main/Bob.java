package main;
//    Create a class named Bob with a main method for the following exercise.
//
//    Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//    Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//    He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//    He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//    He answers 'Whatever.' to anything else.

import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Talk to moody Bob:");

        String Sure = "Sure.";
        String ChillOut = "Whoa, chill out!";
        String Fine = "Fine. Be that way!";
        String Whatever = "Whatever.";

        do {
            String userInput = input.nextLine().trim();
            System.out.println(userInput);
            if (userInput.contains("!")) {
                System.out.println(ChillOut);
            } else if (userInput.equals("")) {
                System.out.println(Fine);
            } else if (userInput.contains("?")) {
                System.out.println(Sure);
            } else {
                System.out.println(Whatever);
                System.out.print("Talk to moody Bob:");
            }
        } while (input.hasNext());
    }

    }
