package Inheritance;

import java.util.Arrays;

public class TesterClub {
    public static void main(String[] args) {
        FrontEndTester ft1 = new FrontEndTester("Othman", 23,"1993", "000", true);
        BackEndTester bt1 = new BackEndTester("John", 45 ,"1982", "111",false);
        FrontEndTester ft2 = new FrontEndTester("Ozan", 29,"1990", "65200", false);
        BackEndTester bt2 = new BackEndTester("Ozge", 36,"1998", "2222",false);


       Tester[] testers = {ft1, ft2,bt1,bt2}; // when you do tester, it includes everything. This is Polymorphic array

        /*
        Manuel testers = 3
        Automation testers = 1
        Average Age =
         */

        int manualTest = 0;
        int automationTest = 0;
        int sum = 0;
        for (Tester tester : testers) {
            if(!tester.isAutomationTester) manualTest++;
            else automationTest++;

            sum += tester.age;
        }
        System.out.println("Manual Testers = " + manualTest);
        System.out.println("Automation Testers = " + automationTest);
        System.out.println("Average of the age = " + sum / testers.length);


        System.out.println(Arrays.stream(testers).filter(x-> x.isAutomationTester).count());
        System.out.println(Arrays.stream(testers).filter(x-> !x.isAutomationTester).count());

    }
}
