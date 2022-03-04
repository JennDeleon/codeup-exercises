package main;
import java.util.Scanner;


public class HighLow {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int min = 1;
        int max = 100;

        //Generate random int value from 1 to 100
        int randomInt = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println("Let's play a game. Guess my number between 1 and 100:");
        System.out.println(randomInt);
//         ^^^^ prints the random number

        int guess = input.nextInt();
//        ^^^^^^ grabbing input from scanner and turing into an Int
     do {
         if (guess > randomInt) {
             System.out.println("you guessed to high!");
         } else if (guess < randomInt) {
             System.out.println("you guessed too low!");
//             ^^^^ infinite loop
         } else if (guess == randomInt) {
             System.out.println("you win this round.....");
         } else {
             System.out.println("that wasn't a number.....");
         }
     } while (input.hasNext());
    }
}