package class_object;

import java.util.Arrays;

public class Apple_Exercise {

    /*
    Create 3 apple objects with below info

    apple1
    Red
    0.5
    Sweet

    apple2
    Yellow
    0.75
    Sweet

    apple3
    Green
    1.0
    Sour

    Print all the objects.


     */

    public static void main(String[] args) {

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        apple1.color = "Red";
        apple1.price = 0.5;
        apple1.taste = "Sweet";

        apple2.color = "Yellow";
        apple2.price = 0.75;
        apple2.taste = "Sweet";

        apple3.color = "Green";
        apple3.price = 1.0;
        apple3.taste = "Sour";

        System.out.println(apple1);
        System.out.println(apple2);
        System.out.println(apple3);


        /*
        Count how many apple objects are Sweet
        EXPECTED = 2
         */

        // Store your apples in an array

        Apple[] apples = {apple1, apple2, apple3};

        System.out.println(Arrays.toString(apples));
        System.out.println(apples.length); // 3
        System.out.println(apples[1]); //
        System.out.println(apples[2].taste); //

        int count = 0;
        for (Apple apple : apples) {
            if(apple.taste.equals("Sweet")) count++;

        }
        System.out.println(count);


        System.out.println("\n----------- TASK 2 ----------\n");

        /*
        Create 5 apple objects with 3 args constructor
        a1 -> Yellow, 0.5, Sour
        a2 -> Red

        */

    Apple a1 = new Apple("Yellow",0.5,"Sour");
    Apple a2 = new Apple("Red", 0.75,"Sour");
    Apple a3 = new Apple("Green", 0.5,"Sour");
    Apple a4 = new Apple("Yellow", 1.0,"Sweet");
    Apple a5 = new Apple("Yellow", 1.5,"Sweet");

        Apple[] arr = {a1,a2,a3,a4,a5};

        for (Apple apple : arr) {
            System.out.println(apple);

            System.out.println("\n--------- Retrieve each info for each apple object and print it------\n");

            for (Apple apple4 : arr) {

                System.out.println(apple.color);
                System.out.println(apple.price);
                System.out.println(apple.taste);

            }
        }

    }

    }

