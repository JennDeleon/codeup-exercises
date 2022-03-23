package grades;
import util.Input;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student Jennifer = new Student("Jennifer");
        Jennifer.addGrade(getRandomGrade());
        Jennifer.addGrade(getRandomGrade());
        Jennifer.addGrade(getRandomGrade());
        Jennifer.addGrade(getRandomGrade());

        Student Barbie = new Student("Barbie");
        Barbie.addGrade(getRandomGrade());
        Barbie.addGrade(getRandomGrade());
        Barbie.addGrade(getRandomGrade());
        Barbie.addGrade(getRandomGrade());

        Student Dog = new Student("Dog");
        Dog.addGrade(getRandomGrade());
        Dog.addGrade(getRandomGrade());
        Dog.addGrade(getRandomGrade());
        Dog.addGrade(getRandomGrade());

        Student Cat = new Student("Cat");
        Cat.addGrade(getRandomGrade());
        Cat.addGrade(getRandomGrade());
        Cat.addGrade(getRandomGrade());
        Cat.addGrade(getRandomGrade());

        students.put("jennGitHub", Jennifer);
        students.put("barbieGitHub", Barbie);
        students.put("dogGitHub", Dog);
        students.put("catGitHub", Cat);

        Scanner scanner = new Scanner(System.in);
        Input input = new Input();
        whichStudent(students, scanner, input);
    }

    public static int getRandomGrade() {
        return 50 + (int)(Math.random() * ((100 - 50) + 1));
    }

    public static void whichStudent(HashMap<String, Student> students, Scanner sc, Input input) {
        System.out.println("Which student username?");
        boolean anotherStudent = true;

        do {
            printKeys(students);
            System.out.println("Who would you like to see more information on?");
            String userInput = sc.nextLine();

            userNameID(students, userInput);

            anotherStudent = input.yesNo("Would you like to  another student? Enter yes or no \n");

            if (!anotherStudent) {
                System.out.println("Done");
            } else {
                System.out.println("No student found with that username.");
            }
        } while(anotherStudent);
    }

    public static void printKeys(HashMap<String, Student> students) {
        for (String key: students.keySet()) {
            System.out.print(" " + key + " ");
        }
        System.out.println();
    }

    public static void userNameID(HashMap<String, Student> students, String userInput) {
        if (students.containsKey(userInput)) {
            Student currentStudent = students.get(userInput);
            System.out.println("Name: " + currentStudent.getName() + " - GitHub username: " + userInput);
            System.out.println("Average: " + currentStudent.getGradeAverage());
        } else {
            System.out.println("There is no one with the username of " + userInput);
        }
    }
}
