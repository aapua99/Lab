package ua.lviv.iot.andriy;

public class Customer {

    private String name;
    private int age;
    private Shop shop;

    public Customer(){

    }

    public Customer(final String name, final int age) {
        this.name = name;
        this.age = age;
        this.shop = null;
    }

    public Customer(final String name, final int age, final Shop shop) {
        this.age = age;
        this.shop = shop;
        this.name = name;
    }

    public final void buyFruit(final Fruit fruit, final Shop shop) {
        shop.sellFruit(fruit);
    }

    public final String getName() {
        return name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public final int getAge() {
        return age;
    }

    public final void setAge(final int age) {
        this.age = age;
    }

    public final Shop getShop() {
        return shop;
    }

    public final void setShop(final Shop shop) {
        this.shop = shop;
    }
}
