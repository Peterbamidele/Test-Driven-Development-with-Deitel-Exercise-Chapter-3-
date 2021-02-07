package InvoiceWithOutTest;

public class Employee {
    private String firstName;
    private  String lastName;
    private double montlysalary;


    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (salary >= 0.0)
        montlysalary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getmontlysalray() {

        return montlysalary;
    }

    public void setmontlysalray(double salary) {

        if (salary >= 0.0)
            montlysalary = salary;
       // this.montlysalray = montlysalray;
    }

}
