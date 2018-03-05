package ua.lviv.iot.andriy;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateTest {

    @Test(expected = DateException.class)
    public void testDayExceptionConstructor() throws DateException {
       final Date date=new Date(32,12,2018);
    }

    @Test(expected = DateException.class)
    public void testMounthExceptionConstructor() throws DateException {
        final Date date=new Date(25,13,2018);
    }

    @Test(expected = DateException.class)
    public void testYearExceptionCostructor() throws DateException {
        final Date date=new Date(31,12,2015);
    }




}