package Inheritance;

public class Tester extends Person {

    // default constructor
    public Tester() {
    }


    // 2-args constructor
    public Tester(String fName, int age) {
        super(fName, age);
    }

    public Tester(String fName, int age, String DOB) {
        super(fName, age, DOB);
    }

    public Tester(String fName, int age, String DOB, String SSN, boolean isAutomationTester) {
        super(fName, age, DOB, SSN);
        this.isAutomationTester = isAutomationTester;
    }

    public boolean isAutomationTester;

    public void code() {
        System.out.println("Tester codes");
    }

    @Override
    public void eat(String str1) {
        System.out.println("Tester eats");
    }

    @Override
    public void sleep() {
        System.out.println("Tester sleeps");
    }

    // Overload code method
    public void code(String language) {
        System.out.println("Tester codes in " + language + " language");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "fName='" + fName + '\'' +
                ", age=" + age +
                ", DOB='" + DOB + '\'' +
                ", SSN='" + getSSN() + '\'' +
                ", isAutomationTester=" + isAutomationTester +
                '}';

    }

}