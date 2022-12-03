package encapsulation;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeClub {
    public static void main(String[] args) {

        /*
        Create 2 companies
        company1 -> Microsoft, Washington,(000) 123-1234
        company2 -> Apple, California,(000) 000-0000
         */

    Company company1 = new Company("Microsoft", "Washington", "(000) 123-1234");
    Company company2 = new Company("Apple", "California", "(000) 000 - 0000");

    Employee emp1 = new Employee("John Doe","Manager", 45, company1);
    Employee emp2 = new Employee("Alex Smith", "Developer", 40,company2);
    Employee emp3 = new Employee("Jane Doe", "Developer", 20,company1);
    Employee emp4 = new Employee("Ryan Smith", "Tester", 22,company1);
    Employee emp5 = new Employee("James Reynold", "Tester", 30,company2);
    Employee emp6 = new Employee("Matt Morgan", "Developer", 40,company1);

    /*
    # employees for Apple -> 2
    # number of employess for Microsoft -> 4
    # total number of managers -> 1
    # number of developers -> 3
    # number of testers -> 2
    # number of developers work in Microsoft -> 2

    Find the youngest developer -> Jane is youngest with age = 20
    Find the oldest employee -> John is the oldest with the age = 45
     */

        Employee[] employees = {emp1,emp2,emp3,emp4,emp5,emp6};

        System.out.println("\n-------- Count Apple and Microsoft employee numbers---------\n");
        int totalAppleEmployee = 0;

        for (Employee employee : employees) {
            if(employee.getCompany().getName().equals("Apple")) totalAppleEmployee++;
        }
        System.out.println(totalAppleEmployee);

        Arrays.stream(employees).filter(e-> e.getCompany().getName().equals("Microsoft")).count();


        System.out.println("\n-------- Count Developer employee number ----------\n");

        int totalDeveloperEmployee = 0;

        for (Employee employee : employees) {
           if(employee.getJobPosition().equals("Developer")) totalDeveloperEmployee++;
        }
        System.out.println(totalDeveloperEmployee);
        Arrays.stream(employees).filter(e -> e.getJobPosition().equals("Developer")).count();

        System.out.println("\n-------- Count Developer employee number for Microsoft ---------\n");

        int devForMicrosoft = 0;

        for (Employee employee : employees) {
            if(employee.getJobPosition().equals("Developer") && employee.getCompany().equals("Microsoft"))
                devForMicrosoft++;
        }
            System.out.println(devForMicrosoft);


        Arrays.stream(employees).filter(e -> e.getCompany().getName().equals("Microsoft") &&
                e.getJobPosition().equals("Developer")).count();

        System.out.println("\n-------- Find the oldest Developer working for Microsoft ----------\n");
        // Matt is the oldest Developer working for Microsoft with the age = 40
/*
        int oldest = Integer.MIN_VALUE;

        for (Employee employee : employees) {
            if(employee.getCompany().getName().equals("Microsoft") && employee.getJobPosition().equals("Developer") && employee.getAge() > oldest);
            oldest = employee.getAge();
        }
       System.out.println("Matt is the oldest Developer working for Microsoft with the age = " + oldest);

 */

        Employee oldestMicrosoftDev = new Employee();

        for (Employee employee : employees) {
            if(employee.getCompany().getName().equals("Microsoft")
                    && employee.getJobPosition().equals("Developer")
                    && employee.getAge() > oldestMicrosoftDev.getAge()) oldestMicrosoftDev = employee;
        }

        System.out.println(oldestMicrosoftDev);

        System.out.println(oldestMicrosoftDev.getFullName().split(" ")[0]
                + " is the oldest "
                + oldestMicrosoftDev.getJobPosition()
                + " working for "
                + oldestMicrosoftDev.getCompany().getName()
                + " with the age = "
                + oldestMicrosoftDev.getAge()
        );


        Employee oldestMicrosoftDeva = Arrays.stream(employees).filter(e -> e.getCompany().getName().equals("Microsoft")
                && e.getJobPosition().equals("Developer")).max(Comparator.comparingInt(Employee::getAge)).get();

    }
}
