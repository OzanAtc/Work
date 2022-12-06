package examplesOOP;

public class Tiger extends Animal{


    public Tiger(String name, int age, boolean isHerbivore, boolean isOmnivore, boolean isCarnivore) {
        super(name, age, isHerbivore, isOmnivore, isCarnivore);
    }

        @Override
    public void eat() {
            System.out.println("Tiger sleeps");
}

        @Override
    public void eats(String food) {
            System.out.println("Tiger eats " + food);
        }

        @Override
    public void sleeps() {
            System.out.println("Tiger sleeps");
        }


    public static void main(String[] args) {

        Tiger tiger1 = new Tiger("Ozzy", 32, false, false,true);
        System.out.println(tiger1);

        tiger1.eat();
        tiger1.eats("meat");
        tiger1.sleeps();
    }
}
