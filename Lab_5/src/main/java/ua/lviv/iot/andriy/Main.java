package ua.lviv.iot.andriy;


public class Main {

    public static void main(final String[] args) {
        Shop shop = new Shop("ProductShop", 605, "Lviv");
        try {
            Date date = new Date(12, 12, 2018);

        Berry blackberrie = new Berry(date, FruitColor.BLUE,
                25, FruitType.BLACKBERRIE, Season.SUMMER,
                BerryLocationType.FOREST);
        shop.addFruit(new Berry(date, FruitColor.RED, 25,
                FruitType.STRAWBERRIE, Season.SUMMER,
                BerryLocationType.BACKYARD));
        Citrus mandarin = new Citrus(date, FruitColor.ORANGE,
                36, FruitType.MANDARIN, Season.WINTER);
        Citrus lemon = new Citrus(date, FruitColor.YELLOW,
                12, FruitType.LEMON, Season.WINTER);
        Citrus orange = new Citrus(date, FruitColor.ORANGE,
                69, FruitType.ORANGE, Season.SUMMER);
        Customer customer = new Customer("Andriy", 18);
        shop.addFruit(blackberrie);
        shop.addFruit(mandarin);
        shop.addFruit(lemon);
        shop.addFruit(orange);

        customer.buyFruit(new Berry(FruitType.BLACKBERRIE, 12), shop);
        shop.sortFruitByColor(shop.searchFruit(Season.SUMMER))
                .forEach((Fruit fruit) -> System.out.println(fruit.getName()
                        + " " + fruit.getWeight()));
        }catch (DateException e){

        }

    }
}
