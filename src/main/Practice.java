package main;
import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Practice {

    public static void main(String[] args) {

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        String message = "Hello world" + "!";


        int youtubeViews = 123_456_789;
        Date today =  new Date();
        today.getTime();

        int [] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        System.out.println("HELLO, IM LIKE A CONSOLE.LOG, BUT I PRINT IN THE TERMINAL");
        System.out.println(youtubeViews);

        System.out.println(today);

        System.out.println(point2);

        System.out.println(message);
        System.out.println(message.endsWith("!"));
        System.out.println(message.toUpperCase(Locale.ROOT));
        System.out.println(message.replace("!", "."));
        System.out.println(message);

        System.out.println(Arrays.toString(numbers));



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
DOUBLE                8
----------------------------------------------------
CHAR                  2            STORES SINGLE CHARACTER EX A, B, C
                                    SUPPORTS INTERNATIONAL LETTERS
----------------------------------------------------
BOOLEAN               1                TRUE/FALSE



IF YOU ARE WORRIED ABOUT THE AMOUNT OF MEMORY YOUR CODE WILL TAKE UP, LOOK AT THE BYTES THAT WILL BE USED
EX INT WILL TAKE 4 BYTES & HAS LARGER RANGE, BUT BYTE ONLY TAKES UP 1 BYTE, SO YOU CAN USE
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
YOU CAN USE UPPER OF LOWER CASE.

SIMILARLY, WHEN USING FLOAT, BE SURE TO USE A F AT THE END. UPPER OR LOWERCASE.


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


IN JAVA, STRINGS ARE IMMUTABLE, WE CAN NOT MUTATE THE ORIGINAL STRING.
WHEN USING A METHOD THAT MODIFIES A STRING, A NEW STRING OBJECT IS ALWAYS RETURNED.

                    --------------     ESCAPE SEQUENCES       --------------

"\" HELPS YOU WITH ADDING DOUBLE QUOTES IN STRINGS:

EX:

String message = "Hello \"user\""; <-------- this will print out     Hello "user"

TO AVOID ESCAPING THE DOUBLE QUOTE WHEN WORKING WITH BACKSLASHES:

String message = "Here's a \\"; <------ prints out     Here's a \

\n IS AN ESCAPE SEQUENCE USED TO ADD A NEW LINE
\t TO ADD TABS

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



*/


