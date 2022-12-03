package studentpractice;

public class Lesson {


    public Lesson(String mathLesson,String englishLesson, String turkishLesson) {
        this.mathLesson = mathLesson;
        this.englishLesson = englishLesson;
        this.turkishLesson = turkishLesson;
        Student.addStudent();
    }

    public String mathLesson;
    public String englishLesson;
    public String turkishLesson;

}
