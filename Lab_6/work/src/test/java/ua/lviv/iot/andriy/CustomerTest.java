package ua.lviv.iot.andriy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void testConstructorWithAllParams(){
        Shop shop=new Shop();
        Customer customer=new Customer("Andriy", 18,shop);
        assertThat(customer.getAge(), is(18));
        assertThat(customer.getName(),is("Andriy"));
        assertThat(customer.getShop(), is(shop));
    }

    @Test
    public void buyFruit() {
        Shop shop=new Shop();
        shop.addFruit(new Fruit(FruitType.BLACKBERRIE,25));
        Customer customer=new Customer();
        customer.buyFruit(new Fruit(FruitType.BLACKBERRIE,12), shop);
        assertTrue(shop.getFruitList().get(0).getWeight()==13);
    }

    @Test
    public void testConstructorWithTwoParams(){
        Customer customer=new Customer("Andriy",18);
        assertThat(customer.getName(), is("Andriy"));
        assertThat(customer.getAge(), is(18));
        assertTrue(customer.getShop()==null);
    }

    @Test
    public void setName(){
        Customer customer=new Customer();
        customer.setName("andriy");
        assertThat(customer.getName(), is("andriy"));
    }

    @Test
    public void  setShop(){
        Customer customer=new Customer();
        Shop shop=new Shop();
        customer.setShop(shop);
        assertThat(customer.getShop(), is(shop));
    }

    @Test
    public void  setAge(){
        Customer customer=new Customer();
        customer.setAge(25);
        assertThat(customer.getAge(),is(25));
    }
}