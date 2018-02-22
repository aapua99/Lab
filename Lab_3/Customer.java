package ua.lviv.iot.andriy;

public class Customer {

    private String name;
    private int age;
    private Shop shop;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        this.shop = null;
    }

    public Customer(String name, int age, Shop shop) {
        this.age = age;
        this.shop = shop;
        this.name = name;
    }

    public void buyFruit(Fruit fruit, Shop shop) {
        shop.sellFruit(fruit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
