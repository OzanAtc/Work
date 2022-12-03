package encapsulation;

public class Employee {

    public Employee() {}

    public Employee(String fullName, String jobPosition, int age, Company company) {
        this.setFullName(fullName);
        this.setJobPosition(jobPosition);
        this.setAge(age);
        this.setCompany(company);
    }

    private String fullName;
    private String jobPosition;
    private int age;
    private Company company;

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + getFullName() + '\'' +
                ", jobPosition='" + getJobPosition() + '\'' +
                ", age=" + getAge() +
                ", company=" + getCompany() +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
