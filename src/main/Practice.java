package main;
import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        String message = "Hello world" + "!";

        int result = 10 / 3;

        int youtubeViews = 123_456_789;
        Date today =  new Date();
        today.getTime();

        int [] numbers = new int[5];

        int [] [] numbersTwo = new int [2] [3];
        numbersTwo [0] [0] =1;

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
// *************** scanner example *********************
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");
        byte userNumber = scanner.nextByte();
        System.out.println("You entered " + userNumber);
// *************** scanner example *********************

        String[] languages = {"html", "css", "javascript", "java"};

        System.out.println("HELLO, IM LIKE A CONSOLE.LOG, BUT I PRINT IN THE TERMINAL");
        System.out.println(youtubeViews);

        System.out.println(today);

        System.out.println(point2);

        System.out.println(message);
        System.out.println(message.endsWith("!"));
        System.out.println(message.toUpperCase(Locale.ROOT));
        System.out.println(message.replace("!", "."));
        System.out.println(message);

        System.out.println(result);


        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.deepToString(numbersTwo));

        System.out.println(languages[2]);
        System.out.println(Arrays.toString(languages));

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] row : matrix) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int n : row) {
                System.out.print(n + " | ");
            }

            System.out.println();
        }

        System.out.println("+---+---+---+");

        display(1);
        display(1, 4);

    }
        private static void display(int a){
            System.out.println("Arguments: " + a);
        }

        private static void display(int a, int b){
            System.out.println("Arguments: " + a + " and " + b);
        }


}

