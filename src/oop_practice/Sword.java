package oop_practice;

public class Sword {

    // running only ONCE before EVERYTHING
    static {
        System.out.println("Starting the sword making furnace");
    }

    // running everytime when you create object before everything after static code block
    {
        System.out.println("Heating up the furnace"); // Everytime before creating an object you do this.
    }


    // 1. Constructor
    // Default Constructor - then be changed to modified one. Default constructor is gone.
    public Sword(String material) {this.material = material;
    }

    // Modified constructor --- The default constructor would be gone if you used it.
    public Sword(double weight, double length, String name, String material) {
        this(material);
        this.weight = weight; // Assign the value of local variable in the variable
        this.length = length;
        this.name = name;
        this.material = material;
    }

    // 2. Instance variables


    // static ones -> belongs to the class, What does every sword has ?

    public static final boolean hasHandle = true;
    // unchangeable features of the class sword.
    public static boolean isSharp;


    // non-static ones -> belongs to the object, What is changing sword by sword ?

    public double weight;    // these are changes from object to object.. sword to sword
    public double length;
    public String name;
    public String material;

    // 3. Methods -> What does a sword do ?

    // static ones -> belongs to the class, What does every sword do ?
    public static void slash() {
        System.out.println("Sword is slashing");

    }

    public static void damage() {
        if(isSharp) System.out.println("Sword damages more");
        else System.out.println("Sword damages less");
    }
    // non-static ones -> belongs to the object, What does every sword do differently ?
    // weight * length = 2 pounds * 10 inches = 20 p
    public void harms() {
        System.out.println("Sword damages = " + (weight * length));   // How much harms
    }


    @Override
    public String toString() {
        return "Sword{" +
                "weight=" + weight +
                ", length=" + length +
                ", name='" + name + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
