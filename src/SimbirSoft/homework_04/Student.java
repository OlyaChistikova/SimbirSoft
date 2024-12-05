package SimbirSoft.homework_04;

import java.util.List;

public class Student {
    private String Name;
    private String Group;
    private int Course;
    private List<Integer> Grades;
    Student(String name, String group, int course, List<Integer> grade){
        Name = name; Group = group; Course = course; Grades = grade;

    }
    public String getName(){
        return Name;
    };
    public int getCourse(){
        return Course;
    }
    public double getAvgGrade(){
        int sum = 0;
        for (int gr : Grades){
            sum+= gr;
        }
        return Grades.isEmpty() ? -1 : (double) sum /Grades.size();
    }
    public void moveToNextCourse(){
        this.Course++;
    }
    public void printInfo(){
        System.out.println("Name: " + Name + ", Group: " + Group + ", Course: " + Course + ", Average grade: " + getAvgGrade());
    }
}
