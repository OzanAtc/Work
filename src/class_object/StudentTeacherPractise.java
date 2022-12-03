package class_object;

import java.util.ArrayList;
import java.util.List;

public class StudentTeacherPractise {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("John", "Doe");
        Teacher teacher2 = new Teacher("Alex", "Morgan");

        // Print all the students name for the Teacher John
        // Expected Output : Mike and Jane

        System.out.println(teacher1.getStudents()); // [] empty arrayList

        Student student1 = new Student("Mike", "Smith", 25);
        Student student2 = new Student("Jane", "Smith", 30);
        Student student3 = new Student("A", "X", 17);
        Student student4 = new Student("B", "Y", 19);
        Student student5 = new Student("C", "Z", 21);


        teacher1.addStudent(student1);
        teacher1.addStudent(student2);
        teacher2.addStudent(student3);
        teacher2.addStudent(student4);
        teacher2.addStudent(student5);

        /*
        Find the average age of the students of Alex
         */

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);

        for (Student s : teacher1.getStudents()) {
            System.out.println(s.firstName); // Mike and Jane name will be given.
        }


        int sumOfAges = 0;
        int totalStudents = 0;

        for (Teacher teacher : teachers) {
            if(teacher.fName.equals("Alex")) {
                totalStudents = teacher.getStudents().size();
                for (Student student : teacher.getStudents()) {
                    sumOfAges += student.age;
                }
            }

        }
        System.out.println(sumOfAges / totalStudents);
      //  System.out.println(teacher1.getStudents()); // I have collections of 2 students.

    }
}
