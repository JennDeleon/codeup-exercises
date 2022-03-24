package util;

import java.util.Scanner;


public class Input {
    private Scanner input;

    public Input() {
        input = new Scanner(System.in);
    }


    public String getString(String prompt) {
        System.out.printf("%s", prompt);
        return input.nextLine();
    }


    public boolean yesNo(String prompt) {
        System.out.printf("%s", prompt);
        String response = input.nextLine();
//
//        String yes = getString("Enter movie category: ").toLowerCase();
        //    DON'T NEED THIS ANYMORE, AS I'M USING THIS FOR SHAPES NOW
//
        if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
            return true;
        }
        return false;
    }



    public int getInt(String prompt) {
        do {
            try {
                String s = getString(prompt);
                return Integer.valueOf(s);
            } catch (NumberFormatException e){
                System.out.println("Thats not an number!");
            }
        } while (true);
    }

    public int getInt(String prompt, int min, int max) {

        while (true) {
            int result = getInt(prompt);
            if (result >= min && result <= max) {
                return result;
            }
            System.out.println("Must be between " + min + " and " + max);
        }
    }


    public double getDouble(String prompt) {
        while (true) {
            System.out.printf("%s", prompt);
//            if (input.hasNextDouble()) {
//                double result = input.nextDouble();
//                input.nextLine();
//                return result;
//            }
//            input.nextLine();
//        }
//    }
            try {
                String aString = getString(prompt);
                return Double.valueOf(aString);
            } catch(NumberFormatException e) {
            }
        }
    }

    public double getDouble(double min, double max, String prompt) {
        while (true) {
            double result = getDouble(prompt);
            if (result >= min && result <= max) {
                return result;
            }
            System.out.println("Must be in between " + min + " and " + max);
            return getDouble(min, max, prompt);

        }
    }

    public void close() {
        input.close();
    }
}

//      re-wrote all of this
//    public double getDouble(double min, double max){
//        System.out.println("Enter another number between " + min + " and " + max);
////        defining userInput from scanner
//        double userInput = scanner.nextDouble();
////        reading in the leftover new line character
//        scanner.nextLine();
////        looping to keep prompting the user for correct input
//        while (userInput < min || userInput > max) {
//            System.out.println("Enter a number between " + min + " and " + max);
////                redefining userInput with each new entry loop will break once Int is within range
//            userInput = scanner.nextDouble();
//            scanner.nextLine();
//
//        }
//        return userInput;
//    }
