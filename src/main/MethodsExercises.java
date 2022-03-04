package main;
import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        System.out.println("4 + 2 = " + addition(4, 2));
        System.out.println("4 - 2 = " + subtraction(4, 2));
        System.out.println("4 * 2 = " + multiplication(4, 2));
        System.out.println("4 / 2 = " + division(4, 2));
        System.out.println("modulus of 4 / 2 = " + modulus(4, 2));




//        getInteger();
    }
    public static int addition (int x, int y){
        return x + y;
    }
    public  static int subtraction (int x, int y){
        return x- y;
    }
    public static int multiplication (int x, int y){
        return x * y;
    }
    public static int division (int x, int y){
        return x / y;
    }
    public static int modulus (int x, int y){
        return x % y;
    }

//    public static int getInteger(int min, int max){
//        System.out.print("Give me a number between 1 & 10");
//        int userInput = getInteger(1, 10);
//
//        if (userInput > 11 || userInput < 1) {
//             return 10;
//        } else {
//            return System.out.print("Give me a number between 1 & 10");
//            ;
//
//        }
//    }
public static int getInteger(int min, int max) {
    Scanner sc = new Scanner(System.in);
    int userInput = sc.nextInt();
    System.out.println("Enter a number between " + min + " and " + max);

    if (userInput < min || userInput > max) {
        System.out.println("That's not in-between 1 and 10...");
        return getInteger(min, max);
    } else {
        System.out.println("Cool");
        return userInput;
    }
}

}
