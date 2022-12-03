package class_object;

public class Apple {

    // default constructor is provided by JAVA to create zero argument, object.
    public Apple() { // This constructor will help to create object on the other classes.

        // Each time you created a new object, this block will be executed.

        // STEP 1 - is creating your empty constructor

        // instance variables - fields - states - attributes
    }
public String color = "Red";// null         ** STEP 2, Creating your instance variables
    public double price; // 0.0
    public String taste; // null



    @Override
    public String toString() {  // toString method changes the behaviour. We're getting the values instead of location. If we delete them, we still see the locations.
        return "Apple{" +
                "color='" + color + '\'' +
                ", price=" + price + ", taste='" + taste + '\'' +
                '}';
    }

//Overloading constructor with 3 args
    public Apple(String color, double price, String taste) {
        this.color = color;
        this.price = price;
        this.taste = taste;
    }


}
