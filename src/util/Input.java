package util;

import java.util.Scanner;


//public class Input {
//    private Scanner scanner;
//
//    public String getString(String s){
//        return scanner.nextLine();
//
//    }
//
//    public Input(){
//        scanner = new Scanner(System.in);
//    }
//
//    public boolean yesNo(String s){
//        System.out.println("Enter yes or no");
//
//        String yes = getString("Enter movie category: ").toLowerCase();
//
//        if (yes.equals("yes") || yes.equals("y") || yes.equals("yeah")) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public int getInt(String s, int min, int max) {
////        prompting the user to enter an Int
//        System.out.println("Enter a number between " + min + " and " + max);
////        defining userInput from scanner
//        int userInput = scanner.nextInt();
//        scanner.nextLine();
//
////        looping to keep prompting the user for correct input
//            while (userInput < min || userInput > max) {
//                System.out.println("Enter a number between " + min + " and " + max);
////                redefining userInput with each new entry loop will break once Int is within range
//                userInput = scanner.nextInt();
//                scanner.nextLine();
//
//            }
//                return userInput;
//    }
//
//
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
            System.out.printf("%s", prompt + "\n");
            String response = input.nextLine();
            if(response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
                return true;
            }
            return false;
        }

        public int getInt(String prompt) {
            while(true) {
                System.out.printf("%s", prompt);
                if(input.hasNextInt()) {
                    int result = input.nextInt();
                    input.nextLine();
                    return result;
                }
                // if you get here, you did not type an int
                input.nextLine();
            }
        }

        public int getInt(String prompt, int min, int max) {
            while(true) {
                int result = getInt(prompt);
                if(result >= min && result <= max) {
                    return result;
                }
                System.out.printf("Integer must be between %d and %d!\n", min, max);
            }
        }

        public double getDouble(String prompt) {
            while(true) {
                System.out.printf("%s", prompt);
                if(input.hasNextDouble()) {
                    double result = input.nextDouble();
                    input.nextLine();
                    return result;
                }
                input.nextLine();
            }
        }

        public double getDouble(String prompt, double min, double max) {
            while(true) {
                double result = getDouble(prompt);
                if(result >= min && result <= max) {
                    return result;
                }
                System.out.printf("Double must be between %f and %f!\n", min, max);
            }
        }

        public void close() {
            input.close();
        }
    }

//what was wrong with my code? Need to review this to see why the first code that's commented out isn't working