package abstraction;

public class Samsung extends Phone implements Camera, Wifi{

    public Samsung(){};

    public Samsung(int storage, String model, String color, double price) {
        super(storage, model, color, price);
    }

    @Override
    public void call() {
        System.out.println("Samsung way of call");
    }

    @Override
    public void text() {
        System.out.println("Samsung way of text");
    }

    @Override
    public void takesPhoto() {
        System.out.println("Samsung way of taking photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("Samsung way of recording video");
    }

    @Override
    public void connectWifi() {
        System.out.println("Samsung way of connecting to Wifi");
    }
}
