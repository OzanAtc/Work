package encapsulation;

public class Test {
    public static void main(String[] args) {

        AccountHolder accountHolder = new AccountHolder();

        accountHolder.firstName = "John";
        accountHolder.lastName  = "Doe";
        accountHolder.address = "Chicago";
        accountHolder.phoneNumber = "(312)-000-0000";

        accountHolder.setFirstName("John", "1234");
        System.out.println(accountHolder.getFirstName("5555"));

        accountHolder.setSSN("000-00-0000");
        System.out.println(accountHolder.getSSN()); // null


        System.out.println(accountHolder.getBalance());
        //accountHolder.setBalance("1.5");

        System.out.println(accountHolder.getBalance());
        System.out.println(accountHolder);
    }
}