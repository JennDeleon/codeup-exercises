package main;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
//        int x = 0;
//        do {
//            System.out.println(x);
//            x += 2;
//        } while (x <= 100);
//    }

//    {
//
//        int a = 100;
//        do {
//            System.out.println(a);
//            a -= 5;
//        } while (a >= -10);
//
//    long y = 2L;
//    do{
//        System.out.println(y);
////        y = (int) Math.pow(y, 2);
//        y *= y;
//    }while (y < 100L);
//}
//    {
//
//        for (long i = 2L; i < 1000000L; );
//        System.out.println(i);
//    }

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            }
        }
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//                number | squared | cubed
//                ------ | ------- | -----
//                1      | 1       | 1
//                2      | 4       | 8
//                3      | 9       | 27
//                4      | 16      | 64
//                5      | 25      | 125
        Scanner sq = new Scanner(System.in);

        System.out.println("What number do you want to go up to?");
        int UserInput = sq.nextInt();
        System.out.println();
        for (int i = 1; i <= UserInput; i++) {
            System.out.format("%-6d", i);
            System.out.print(" | ");
            System.out.format("%-7d", i * i);
            System.out.print(" | ");
            System.out.println(i * i * i);
        }
    }
}

