package util;

import java.util.Scanner;


public class Input {
    private Scanner scanner;
//    first part
    String getString(){
        return scanner.nextLine();

    }

    public Input(){
        scanner = new Scanner(System.in);
    }

    public boolean yesNo(String s){
        System.out.println("Enter yes or no");

        String yes = getString().toLowerCase();

        if (yes.equals("yes") || yes.equals("y") || yes.equals("yeah")) {
            return true;
        } else {
            return false;
        }
    }

    int getInt(int min, int max) {
//        prompting the user to enter an Int
        System.out.println("Enter a number between " + min + " and " + max);
//        defining userInput from scanner
        int userInput = scanner.nextInt();
        scanner.nextLine();

//        looping to keep prompting the user for correct input
            while (userInput < min || userInput > max) {
                System.out.println("Enter a number between " + min + " and " + max);
//                redefining userInput with each new entry loop will break once Int is within range
                userInput = scanner.nextInt();
                scanner.nextLine();

            }
                return userInput;
    }


    public double getDouble(double min, double max){
        System.out.println("Enter another number between " + min + " and " + max);
//        defining userInput from scanner
        double userInput = scanner.nextDouble();
//        reading in the leftover new line character
        scanner.nextLine();
//        looping to keep prompting the user for correct input
        while (userInput < min || userInput > max) {
            System.out.println("Enter a number between " + min + " and " + max);
//                redefining userInput with each new entry loop will break once Int is within range
            userInput = scanner.nextDouble();
            scanner.nextLine();

        }
        return userInput;
    }

}
