package mutable_immutable;

public class ReverseString {

    /*
    Write a method that takes a String and returns it back reversed.

    Hello -> olleH
    Java -> avaJ
    "" -> ""
    a -> a  // one letter is edge case
    1234 -> 4321
    Good morning -> gninrom dooG
     */

    public static String reserveString(String str) {

        StringBuilder results = new StringBuilder(str);
        results.reverse();
        return results.toString();
    }

    // return new StringBuilder(str).reverse().toString();  --- Shortest way of the up one.


    public static boolean isPalindrome(String str) {
      // return new StringBuilder(str).reverse().toString().equals(str);
       return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(reserveString("Hello"));
        System.out.println(reserveString("Java"));
        System.out.println(reserveString(""));
        System.out.println(reserveString("a"));
        System.out.println(reserveString("1234"));
        System.out.println(reserveString("Good morning"));

        System.out.println(isPalindrome("civic"));
        System.out.println(isPalindrome("madam"));

    }
}
