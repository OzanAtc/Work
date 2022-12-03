package class_object;

public class AppleTest {

    public static void main(String[] args) {
        Apple apple1 = new Apple(); // Apple() knows as constructor. //
        Apple apple2 = new Apple();

        System.out.println(apple1); // class_object.Apple@154.. They show the location of apple
        System.out.println(apple2); // class_object.Apple@677.. Shows the location.

        System.out.println(apple1.color); // Red
        System.out.println(apple1.price);
        System.out.println(apple1.taste);

        System.out.println("------- Apple 2 --------");

        apple2.color = "Green";
        apple2.price = 0.75;
        apple2.taste = "sour";
        System.out.println(apple2.color); // Green

    }
}
