package ua.lviv.iot.andriy;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ShopTest {

    Shop shop1 = new Shop();

    @Test
    public void testConstructorAllParams() {
        Shop shop = new Shop("Shop", 605, "Lviv");
        assertThat(shop.getAddress(), is("Lviv"));
        assertTrue(shop.getArea() == 605);
        assertThat(shop.getName(), is("Shop"));
    }

    @Test
    public void addFruit() throws DateException {
        Shop shop = new Shop();
        Citrus citrus = new Citrus(new Date(12, 12, 2018), FruitColor.YELLOW, 25, FruitType.LEMON, Season.WINTER,1);
        shop.addFruit(citrus);
        Citrus citrus1 = new Citrus(new Date(12, 12, 2018), FruitColor.YELLOW, 25, FruitType.ORANGE, Season.WINTER,2);
        shop.addFruit(citrus1);
        System.out.println(shop.getFruitList().size());
        assertTrue(shop.getFruitList().size() == 2);

    }

    @Test
    public void addFruitWhihWasInShop() throws DateException {
        Shop shop = new Shop();
        Citrus citrus = new Citrus(new Date(12, 12, 2018), FruitColor.YELLOW, 25, FruitType.LEMON, Season.WINTER);
        shop.addFruit(citrus);
        shop.addFruit(citrus);
        double result = 50;
        assertThat(shop.getFruitList().get(0).getWeight(), is(result));

    }

    @Test
    public void sellFruitWhichWasInShop() {
        Shop shop = new Shop();
        shop.addFruit(new Citrus(FruitType.LEMON, 68));
        assertTrue(shop.sellFruit(new Citrus(FruitType.LEMON, 28)));
        assertTrue(shop.getFruitList().get(0).getWeight() == 40);
    }

    @Test
    public void sellFruit() {
        Shop shop = new Shop();
        shop.addFruit(new Citrus(FruitType.ORANGE, 85));
        assertFalse(shop.sellFruit(new Citrus(FruitType.LEMON, 28)));
    }

    @Test
    public void sortFruitByColor() {
    }

    @Test
    public void searchFruit() {
    }

    @Test
    public void setName() {
        shop1.setName("shop");
        assertThat(shop1.getName(), is("shop"));
    }

    @Test
    public void setAddress() {
        shop1.setAddress("Ukraine");
        assertThat(shop1.getAddress(), is("Ukraine"));
    }

    @Test
    public  void setArea(){
        shop1.setArea(25);
        assertTrue(shop1.getArea()==25);
    }

    @Test
    public void  setList(){
        Map<Integer,Fruit> list=new HashMap<>();
        list.put(1,new Fruit(FruitType.BLACKBERRIE, 25));
        shop1.setFruitList(list);
        assertThat(shop1.getFruitList().size(), is(1));
    }

    @Test
    public void testSortFruitByColor(){
        LinkedList<Fruit> list=new LinkedList<>();
        list.add(new Fruit(FruitType.BLACKBERRIE,25));
        list.add(new Fruit(FruitType.BLACKBERRIE,25));
        list.add(new Fruit(FruitType.BLACKBERRIE,25));

        list.get(0).setFruitColor(FruitColor.YELLOW);
        list.get(1).setFruitColor(FruitColor.GREEN);
        list.get(2).setFruitColor(FruitColor.YELLOW);
        shop1.sortFruitByColor(list);
        assertThat(list.get(0).getFruitColor(), is(FruitColor.GREEN));
        assertThat(list.get(1).getFruitColor(), is(FruitColor.YELLOW));
        assertThat(list.get(2).getFruitColor(), is(FruitColor.YELLOW));
    }

    @Test
    public void testSearchSeason(){
        Map<Integer,Fruit> list=new HashMap<>();
        list.put(1,new Fruit(FruitType.BLACKBERRIE,25));
        list.put(2,new Fruit(FruitType.BLACKBERRIE,25));
        list.put(3,new Fruit(FruitType.BLACKBERRIE,25));
        shop1.setFruitList(list);
        shop1.getFruitList().get(1).setSeason(Season.WINTER);
        shop1.getFruitList().get(2).setSeason(Season.AUTUMN);
        shop1.getFruitList().get(3).setSeason(Season.SUMMER);
        shop1.setFruitList(list);
        shop1.setFruitList(shop1.searchFruit(Season.WINTER));
        assertThat(shop1.getFruitList().get(0).getSeason(), is(Season.WINTER));
      


    }
}