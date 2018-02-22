package ua.lviv.iot.andriy;


public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop("ProductShop", 605, "Lviv");
        Date date = new Date(12, 12, 2018);
        Berrie blackberrie = new Berrie(date, ColorFruit.BLUE, 25, TypeBerrie.BLACKBERRIE, Season.SUMMER,
                LocationBerrie.FOREST);
        Berrie strawberrie = new Berrie(date, ColorFruit.RED, 25, TypeBerrie.STRAWBERRIE, Season.SUMMER,
                LocationBerrie.BACKYARD);
        Citrus mandarin = new Citrus(date, ColorFruit.ORANGE, 36, TypeCitrus.MANDARIN, Season.WINTER);
        Citrus lemon = new Citrus(date, ColorFruit.YELLOW, 12, TypeCitrus.LEMON, Season.WINTER);
        Citrus orange = new Citrus(date, ColorFruit.ORANGE, 69, TypeCitrus.ORANGE, Season.SUMMER);
        Customer customer = new Customer("Andriy", 18);
        shop.addFruit(blackberrie);
        shop.addFruit(strawberrie);
        shop.addFruit(mandarin);
        shop.addFruit(lemon);
        shop.addFruit(orange);
        shop.sortFruitByColor();
        customer.buyFruit(new Berrie(TypeBerrie.BLACKBERRIE, 12), shop);
        for (Fruit fruit : shop.getListFruit()) {
            System.out.println(fruit.getName() + " " + fruit.getWeight());
        }
    }
}
