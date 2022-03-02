package main;

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
    }
}

