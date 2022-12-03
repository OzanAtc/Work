package Inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Alex", 25);
        Person p3 = new Person("John", 35, "10/10/2000");
        Person p4 = new Person("Jane", 35, "10/10/2000", "111-00-0000");

        Tester t1 = new Tester(); // constructor needs to be created in that inheritance as well to create object.
        Tester t2 = new Tester();

      //  p1.eat(); - Person eats
      //  t1.eat(); - Person eats

        p1.sleep(); // Person sleeps
        t1.sleep(); // Person sleeps
    }
}
