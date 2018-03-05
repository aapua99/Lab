package ua.lviv.iot.andriy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FruitTest {

    final Fruit fruit=new Fruit(FruitType.LEMON, new Date(25,12,2018),FruitColor.YELLOW, 25, Season.SUMMER);

    public FruitTest() throws DateException {
    }

    @Test
    public void getExperationDate() throws Exception{
        assertThat(fruit.getExperationDate().getDay(), is(25));
        assertThat(fruit.getExperationDate().getMonth(), is(12));
        assertThat(fruit.getExperationDate().getYear(), is(2018));
    }

    @Test
    public void setExperationDate() throws Exception {
        fruit.setExperationDate(new Date(12,8,2019));
        assertThat(fruit.getExperationDate().getDay(), is(12));
        assertThat(fruit.getExperationDate().getMonth(), is(8));
        assertThat(fruit.getExperationDate().getYear(), is(2019));

    }

    @Test
    public void getFruitColor() throws Exception {
        assertThat(fruit.getFruitColor(), is(FruitColor.YELLOW));
    }

    @Test
    public void setFruitColor() throws Exception {
        fruit.setFruitColor(FruitColor.GREEN);
        assertThat(fruit.getFruitColor(),is(FruitColor.GREEN));
    }

    @Test
    public void getWeight() throws Exception {
        double weight=25;
        assertThat(fruit.getWeight(), is(weight));
    }

    @Test
    public void setWeight() throws Exception {
        double weight=32;
        fruit.setWeight(32);
        assertThat(fruit.getWeight(),is(weight));
    }

    @Test
    public void getSeason() throws Exception {
        assertThat(fruit.getSeason(), is(Season.SUMMER));
    }

    @Test
    public void setSeason() throws Exception {
        fruit.setSeason(Season.AUTUMN);
        assertThat(fruit.getSeason(), is(Season.AUTUMN));
    }

    @Test
    public void getName() throws Exception {
        assertThat(fruit.getName(), is(FruitType.LEMON));
    }

    @Test
    public void setName() throws Exception {
        fruit.setName(FruitType.MANDARIN);
        assertThat(fruit.getName(), is(FruitType.MANDARIN));
    }

}