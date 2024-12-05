package SimbirSoft.homework_04;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student john = new Student("John", "Group-24-01", 1, List.of(3, 2, 4, 4, 5, 3));
        students.add(john);
        students.add(new Student("Sasha", "Group-24-02", 1, List.of(5, 5, 4, 5, 5, 4)));
        students.add(new Student("Ann", "Group-22-02", 3, List.of(5, 3, 4, 5, 4, 4)));
        students.add(new Student("Kesha", "Group-21-02", 4, List.of(3, 3, 4, 2, 3, 2)));
        students.add(new Student("NoName", "Group-00-00", 0, List.of()));
        System.out.println("Все студенты: ");
        for (Student st : students){
            st.printInfo();
        }
        System.out.println("Количество студентов: " + students.size());
        System.out.println();
        System.out.println("Удаляем студентов с низким средним баллом и выводим новый список студентов: ");
        University.deleteLowAvgGradeStudent(students);
        for (Student st : students){
            st.printInfo();
        }
        System.out.println("Количество студентов: " + students.size());
        System.out.println();

        System.out.println("Переводим оставшихся студентов на курс выше");
        University.moveStudentToUpperCourse(students);
        System.out.println("Выводим новый список: ");
        for (Student st : students){
            st.printInfo();
        }
        System.out.println();
        System.out.println("Студенты, обучающиеся на 2 курсе: ");
        University.printStudents(students, 2);
    }
}
