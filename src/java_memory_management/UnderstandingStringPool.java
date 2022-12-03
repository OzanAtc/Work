package java_memory_management;

import class_object.Car;

public class UnderstandingStringPool {
    public static void main(String[] args) {

        String name1 = "John";
        String name2 = "Alex";
        String name3 = "John";
        String name4 = "John";
        String name5 = "JOHN";

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);

        // Create String as a new object
        String name6 = new String("John");
        //you can mention that you want it to be seen as object. not like the others in String pool

       // name1, name3, name4 and name6 having value of "John"

        System.out.println(name1 == name3); // true, but they're pointing out to the location equality, not the equality of the value John
        System.out.println(name1 == name6); // false
        System.out.println(name1.equals(name6)); // true

        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1 == car2); // Their locations are different in the heap as objects. That's why false
        System.out.println(car1.equals(car2)); // if you can't assign local variables located in Stack, you get false.. if you do, they will directly point out to the same object in heap and this give true;e.



    }
}
