package main;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args) {
//        double pi = 3.14159;//
//        System.out.format("The value of pi is approximately:" + "%10.2f%n", pi);
        Scanner input =new Scanner(System.in);
        System.out.println("Enter an Int: ");
//        int myInt = input.nextInt();
// next problem
        System.out.println("enter 3 words: ");
        String first = input.next ();
        String second = input.next ();
        String third = input.next ();
        System.out.printf("Here are your words: \n%s\n%s\n%s", first, second, third);
        System.out.print("\nEnter more words: ");
        String sentence = input.nextLine();
        System.out.printf("You entered: \n%s\n%s\n%s", first, second, third);
//        next problem
        System.out.print("\nEnter length: ");
        System.out.print("\nEnter width: ");
        String lengthString = input.nextLine();
        String widthString = input.nextLine();
        double length = Double.parseDouble(lengthString);
        double width = Double.parseDouble(widthString);
        double area = (length * width);
        double perimeter = (2 * length) * (2 * width);
        System.out.printf("Area: %f\n"
                + "Perimeter of room: %f\n",
                area, perimeter);

    }
}
