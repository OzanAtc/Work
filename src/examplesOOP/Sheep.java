package examplesOOP;

import javax.imageio.stream.ImageInputStream;

public class Sheep extends Animal {


    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void eats(String food) {
        System.out.println("Sheep eats");
    }

    @Override
    public void sleeps() {
        System.out.println("Sheep sleeps");
    }

    public Sheep(String name, int age, boolean isHerbivore, boolean isOmnivore, boolean isCarnivore) {
        super(name, age, isHerbivore, isOmnivore, isCarnivore);
    }


    public static void main(String[] args){

        Animal animal1 = new Sheep("Asya", 99, true, false, false);
        System.out.println(animal1);
        animal1.eats("Baklava");
        animal1.sleeps();






    }
}
