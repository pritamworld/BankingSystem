package person;

public class Employee extends Person {

    private String designation;
    private float salary;
    private String username;
    private String password;
    private String bankBranch;

    public Employee() {
    }

    public Employee(String designation, float salary, String username, String password, String bankBranch) {
        this.designation = designation;
        this.salary = salary;
        this.username = username;
        this.password = password;
        this.bankBranch = bankBranch;
    }

    public Employee(String personId, String personName, String address, String birthDate, String contactNumber, String emailId, String designation, float salary, String username, String password, String bankBranch) {
        super(personId, personName, address, birthDate, contactNumber, emailId);
        this.designation = designation;
        this.salary = salary;
        this.username = username;
        this.password = password;
        this.bankBranch = bankBranch;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }
}
