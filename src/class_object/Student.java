package class_object;

public class Student {

    public Student() {}

    // Define public instance variables of Student class as below
    // firstName, lastName, age
    // Create a constructor


    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        addStudent();
    }

    public static int numberOfStudents = 0;
    public static final String program = "Software Engineer in Test Program";

    public String firstName;
    public String lastName;
    public int age;


    public void study() {
        System.out.println(this.firstName + " studies");

    }

    public void rests() {
        System.out.println(this.firstName + " " + this.lastName + " have a rest");
    }

    public static void addStudent() {
        numberOfStudents++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}


