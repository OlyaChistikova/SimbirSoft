package SimbirSoft.homework_04;

import java.util.Iterator;
import java.util.List;

public class University {
    public static void deleteLowAvgGradeStudent(List<Student> students){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getAvgGrade() < 3){
                iterator.remove();
            }
        }
        //students.removeIf(student -> student.getAvgGrade() < 3);
    }
    public static void moveStudentToUpperCourse(List<Student> students){
        for (Student student: students){
            if (student.getAvgGrade() >= 3){
                student.moveToNextCourse();
            }
        }
    }
    public static void printStudents(List<Student> students, int course){
        for (Student student : students){
            if (student.getCourse() == course){
                student.printInfo();
            }
        }
    }
}
