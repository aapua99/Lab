package ua.lviv.iot.andriy.model;

public class Date {


    private int day;
    private int month;
    private int year;

    public Date(final int day, final int month, final int year) throws DateException {
        if(month>12){
            throw new DateException();
        }
        if(day>31){
            throw new DateException();
        }
        if(year<2018){
            throw  new DateException();
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public final String toString(){
        return String.valueOf(day)+"."+String.valueOf(month)+"."+String.valueOf(year);
    }

    public final int getDay() {
        return day;
    }

    public final void setDay(final int day) {
        this.day = day;
    }

    public final int getMonth() {
        return month;
    }

    public final void setMonth(final int month) {
        this.month = month;
    }

    public final int getYear() {
        return year;
    }

    public final void setYear(final int year) {
        this.year = year;
    }
}
