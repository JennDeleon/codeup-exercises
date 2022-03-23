package grades;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

//        int [] grades = {};
//    for (int i = 0; i < languages.length; i += 1) {
//        System.out.println(languages[i]);
public Student(String name) {
    this.name = name;
    this.grades = new ArrayList<>();
}

    public String getName(){
        return name;
    }

    public void addGrade(int grade){
    this.grades.add(grade);
    }
//    String[] languages = {"html", "css", "javascript", "java"};
//
//    for (int i = 0; i < languages.length; i += 1) {
//        System.out.println(languages[i]);
//    }

    public double getGradeAverage(){
        double total = 0;
        for (int grade: grades){
            total += grade;
        } return total/grades.size();
    }

}
