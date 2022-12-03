package class_object;

public class Fruit {

    public static int numberOfFruits = 0;
    public static boolean hasColor;
    public boolean isSweet;
    public String name;
    public String shape;

    // Instance block is executed for each object being created
    {
        if(this.name.equals("Watermelon")) isSweet= true;
        System.out.println("This is an instance block");

        System.out.println("A new object of Fruit is created");
        numberOfFruits++;
   // ?     System.out.println("So far, you created" + numberOfFruits);
    }

    // Static block is executed only once and before everything else in the same class
        static {
        hasColor = true;
            System.out.println("This is a static block");
        }
////////// INterview question.. Is there any code to be executed before static block
}
