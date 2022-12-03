package encapsulation;

public class AccountHolder {

    String firstName;
    String lastName;
    String address;
    String phoneNumber;
   private String SSN; // it's not accessible by another class.


    public String getFirstName(String passcode) {
        if(passcode.equals("1234")) return firstName;
        else return null;
    }

    public void setFirstName(String firstName, String passcode) {
        if(passcode.equals("1234")) this.firstName = firstName;
        else {
            this.firstName = null;
            System.out.println("The passcode you provided is wrong");
        }
        }

    /*
    Create an double balance instance variable and encapsulate it
     */

    private double balance; // if no get, no one is able to get or set no one is able to set the value.


    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getSSN() {
        return this.SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
    @Override
    public String toString() {
        return "AccountHolder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", SSN='" + SSN + '\'' +
                '}';
    }
}
