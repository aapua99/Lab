package ua.lviv.iot.andriy;


public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop("ProductShop", 605, "Lviv");
        Date date = new Date(12, 12, 2018);
        Berrie blackberrie = new Berrie(date, FruitColor.BLUE, 25, FruitType.BLACKBERRIE, Season.SUMMER,
                BerryLocationType.FOREST);
        Berrie strawberrie = new Berrie(date, FruitColor.RED, 25, FruitType.STRAWBERRIE, Season.SUMMER,
                BerryLocationType.BACKYARD);
        Citrus mandarin = new Citrus(date, FruitColor.ORANGE, 36, FruitType.MANDARIN, Season.WINTER);
        Citrus lemon = new Citrus(date, FruitColor.YELLOW, 12, FruitType.LEMON, Season.WINTER);
        Citrus orange = new Citrus(date, FruitColor.ORANGE, 69, FruitType.ORANGE, Season.SUMMER);
        Customer customer = new Customer("Andriy", 18);
        shop.addFruit(blackberrie);
        shop.addFruit(strawberrie);
        shop.addFruit(mandarin);
        shop.addFruit(lemon);
        shop.addFruit(orange);
        shop.sortFruitByColor(shop.getFruitList());
        customer.buyFruit(new Berrie(FruitType.BLACKBERRIE, 12), shop);
        for (Fruit fruit : shop.getFruitList()) {
            System.out.println(fruit.getName() + " " + fruit.getWeight());
        }
    }
}
