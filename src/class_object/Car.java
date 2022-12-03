package class_object;

public class Car {

    // default constructor

    public Car() {

    }

    // Create a 5 args overloaded constructor
    // instance variables


    public Car(String color, String make, String model, int year, double price) {
        this.color = color;
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String color;
    public String make;
    public String model;
    public int year;
    public double price;

// Override toString() method


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
