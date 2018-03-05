package ua.lviv.iot.andriy;

public class Date {


    private int day;
    private int mounth;
    private int year;

    public Date(final int day, final int mounth, final int year) throws DateException {
        if(mounth>12){
            throw new DateException();
        }
        if(day>31){
            throw new DateException();
        }
        if(year<2018){
            throw  new DateException();
        }

        this.day = day;
        this.mounth = mounth;
        this.year = year;
    }

    public final int getDay() {
        return day;
    }

    public final void setDay(final int day) {
        this.day = day;
    }

    public final int getMounth() {
        return mounth;
    }

    public final void setMounth(final int mounth) {
        this.mounth = mounth;
    }

    public final int getYear() {
        return year;
    }

    public final void setYear(final int year) {
        this.year = year;
    }
}
