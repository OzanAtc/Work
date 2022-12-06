package abstraction;

public interface Camera {

    String color = "Black";
    String quality = "";
    void takesPhoto(); // any method you created in interface is abstract method by default already.
    void recordVideo();

    default void method1() {
        System.out.println("This is a default method"); // that's default method, not access modifiers default.
    }

    static void method2() {
        System.out.println("This is a static method");


    }
}
