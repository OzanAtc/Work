package mutable_immutable;

public class UnderstandingMutability {
    public static void main(String[] args) {
        String city = "Chicago";

        city = "Miami"; // Chicago stays in the heap. Why does it stay ?
        // program thinks that Chicago will be used for another variable created later.

        String address = "Chicago"; // There might be another chance another variable would be pointed out to Chicago, just like in the example until your program ends.

    }
}
