package InvoiceWithOutTest;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee1 =new Employee("Toyin","Ogunmarakin",40000);
        Employee employee = new Employee("Peter " ,"Bamidele",75000);

        System.out.println("MonthlySalary For Employee 1");
        System.out.printf("FirstName :%s%n",employee1.getFirstName());
        System.out.printf("LastName :%s%n",employee1.getLastName());
        System.out.printf("MonthlySalary :%2f",employee1.getmontlysalray() * 1.10);

        System.out.println();

        System.out.println("MonthlySalary For Employee 2");
        System.out.printf("FirstName :%s%n",employee.getFirstName());
        System.out.printf("LastName :%s%n",employee.getLastName());
        System.out.printf("MonthlySalary :%2f",employee.getmontlysalray() * 1.10);

        System.out.println();

        Scanner input = new Scanner(System.in);
        
        System.out.print("ENTER EMPLOYEE FIRSTNAME:");
        employee.setFirstName(input.nextLine());

        System.out.print("ENTER EMPLOYEE LASTNAME:");
        employee.setLastName(input.nextLine());

        System.out.print("ENTER EMPLOYEE SALARY:");
        employee.setmontlysalray(input.nextDouble());




        System.out.println("\nFirstName : " +   employee.getFirstName() +  "\n" + "LastName : " + employee.getLastName() +  "\n" + "MonthSalary :" + employee.getmontlysalray() + "\n" + "\t" + "INCREASED EMPLOYEE SALARY By 10% :" + employee.getmontlysalray() * 1.10);


       




    }
}
