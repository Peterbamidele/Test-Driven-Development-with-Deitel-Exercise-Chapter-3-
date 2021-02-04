package Date_Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Date_Class date_class = new Date_Class(8,23,2021);
        System.out.println("Welcome To Today: " + " Month " + " Day " + " Year ");

        System.out.println("Enter the Month:");
        date_class.setMonth(scanner.nextInt());

        System.out.println("Enter the Day:");
        date_class.setDay(scanner.nextInt());

        System.out.println("Enter the Year:");
        date_class.setYear(scanner.nextInt());

    System.out.print(" Month: " +  date_class.getmonth() + "/" + " Day: "  + date_class.getday() +  "/" + " Year: " +  date_class.getyear());

    }
}
