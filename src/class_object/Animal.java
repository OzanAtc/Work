package class_object;

public class Animal {

    // Create a constructor that takes 2 args -> name and age

    public Animal() {}

    public Animal(String name, int age) {
        System.out.println("This is 2-args constructor");

        this.name = name;
        this.age = age;


    }

    public Animal(String name, int age, boolean isCarnivore, boolean isHerbivore, boolean isOmnivore) {
        System.out.println("This is 5-args constructor");
        this.name = name;
        this.age = age;
        this.isCarnivore = isCarnivore;
        this.isHerbivore = isHerbivore;
        this.isOmnivore = isOmnivore;
    }

    // Create a constructor that takes 5 args
    public static boolean isExtinct = true; // When you add final, the value can not be changed. public static final boolean
    public String name;
    public int age;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;

    {
        isCarnivore = true; // This is initizilation of block.
    }

// Execute the code below whenever an Animal object is garbage collected
    // You will override finalize() method if you would like to execute a block of code right after your object is destroyed.
    @Override
    protected void finalize() throws Throwable {
        System.out.println(getClass().getName() + this.name + "An Animal object is destroyed");
    }
    @Override
    public String toString() {


        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isCarnivore=" + isCarnivore +
                ", isHerbivore=" + isHerbivore +
                ", isOmnivore=" + isOmnivore +
                '}';
    }

    public static void main(String[] args) {

        Animal a1 = new Animal();
        Animal a2 = new Animal("Dog", 3 );
        Animal a3 = new Animal("Cow", 5 );
        Animal a4 = new Animal("Cat", 1);
        Animal a5 = new Animal("Tiger", 10, true, false, false );
        Animal a6 = new Animal("Cow", 5 ,false, true, false );
        Animal a7 = new Animal("Cat", 2 ,false, false, true );



        System.out.println("\n-------- Printing objects ----------\n");
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);

        System.out.println("\n-------- static instance variables -----------\n");
        System.out.println(Animal.isExtinct); // true

        System.out.println(Integer.MAX_VALUE); // Universal numbers that can't be changed.
        System.out.println(Integer.MIN_VALUE);



        Animal.isExtinct = false;
        System.out.println(Animal.isExtinct); // false.

    //    System.out.println(a2.name);
     //   System.out.println(a2.age);


    }
}


