package package1;

public class BMW {

    // make, model, year, price

    public String make;
    protected String model;
    int year;
    private double price;

    private void privateMethod(){

    }

    void defaultMethod() {

    }
    protected void protectedMethod() {

    }

    public void publicMethod() {

    }
// which one is accessible in the same class
    public static void main(String[] args) {
        BMW b1 = new BMW();
        System.out.println(b1); // each one of them is accessible.
    }
}
