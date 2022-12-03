package mutable_immutable;

public class Practice_StringBuilder {
    public static void main(String[] args) {

        StringBuilder city = new StringBuilder("Chicago"); // it's created by new keyword.. will take a place in the heap in a container.

        System.out.println(city);

        city = new StringBuilder("Miami"); // city will be pointed out to Miami, and Chicago is lost.

        String name = "Alex";
        name += "ander";
        System.out.println(name); // Alexander comes out with String concetination. Alex and ander two value and Alexander. But alex and ander will not be deleted.

        city.append("xxx");
        System.out.println(city); //Miamixxx

        // String never changes old values stay in the heap, that's not changeble -> StringBuffer is immutable
        // StringBuilder -> mutable

    }
}
