package package2;

import package1.BMW;
import package1.Honda_Package1;

public class TestPackage2 {
    public static void main(String[] args) {
        Honda_Package1 h1 = new Honda_Package1();
        System.out.println(h1); // when you're in package 2, it's being imported automatically.

      //  Tesla t1 = new Tesla(); // can not be access as it is default class

        BMW b1 = new BMW();

    }
}
