package ua.lviv.iot.andriy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void buyFruit() {
        Shop shop=new Shop();
        shop.addFruit(new Fruit(FruitType.BLACKBERRIE,25));
        Customer customer=new Customer();
        customer.buyFruit(new Fruit(FruitType.BLACKBERRIE,12), shop);
        assertTrue(shop.getFruitList().get(0).getWeight()==13);
    }
}