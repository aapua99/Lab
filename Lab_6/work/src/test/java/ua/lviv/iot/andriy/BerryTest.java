package ua.lviv.iot.andriy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BerryTest {

    Berry berry=new Berry(new Date(12, 12 , 2018), FruitColor.YELLOW, 65,
            FruitType.STRAWBERRIE, Season.SUMMER, BerryLocationType.BACKYARD );


    public BerryTest() throws DateException {
    }

    @Test
    public void getType() {
        assertThat(berry.getType(), is(FruitType.STRAWBERRIE));
    }

    @Test
    public void setType() {
        berry.setType(FruitType.BLACKBERRIE);
        assertThat(berry.getType(), is(FruitType.BLACKBERRIE));
    }

    @Test
    public void getLocation() {
        assertThat(berry.getLocation(),is(BerryLocationType.BACKYARD));
    }

    @Test
    public void setLocation() {
        berry.setLocation(BerryLocationType.FOREST);
        assertThat(berry.getLocation(), is(BerryLocationType.FOREST));
    }

    @Test
    public void testConstructorWithTwoParams(){
        Berry fruit=new Berry(FruitType.BLACKBERRIE, 65);
        assertThat(fruit.getType(), is(FruitType.BLACKBERRIE));
        assertTrue(fruit.getWeight()==65);
    }
}