/*
JAVA HAS CLASSES, WHICH IS A CONTAINER FOR THE RELATED METHODS.
A METHOD IS A FUNCTION THAT IS PART OF A CLASS.
WHEN A FUNCTION EXISTS OUTSIDE A CLASS, JUST CALL IT A FUNCTION.

                    ------------      BASIC ANATOMY     ----------


WE USE CLASSES TO ORGANIZE OUR CODE.
EVERY JAVA PROGRAM SHOULD CONTAIN AT LEAST ONE CLASS THAT CONTAINS THE MAIN METHOD.

USE PASCAL NAMING CONVENTION ON CLASSES.
(FIRST LETTER ON EVERY WORD CAPITALIZED)

LIKE JS, USE CAMEL CASING WITH METHODS.

EX:
    class Main {
        void main() {
            ...
         }
     }


WHEN WRITING OUT JAVA METHODS, START OUT WITH THE RETURN TYPE.
VOID METHODS RETURNS NOTHING.

FOLLOWING IS THE DESCRIPTIVE NAME OF THE FUNCTION.
LIKE JS, PARAMETERS GO IN THE ()

EX:
    VOID METHOD_NAME(PARAMETERS) {
        ... CODE GOES HERE ... ;
    }

EVERY JAVA PROGRAM NEEDS A MAIN METHOD. THIS IS THE ENTRY POINT FOR OUR PROGRAM.
EVERY TIME WE EXECUTE OUR PROGRAM, THE MAIN METHOD IS CALLED AND THE CODE IN THE MAIN
METHOD IS EXECUTED.

                      -------------------    STATEMENTS --------------------

MAKE SURE TO END EVERY STATEMENT WITH A ";"
STATEMENTS CAN BE GROUPED AS BLOCKS INSIDE CURLY BRACES { }
MAKE SURE ALL THE CODE IN CURLY BRACES ARE INDENTED:

{
    System.out.println("Code inside of curly braces should be indented");
    System.out.println("with four spaces");
}


            ------------------     ACCESS MODIFIER    -----------------------------------

ALL METHODS NEED AN ACCESS MODIFIER.
AN ACCESS MODIFIER IS A KEYWORD THAT DETERMINES IF OTHER CLASSES AND METHODS IN THE PROGRAM
CAN ACCESS THESE CLASSES/METHODS.

EX: PUBLIC, PRIVATE, PROTECTED, DEFAULT

    ------------------   VERY BASIC EXAMPLE OF A PUBLIC VOID JAVA METHOD   ----------------


        PUBLIC CLASS MAIN {
            PUBLIC STATIC VOID MAIN(STRING[] ARGS) {
                ...
             }
        }

-------------------------------------------------

SHORTCUT: TYPE IN sout AND ENTER TO GET System.out.println();
System.out.println() IS BASICALLY JAVA'S VERSION OF JS'S CONSOLE.LOG
IT PRINTS YOUR STRING MESSAGE TO THE TERMINAL.


JAVA VARIABLES ARE DEFINED BY TYPE SIMPLY BY JUST WRITING OUT THE TYPE:
STRING
INT
DOUBLE (used for decimals)
CHAR
BOOLEAN

EX:
int yourAge = 100;
String greeting = "hello";

                    --------------     ESCAPE SEQUENCES       --------------

"\" HELPS YOU WITH ADDING DOUBLE QUOTES IN STRINGS:

EX:

    String message = "Hello \"user\""; <-------- this will print out     Hello "user"

    TO AVOID ESCAPING THE DOUBLE QUOTE WHEN WORKING WITH BACKSLASHES:

    String message = "Here's a \\"; <------ prints out     Here's a \

    \n IS AN ESCAPE SEQUENCE USED TO ADD A NEW LINE
    \t TO ADD TABS


            --------------     ARITHMETIC EXPRESSIONS     --------------

REMEMBER THAT P-E-D-M-A-S APPLIES TO JAVA ARITHMETIC

BASIC MATH:

        int addition = 10 + 3;
        System.out.println(addition);  <--- will print out 13

        int divide = 10 / 3;
        System.out.println(divide);   <------- will print out 3 which is not the exact answer

TO FIX THE ABOVE SECOND EXAMPLE, WE NEED TO PREFIX THE OPERANDS WITH DOUBLE, AND CHANGE "INT" TO "DOUBLE".

        double divide = (double)10 / (double)3;
        System.out.println(divide);    <----- this will print out 3.333333335


YOU CAN USE THE INCREMENT AND DECREMENT OPERATOR AS WELL

EX:
    int x = 1;
    x++
    System.out.println(x); <------ this prints out 2

    int y = 1;
    y--
    System.out.println(y); <------ this prints out -2

                ----------------   CASTING    -------------------

CASTING IS COERCING A VALUE OF ONE TYPE INTO ANOTHER. THERE ARE TWO TYPES OF CASTING, IMPLICIT & EXPLICIT.

IMPLICIT CASTING INVOLVES ASSIGNING A VALUE OF A LESS PRECISE DATA TYPE TO A VARIABLE WHOSE TYPE IS
OF A HIGHER PRECISION, OR GOING FROM A MORE SPECIFIC TO A LESS SPECIFIC TYPE. IN THIS CASE, WE
WON'T HAVE TO WRITE ANY ADDITIONAL CODE, THE CAST WILL TAKE PLACE IMPLICITLY.

EX:
    int myInteger = 900;
    long morePrecise = myInteger;

IN THE ABOVE EXAMPLE, WE ASSIGNED int TO A VARIABLE OF TYPE long, WHICH CAN HOLD A LARGER
RANGE OF VALUES THAN int CAN. THIS IS ALSO CALLED WIDENING CONVERSION.

EXPLICIT CASTING INVOLVES GOING FROM LESS SPECIFIC TYPES TO A MORE SPECIFIC TYPE, OR GOING FROM
A HIGHER PRECISION TYPE TO A LOWER. IF WE WANT EXPLICIT CAST TO HAPPEN, WE'LL NEED TO EXPLICITLY PUT
THE TYPE WE ARE CASTING TO INSIDE OF PARENTHESIS BEFORE THE VALUE WILL BE CAST.

EX:
    double pi = 3.14159;
    int almostPi = (int) pi;

IN THE ABOVE EXAMPLE WE ARE GOING FROM A double TO AN int. THIS IS ALSO CALLED NARROWING CONVERSION.

ANOTHER OF IMPLICIT CASTING EX:

    public class Practice {

        public static void main(String[] args) {

        //Automatic conversion happening below
       //The short is being converted to an int

            short x = 1.1;
            int y = (int)x + 2;
            System.out.println(y);
        }
    }

IMPLICIT CASTING EX IF WE ARE WORKING WITH FLOATING POINT NUMBERS:

    public class Practice {

        public static void main(String[] args) {

        // we changed the below int to a double as int is not as precise because int
        //does not return decimals.

            double x = 1.1;
            double y = x + 2;
            System.out.println(y);  <---- prints out 3.1
        }
    }

IMPLICIT CASTING HAPPENS WHEN THERE IS NO CHANCE FOR DATA LOSE.

EXPLICIT CASTING IF WE DON'T CARE ABOUT THE DECIMAL:

        public class Practice {

        public static void main(String[] args) {
            double x = 1.1;

            // if we keep the next line as just
            // int y = x + 2;
            //we will get an error, so we need to EXPLICITLY cast the result
            //by casting x to an int

            int y = (int)x + 2;
            System.out.println(y);  <---- prints out 3
        }
    }

NUMERICAL CASTING:  BYTE > SHORT > INT > LONG > FLOAT > DOUBLE

IMPLICIT CASTING CAN ONLY HAPPEN WITH COMPATIBLE TYPES.
EX: WE CAN'T CAST A STRING TO A NUMBER DIRECTLY.
TO DO SO, WE CEN USE parseInt(), parseShort, parseFloat etc.

EXAMPLE IF I WANT TO CAST A STRING TO AN INT:

        public static void main(String[] args) {

            String x = "1";

            // now we need to use a wrapper class

            int y = Integer.parseInt(x) + 2;
            System.out.println(y);  <---- prints out 3
        }
    }

EXAMPLE IF I WANT TO CAST A STRING THAT'S A FLOATING POINT NUMBER TO AN INT:

        public static void main(String[] args) {

            String x = "1.1";
            // changed all int to double
            // and we need to use a different wrapper class

            double y = Double.parseDouble(x) + 2;
            System.out.println(y);  <---- prints out 3.1
        }
    }

                ----------------   PRIMITIVE TYPES     -------------------


PRIMITIVE TYPES STORE SIMPLE VALUES:

THE MORE BYTES WE HAVE, THE LARGER NUMBER WE CAN STORE

TYPE       |        BYTES        |    RANGE

BYTE                  1             [-128, 127]
----------------------------------------------------
SHORT                 2             [-32K, 32K]
----------------------------------------------------
INT                   4             [-2B, 2B]
----------------------------------------------------
LONG                  8             quintillions
----------------------------------------------------
FLOAT                 4
----------------------------------------------------
DOUBLE                8             USED TO REPRESENT
                                    FLOATING-POINT #'S
----------------------------------------------------
CHAR                  2            STORES SINGLE CHARACTER
                                    EX: A, B, C SUPPORTS
                                    INTERNATIONAL LETTERS
----------------------------------------------------
BOOLEAN               1                TRUE/FALSE



IF YOU ARE WORRIED ABOUT MEMORY AND PROCESSING TIME YOUR CODE WILL TAKE UP, LOOK AT THE BYTES THAT WILL BE USED
E.g. INT WILL TAKE 4 BYTES & HAS LARGER RANGE, BUT BYTE ONLY TAKES UP 1 BYTE, SO YOU CAN USE
BYTE INSTEAD OF INT WHEN WORKING WITH VERY SMALL NUMBERS (BETWEEN -128 & 127).

EX:
byte age = 100;
int youtubeViews = 123456789

IF YOU WANT YOUR NUMBERS TO BE MORE READABLE, YOU CAN SEPARATE YOUR NUMBERS BY UNDERSCORE
EVERY 3 NUMBERS IN JAVA

EX:
int youtubeViews = 123_456_789

IF YOUR NUMBER IS TOO LONG, USE THE LONG TYPE, BUT BE SURE TO USE L AT THE END

EX:
int youtubeViews = 123_456_789_123_456L

ITS BETTER PRACTICE TO USE A CAP L SO, WHEN AT A QUICK GLANCE, L (l) IS NOT MISTAKEN FOR 1, BUT
YOU CAN USE UPPER OR LOWER CASE.

SIMILARLY, WHEN USING FLOAT, BE SURE TO USE A F AT THE END. UPPER OR LOWERCASE.

    ----------------------------- FORMAT SPECIFIERS  ---------------------------


Format Specifier	Conversion Applied
--------------------------------------------------------------
%a %A	            Floating-point hexadecimal
--------------------------------------------------------------
%b %B	            Boolean
--------------------------------------------------------------
%c	                Character
--------------------------------------------------------------
%d	                Decimal integer
--------------------------------------------------------------
%h %H	            Hash code of the argument
--------------------------------------------------------------
%e %E	            Scientific notation
--------------------------------------------------------------
%f	                Decimal floating-point
--------------------------------------------------------------
%g %G	            Uses %e or %f, whichever is shorter
--------------------------------------------------------------
%o	                Octal integer
--------------------------------------------------------------
%n	                Inserts a newline character
--------------------------------------------------------------
%s %S	            String
--------------------------------------------------------------
%t %T	            Time and date
--------------------------------------------------------------
%x %X	            Integer hexadecimal
--------------------------------------------------------------
%%	                Inserts a % sign



        ----------------------------------------- REFERENCE TYPES  ---------------------------
                    ------------------------ALSO PACKAGES --------------------

REFERENCE TYPES STORE COMPLEX OBJECTS (LIKE DATE OR MAIL MESSAGES)

OTHER EXAMPLES:

ARRAY
CLASS
INTERFACE
STRING
ENUMERATION
ANNOTATIONS


TYPING OUT DATE, INTELIJ WILL SUGGEST THE DATE PACKAGE (java.util), THAT INCLUDES A LOT OF UTILITY CLASSES
THAT ARE USEFUL. YOU CAN HAVE A CLASS WITH DIFFERENT PACKAGES, IF YOU WANT TO IMPORT SAID PACKAGE, JUST HOVER,
HIT TAB AND INTELIJ WILL AUTOMATICALLY ADD THE NECESSARY IMPORT LINE

EX:
package main;

import java.util.Date; <--------- INTELIJ AUTO ADDED

public class Practice {

    public static void main(String[] args) {
        Date today = ....
    }
}

YOU MUST USE THE "NEW" OPERATOR TO ALLOCATE MEMORY FOR THE VARIABLE.

WHEN DECLARING PRIMITIVE TYPES, WE DO NOT NEED TO ALLOCATE MEMORY, BUT WHEN DEALING WITH
REFERENCE TYPES, WE HAVE TO. AFTER ALLOCATING THE MEMORY, REPEAT THE NAME OF THE CLASS.

EX:

Date today = new Date();

WHAT THIS DOES IS DEFINE A NEW INSTANCE OF THE DATE CLASS.
AN OBJECT IS AN INSTANCE OF A CLASS.
THESE OBJECTS CAN BE ACCESSED BY USING THE "." OPERATOR
YOU CAN NOT ACCESS PRIMITIVE TYPES THIS WAY

EX:

package main;

import java.util.Date;

public class Practice {

    public static void main(String[] args) {
        Date today =  new Date();
        today.getTime();    <------------- this returns the time component of this object
        System.out.println(today);   <------ this will print out today's date and time information
    }
}
        ----------------------- CLASSES AND OBJECTS ------------------

CLASS - USED TO DEFINE A CUSTOM TYPE IN JAVA

FIELD- A VARIABLE OR METHOD THAT BELONGS TO AN OBJECT OR CLASS.
FIELDS ARE ACCESSED WITH THE "." OPERATOR. FIELDS BELONG TO OBJECTS, BUT CAN BE DEFINED AS BELONGING
TO A CLASS WITH THE STATIC KEYWORD. FIELDS ARE EITHER PROPERTIES (VARIABLES) OR METHODS (FUNCTIONS).

OBJECT- AN INSTANCE OF A CLASS. OBJECTS HAVE FIELDS AND METHODS, AND ARE CREATED WITH THE "new" keyword.

Let's look at an example of defining a Person class and creating an instance of it:

    class Person {
        public String firstName;
        public String lastName;

        public String sayHello() {
            return String.format("Hello from %s %s!", firstName, lastName);
        }

        public static void main(String[] args) {
            Person rick = new Person();
            rick.firstName = "Rick";
            rick.lastName = "Sanchez";
            System.out.println(rick.sayHello());
            // prints "Hello from Rick Sanchez!"
        }
    }

        ----------------------- STATIC VS INSTANCE ------------------



            ------------------   MEMORY MANAGEMENT -----------------

POINT - A point representing a location in (x,y) coordinate space, specified in integer precision

I WILL USE THE POINT CLASS AS AN EXAMPLE WHEN USING REFERENCE TAG.

A REFERENCE TYPE DOESN'T STORE THE ACTUAL VALUE, THEY STORE THE *REFERENCE* TO AN OBJECT
SOMEWHERE IN THE MEMORY.

EX:

public class Practice {

    public static void main(String[] args) {

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        }
    }

POINT1 AND POINT2 ARE REFERENCING THE EXACT SAME POINT OBJECT IN MEMORY: (POINT 1, 1).
WHEN YOU UPDATE ONE, THE OTHER WILL UPDATE AS WELL.

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;

        System.out.println(point2);  <----- prints   java.awt.Point[x=2,y=1]


REFERENCE TYPES ARE COPIED BY THE REFERENCES, WHEREAS PRIMITIVE TYPES ARE COPIED BY
THEIR VALUE, AND THESE VALUES ARE COMPLETELY INDEPENDENT OF EACH OTHER.

                                --------------    STRINGS   -------------

STRING IS A REFERENCE TYPE, BUT WE DON'T HAVE TO WRITE "NEW" STRING.

INSTEAD OF:
    String message = new String("Hello world");

WE CAN WRITE:
    String message = "Hello world";

TO CONCATENATE YOUR STRING, JUST USE "+" :
    String message = "Hello world" + "!";

WE CAN NOW ACCESS THE MESSAGE STRING USING THE DOT OPERATOR AND APPLY METHODS

EX:
        System.out.println(message.endsWith("!"));    <----- prints out "true"
        System.out.println(message.toUpperCase(Locale.ROOT));     <----- prints out "HELLO WORLD!"
        System.out.println(message.replace("!", ".")); <------- prints Hello world.
        System.out.println(message.trim()); <---- wont do anything now, but trims off any unnecessary white space

        System.out.println(message); <----- still prints out original, unedited message


IN JAVA, STRINGS ARE IMMUTABLE, MEANING WE CAN NOT MUTATE THE ORIGINAL STRING.
WHEN USING A METHOD THAT MODIFIES A STRING, A NEW STRING OBJECT IS ALWAYS RETURNED.




                    -------------------- CONSTANTS   ----------------

A WAY TO KEEP A VARIABLE THE SAME WITHOUT THE ABILITY TO EVER CHANGE (CONSTANT) IN JAVA, IS TO
DEFINE IT USING THE "final" KEYWORD.

EX:

public class Practice {

    public static void main(String[] args) {
        final float pi = 3.14F;

    }
}
                        ----------------   TERNARY    ------------------

CONDITIONAL OPERAND THAT TAKES IN 3 OPERANDS. IT REPLACES THE IF-THEN-ELSE MULTI LINE CODE WITH ONE LINE.

INSTEAD OF:

    int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

WRITE:

    int time = 20;
    String result = (time < 18) ? "Good day." : "Good evening.";
    System.out.println(result);


                        --------------      SCANNERS   ----------------

SCANNER IS A JAVA UTIL PACKAGE, SO WHEN USING SCANNER, MAKE SURE TO IMPORT IT.
SCANNER CAN BE USED TO READ THE INPUT FROM THE USER.
WHEN WRITING OUT SCANNER, WE NEED TO CREATE A NEW SCANNER OBJECT
EX:

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); <---- inside the (),  we specify where we are reading the data from
        }
    }

System.in IS READING THE USER INPUT FROM THE TERMINAL.
NEXT WE SHOULD PROMPT THE USER SO THEY KNOW TO WRITE SOMETHING/WHAT TO WRITE:

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");
        }
    }

THE SCANNER OBJECT HAS A BUNCH OF DIFFERENT METHODS FOR READING DATA, AND ALL THE METHODS START WITH "next".
EX:
    .nextByte()  //reading a byte
    .nextLine() //reading a line
    .nextBoolean() // reading a boolean
    .next()   // read only one token
    .nextLine() //reads the entire input the user entered including white spaces
    .nextLong() //returns the next int token
    .nextFloat() // returns the next token as a float
    etc...
  ****      void close () // closes the scanner


EVERYTIME WE CALL THE NEXT METHOD, IT READS ONE TOKEN. IF WE ONLY USE THE next() METHOD, IT WILL ONLY RETURN THE
FIRST PART OF THE USERS INPUT. AS IN, IF A USER ENTERED THEIR FIRST & LAST NAME, ONLY THE FIRST NAME WOULD BE RETURNED.
IF WE WANT THE USERS ENTIRE INPUT RETURNED, USE THE nextLine() METHOD.
*NOTE: THERE IS ALSO OTHER METHODS THAT ARE USEFUL WHEN READING USERS INPUT, LIKE:
.trim()  // gets rid of users white space before and after

NOW WE CALL THE NEXT METHOD AND STORE THE VALUE IN A VARIABLE:

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");

   //that is the new var ---->  byte userNumber = scanner.nextByte();  <---- that is the call method

        byte userNumber = scanner.nextByte();
        }
    }

NEXT WE CAN USE THE USER INPUT AND APPLY IT TO WHATEVER WE WANT, LIKE A STRING.
THE COMPLETED CODE SHOULD LOOK LIKE:

public class Practice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");
        byte userNumber = scanner.nextByte();
        System.out.println("You entered " + userNumber); <---- this outputs the string plus the users number
        }
    }

IF YOU NEED TO BE ABLE TO READ THE USERS INPUT THAT CONTAINS A DECIMAL:

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");
        byte userNumber = scanner.nextDouble(); <----- changed nextByte() to nextDouble()
        System.out.println("You entered " + userNumber);
        }
    }
                        ---------------- ACCESS MODIFIERS -------------------



                ------------------OBJECT-ORIENTED PROGRAMMING (OOP)------------------------
OOP IS ABOUT CREATING OBJECTS THAT CONTAIN BOTH DATA AND METHODS. IT MAKES IT POSSIBLE TO CREATE FULL REUSABLE
APPLICATIONS WITH LESS CODE AND SHORTER DEVELEOPMENT TIME.


THE 4 CORE CONCEPTS (PILLARS) IN OOP
-ENCAPSULATION
-ABSTRACTION
-INHERITANCE
-POLYMORPHISM

ABSTRACT CLASS: A KEYWORD THAT CAN APPLIED TO BOTH CLASSES AND METHODS WHEN YOU DEFINE THEM.


ABSTRACTION:
ONLY SHOWS THE NECESSARY DETAILS TO THE USER OF THE OBJECT.
AN ABSTRACT CLASS IS A RESTRICTED CLASS THAT CANNOT BE USED TO CREATE OBJECTS, TO ACCESS IT, IT MUST BE
INHERITED FROM ANOTHER CLASS.

EX:

POLYMORPHISM:
THE CAPABILITY OF A METHOD TO DO DIFFERENT THINGS BASED ON THE OBJECT THAT IT IS ACTING UPON.

    class Animal {
      public void animalSound() {
        System.out.println("The animal makes a sound");
      }
    }

    class Pig extends Animal {
      public void animalSound() {
        System.out.println("The pig says: wee wee");
      }
    }

    class Dog extends Animal {
      public void animalSound() {
        System.out.println("The dog says: bow wow");
      }
    }

    class Main {
      public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
      }
    }


POLYMORPHISM -OVERLOADING.
MULTIPLE METHODS, WITH THE SAME NAME, BUT DIFFERENT PARAMETERS.
EX:
        public class Practice {
                public static void main(String[] args) {
                display(1);

                display(1, 4);
                }

        private static void display(int a){
            System.out.println("Arguments: " + a); //PRINT OUT "Arguments: 1"
        }

        private static void display(int a, int b){
            System.out.println("Arguments: " + a + " and " + b); //PRINTS OUT "Arguments: 1 and 4"
        }

    }

POLYMORPHISM -OVERRIDING.
ANOTHER TYPE OF POLYMORPHISM IS OVERRIDING A METHOD. IT DYNAMICALLY BINDS THE METHOD FROM THE SUBCLASS IN RESPONSE TO
A METHOD CALL FROM THE SUBCLASS OBJECT REFERENCED BY THE SUPERCLASS TYPE. THE OVERRIDING METHOD MUST HAVE THE
SAME METHOD SIGNATURE AS THE SUPERCLASS.
IN OTHER WORDS, OVERRIDING REPLACES THE SUPERCLASS FUNCTIONALITY ENTIRELY BY USING THE SAME METHOD NAME AND PARAMETERS.

EX:



INHERITANCE:


ENCAPSULATION:

ENCAPSULATION IS THE PROCESS OF WRAPPING DATA AND METHODS INTO A SINGLE UNIT. THE VARIABLES OF A CLASS WILL BE HIDDEN FROM
OTHER CLASSES, AND CAN BE ACCESSED ONLY THROUGH THE METHODS OF THEIR CURRENT CLASS. IT IS ALSO KNOWN AS DATA HIDING.
MAKE SURE TO SET THOSE CLASSES TO PRIVATE.

EX:
    public class Practice {







                        -------------     ARRAYS     ----------------

TO MAKE AN ARRAY, REMEMBER IT IS A REFERENCE TYPE, SO WE NEED TO USE THE "NEW" OPERATOR.
EX:
    int [] numbers = new int[5]; <----- in the square brackets, we define the length of the array

    numbers[0] = 1;
    numbers[1] = 2;
    numbers[2] = 3;
    numbers[7] = 3; <------ returns an Exception (an error that crashes your program)

    System.out.println(numbers); <----- this is going to return a weird message like [I@548b7f67

THE REASON FOR THE RETURN BEING WEIRD AND NOT THE ITEMS IN THE ARRAY, IS BECAUSE WHEN JAVA RETURNS
A STRING, IT RETURNS THE ADDRESS OF THE STRING WHICH IS CALCULATED BASED ON THE ADDRESS OF THIS OBJECT
IN MEMORY.
IN ORDER TO SEE THE ACTUAL ITEMS IN THE ARRAY, WE NEED TO ACCESS THE CLASS ARRAYS(WHICH HAS A UTIL PACKAGE).

import java.util.Arrays;

THEN WE CAN:
        System.out.println(Arrays.toString(numbers)); <----- will return the string   [1, 2, 3, 0, 0]

THE OTHER NUMBERS RETURNED AS 0'S BECAUSE I LEFT THEM UNDEFINED.
IF I HAD A BOOLEAN ARRAY, ALL ITEMS DEFAULT TO FALSE.
IF I HAD A STRING ARRAY, ALL ITEMS DEFAULT TO AN EMPTY STRING.


YOU CAN ALSO CALL BY INDEX.
EX:
        String[] languages = {"html", "css", "javascript", "java"};

        System.out.println(languages[2]);   <---- prints out javascript



            -----------------   NEWER SYNTAX FOR INITIALIZING AN ARRAY   ---------------

IF YOU ALREADY KNOW THE ITEMS AHEAD OF TIME, YOU CAN WRITE LIKE THIS:

    int [] numbers = {
          3,
          2,
          5,
          4
    };

System.out.println(Arrays.toString(numbers.length))   <----- this will print 4
JAVA ARRAYS HAVE A FIXED LENGTH, WE CAN NOT ADD OR REMOVE ITEMS.

System.out.println(Arrays.sort); <------ prints out [2, 3, 4, 5]


            ---------------   MULTI DIMENSIONAL ARRAYS   ------------

EX:
WE CAN CREATE A 2-DIMENSIONAL ARRAY TO STORE A MATRIX (RECTANGULAR ARRAY) AND A 3-DIMENSIONAL
ARRAY TO STORE DATA FOR A CUBE.


YOU CAN WRITE A 2-DIMENSIONAL ARRAY LIKE THIS:

        int [] [] numbersTwo = new int [2] [3]; <------- 2 ROWS, 3 COLUMNS

        numbersTwo [0] [0] = 1; <------- ACCESSING THE INDEX OF THE ROW AND THE FIRST COLUMN

IF YOU WRITE THE SOUT LIKE THIS:
        System.out.println(Arrays.toString(numbersTwo);    <------ this will print out that weird location again

INSTEAD, WRITE IT LIKE THIS:
        System.out.println(Arrays.deepToString(numbersTwo)); < ------ this will now print out [[1, 0, 0]] , [0, 0, 0]]

"deep" IS USED TO PRINT MULTI-DIMENSIONAL ARRAYS;.



USING THE CURLY BRACE SYNTAX FOR THESE ARRAYS :

        int [] [] numbersTwo = { {1, 2, 3}, {4, 5, 6 } };   <------ this still prints two rows with 3 columns
        System.out.println(Arrays.deepToString(numbersTwo));

******    AN EVEN CLEANER WAY TO WRITE USING CURLY BRACES:

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

                --------------- ITERATING ARRAYS   -------------------
WE CAN USE THE .LENGTH PROPERTY OF AN ARRAY TO HELP US LOOP THROUGH AN ARRAY.

    String[] languages = {"html", "css", "javascript", "java"};

    for (int i = 0; i < languages.length; i += 1) {
        System.out.println(languages[i]);
    }

JAVA DOES PROVIDE AN ENHANCED "FOREACH" LOOP THAT IS USEFUL WHEN WE WANT TO DO SOMETHING FOR
EVERY ITEM IN AN ARRAY:

String[] languages = {"html", "css", "javascript", "java"};

for (String language : languages) {
    System.out.println(language);
}

^^^^^^
PRINTS OUT :
html
css
javascript
java

*/


