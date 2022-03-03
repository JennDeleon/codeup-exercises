package main;
import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        System.out.println("4 + 2 = " + addition(4, 2));
        System.out.println("4 - 2 = " + subtraction(4, 2));
        System.out.println("4 * 2 = " + multiplication(4, 2));
        System.out.println("4 / 2 = " + division(4, 2));
        System.out.println("modulus of 4 / 2 = " + modulus(4, 2));


        getInteger(5);
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
    public static void getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number between" + min + " and " + max);
        int userInput = sc.nextInt();

        if (userInput <= min || userInput > max) {
            return;
        }
        System.out.println(min);
        getInteger(min - 1);
    }

}
