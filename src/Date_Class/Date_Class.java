package Date_Class;

import java.util.Random;

public class Date_Class {

    public Random scanner;
    private int month = 12;
    private int day =31;
    private int year;

    public Date_Class(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;

    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getmonth() {
        return month;
    }
    public int getday() {
        return day;
    }

    public int getyear() {
        return year;
    }

}
