package abstraction;

public class iPhone extends Phone implements Camera, Wifi{

    public iPhone(){};

    public iPhone(int storage, String model, String color, double price) {
        super(storage, model, color, price);
    }

    @Override
    public void call() {
        System.out.println("iPhone way of call");
    }

    @Override
    public void text() {
        System.out.println("iPhone way of call");
    }

    @Override
    public void takesPhoto() {
        System.out.println("iPhone way of taking photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("iPhone way of recording video");
    }

    @Override
    public void connectWifi() {
        System.out.println("iPhone way of Wifi connecting to Wifi");
    }
}
