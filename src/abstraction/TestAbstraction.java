package abstraction;

public class TestAbstraction {
    public static void main(String[] args) {

        // Phone.call(); abstract methods can not be static.
        /*
        Abstract class can not be instantiated - cannot have objects.
         */

        Samsung s1 = new Samsung();
        s1.call();
        s1.text();

        iPhone i1 = new iPhone();
        i1.call();
        i1.text();

        Samsung s2 = new Samsung(64, "Galaxy S20","Black",700);
        iPhone i2 = new iPhone(67, "iphone 11","Grey", 900);

        System.out.println(s2);
        System.out.println(i2);

        s2.takesPhoto();
        s2.recordVideo();
        i1.takesPhoto();
        i2.recordVideo();



    }
}
