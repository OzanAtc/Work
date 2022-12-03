package studentpractice;

public class Student {

    // modified constructor

    public Student(String fullName, String favouriteLesson, String gender) {
        this.fullName = fullName;
        this.favouriteLesson = favouriteLesson;
        this.gender = gender;
    }

    // static instance variables

    public static int numberOfStudents;
    public static int numberOfMathLovers;
    public static int numberOfEnglishLovers;

    // non - static instance variables

    public String fullName;
    public String favouriteLesson;
    public String gender;


    // methods

    public static void addStudent() {
        numberOfStudents++;
    }

    public static void addMathLovers() {
        numberOfMathLovers++;
    }

    public static void addEnglishLover() {
        numberOfEnglishLovers++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", favouriteLesson='" + favouriteLesson + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
