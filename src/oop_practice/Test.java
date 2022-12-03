package oop_practice;

public class Test {
    public static void main(String[] args) {
        // Data type is sword

        System.out.println("\nSword1 is created after this line:\n");
        Sword sword = new Sword("Iron"); // -> default constructor -< Turned to Modified one.
        System.out.println(" Printing out the sword1 = " + sword);

        System.out.println("\nSword2 is created after this line:\n");
        Sword sword2 = new Sword(3.5, 15.0, "long sword", ""); // comes from -> Modified constructor.
        System.out.println(" Printing out the sword2 = " + sword2);

        System.out.println("\nSword3 is created after this line:\n");
        Sword sword3 = new Sword(10, 25.0, "super long sword", "Titanium"); // comes from -> Modified constructor.
        System.out.println(" Printing out the sword3 = " + sword3);

        System.out.println("\n ------- Working with static values ---------\n");

        System.out.println("hasHandle = " + Sword.hasHandle);
        System.out.println("isSharp before = " + Sword.isSharp); // default value
        // final values can't be changed


        Sword.isSharp = true;
        System.out.println("isSharp after = " + Sword.isSharp); // reassigned value = true
        Sword.damage();

        Sword.slash();
        System.out.println("\n ------ Working with non static methods -----\n");

        sword.harms();  // 0.0
        sword2.harms();  // 3.5 * 15 = 52.5
        sword3.harms(); // 10 * 25 = 250.0
    }
}
