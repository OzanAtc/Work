package java_memory_management;

import class_object.Animal;

public class UnderstandingGarbageCollection {
    public static void main(String[] args) {

        Animal a1 = new Animal("Cow",5);
        Animal a2 = new Animal("Dog",3);
        Animal a3 = new Animal("Cat",1);

        a1 = a2; // a1 is gone, garbage collection - Cow object is destroyed
        a3 = null; // the other way is to destroy the object in heap. - Cat object is destroyed.

        // either you reassign variables or you give null value to your object

        // Explicitly invoking Garbage Collection
        System.gc();
        Runtime.getRuntime().gc(); // You can use either one of them to apply to Garbage collection.


        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
