package HW6;

public class Employee {
    private String lastName;
    private String firstName;
    private String role;
    private double rate;

    public Employee(String Name1, String Name2, String roleJob, double hourRate){
        firstName = Name1;
        lastName = Name2;
        role = roleJob;
        rate = hourRate;
    }

    //getter
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getRole() {
        return role;
    }
    public double getRate() {
        return rate;
    }

    //setter:
    public void setFirstName(String setFirstName){
        firstName = setFirstName;
    }
    public void setLastName(String setLastName){
        lastName = setLastName;
    }
    public void setRole(String setRole){
        role = setRole;
    }
    public void setRate(double setRate){
        rate = setRate;
    }
}
