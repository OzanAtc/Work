package polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {

        Animal a1 = new Animal();

        a1.eat();
        a1.eat("Meat");
        a1.sleep();

        Cat c1 = new Cat();

        c1.eat();
        c1.eat("Fish");
        c1.sleep();
        c1.meow();

        Dog d1 = new Dog();
        d1.eat();
        d1.eat("Bone");
        d1.sleep();
        d1.bark();

         /*
    Up-Casting
    left side parent reference = child object.
     */

        System.out.println("\n---------- Up Casting / implicitly-----------\n");
        Animal a2 = new Cat(); // child cat in the shape of Animal --
        Animal a3 = new Dog();

        a3.sleep(); // Compiler thinks animal sleeps, not the object we created DOG. It inherits from there.
                            // Dog sleeps comes out of it.


        System.out.println("\n----------- Down Casting / explicitly ---------\n");

      //  Cat cat = (Cat) new Animal(); // bad example of down- casting -> ClassCastException

        Animal myDog = new Dog(); // up-casting
        Dog newDog = (Dog) myDog;

        newDog.bark();

        Animal a10 = new Cat();
        Animal a11 = a10;
        Cat c10 = new Cat(); // all of three references are pointing out to the same object. The latest object will be garbage collection.
        c10 = (Cat) a10;
    }
}
