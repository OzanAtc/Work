package class_object;

import java.util.ArrayList;

public class CarTest {

    public static void main(String[] args) {

        Car car1 = new Car("White", "BMW", "X6", 2020, 15000);
        Car car2 = new Car("Black", "Tesla", "S", 2023, 20000);
        Car car3 = new Car("Beige", "Toyota", "Camry", 2018, 10000);
        Car car4 = new Car("Blue", "Tesla", "X", 2021, 13000);
        Car car5 = new Car("Black", "Audi", "A7", 2022, 15000);

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        System.out.println("\n---------- Print Each Car ---------");

        cars.forEach(System.out::println);


        /*
        Find the most expensive car
        Find the cheapest car
        Count how many cars are black
        Remove all the cars that has price more than or equal to 20K
         */

        Car mostExpensiveCar = cars.get(0);

        for (Car car : cars) {
            if(car.price > mostExpensiveCar.price) mostExpensiveCar = car;

        }
        System.out.println(mostExpensiveCar);

        System.out.println("\n------- Cheapest Car---------\n");
            Car mostCheapestCar = cars.get(0);
        for (Car car : cars) {
            if(car.price > mostCheapestCar.price) mostCheapestCar = car;

        }
        System.out.println(mostCheapestCar);

        System.out.println("\n------- Count Black Cars---------\n");

        int count = 0;

        for (Car car : cars) {
            if(car.color.equals("Black"))
                count++;
        }
        System.out.println(count);

        System.out.println("\n---------- Count Black Cars with Stream -----------\n");

        System.out.println(cars.stream().filter(car -> car.color.equals("Black")).count()); // 2
        // be careful not x anymore.. using car for stream filter.

        System.out.println("---------- HOMEWORK -----------");

        /*
        Count all the cars that are blue or beige or 2023

         */

        /*
        Remove all the cars that are Tesla and print the size of the cars
        EXPECTED - 3
         */

        int counter = 0;

        for (Car car : cars) {
            if(car.color.equals("Blue") || car.color.equals("Beige") || car.year == 2023)
            counter++;
        }
        System.out.println(counter);

        cars.removeIf(car -> car.make.equals("Tesla"));
        System.out.println(cars.size());

        }

    }


