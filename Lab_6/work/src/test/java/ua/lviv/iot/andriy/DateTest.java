package ua.lviv.iot.andriy;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateTest {

    Date date=new Date(12,12,2018);

    public DateTest() throws DateException {
    }

    @Test(expected = DateException.class)
    public void testDayExceptionConstructor() throws DateException {
       final Date date=new Date(32,12,2018);
    }

    @Test(expected = DateException.class)
    public void testMonthExceptionConstructor() throws DateException {
        final Date date=new Date(25,13,2018);
    }

    @Test(expected = DateException.class)
    public void testYearExceptionCostructor() throws DateException {
        final Date date=new Date(31,12,2015);
    }

    @Test
    public void setDay(){
        date.setDay(25);
        assertTrue(date.getDay()==25);
    }

    @Test
    public void setMonth(){
        date.setMonth(11);
        assertTrue(date.getMonth()==11);
    }

    @Test
    public void setYear(){
        date.setYear(2019);
        assertTrue(date.getYear()==2019);
    }



}