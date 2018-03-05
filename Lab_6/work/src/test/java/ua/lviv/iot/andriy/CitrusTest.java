package ua.lviv.iot.andriy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CitrusTest {

    Citrus citrus = new Citrus(new Date(12,12,2018), FruitColor.YELLOW,
            52, FruitType.LEMON, Season.WINTER);

    public CitrusTest() throws DateException {
    }

    @Test
    public void testConstructorWithAllParams() throws DateException {
        Citrus citrus1=new Citrus(new Date(12,12,2018), FruitColor.YELLOW,
                52, FruitType.LEMON, Season.WINTER);
        assertThat(citrus1.getType(), is(FruitType.LEMON));
    }
    @Test
    public void  testConstructorWithTwoParams(){
        Citrus citrus1=new Citrus(FruitType.LEMON,58);
        assertThat(citrus1.getType(),is(FruitType.LEMON));
    }
    @Test
    public void getType() {
        assertThat(citrus.getType(), is(FruitType.LEMON));
    }

    @Test
    public void setType() {
        citrus.setType(FruitType.ORANGE);
        assertThat(citrus.getType(), is(FruitType.ORANGE));
    }
}