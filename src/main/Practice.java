
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



 */

package main;

public class Practice {

    public static void main(String[] args) {

        int youtubeViews = 123_456_789;

        System.out.println("HELLO, IM LIKE A CONSOLE.LOG, BUT I PRINT IN THE TERMINAL");
        System.out.println(youtubeViews);
    }

}

/*

JAVA VARIABLES ARE DEFINED BY TYPE SIMPLY BY JUST WRITING OUT THE TYPE:
STRING
INT
DOUBLE (used for decimals)
CHAR
BOOLEAN

EX:
int yourAge = 100;
String greeting = "hello";

----------------   PRIMITIVE AND REFERENCE TYPES     -------------------
PRIMITIVE TYPES STORE SIMPLE VALUES:
THE MORE BYTES WE HAVE, THE LARGER NUMBER WE CAN STORE

TYPE       |        BYTES        |    RANGE

BYTE       |           1             [-128, 127]
----------------------------------------------------
SHORT      |           2             [-32K, 32K]
----------------------------------------------------
INT        |           4             [-2B, 2B]
----------------------------------------------------
LONG       |           8
----------------------------------------------------
FLOAT      |           4
----------------------------------------------------
DOUBLE     |           8
----------------------------------------------------
CHAR       |           2            STORES SINGLE CHARACTER EX A, B, C
                                    SUPPORTS INTERNATIONAL LETTERS
----------------------------------------------------
BOOLEAN    |           1                TRUE/FALSE


IF YOU ARE WORRIED ABOUT THE AMOUNT OF MEMORY YOUR CODE WILL TAKE UP, LOOK AT THE BYTES THAT WILL BE USED
EX INT WILL TAKE 4 BYTES & HAS LARGER RANGE, BUT BYTE ONLY TAKES UP 1 BYTE, SO YOU CAN USE
BYTE INSTEAD OF INT WHEN WORKING WITH VERY SMALL NUMBERS (BETWEEN -128 & 127).

EX:
byte age = 100;
int youtubeViews = 123456789

IF YOU WANT YOUR NUMBERS TO BE MORE READABLE, YOU CAN SEPARATE YOUR NUMBERS BY UNDERSCORE
EVERY 3 NUMBERS IN JAVA

int youtubeViews = 123_456_789


*/
