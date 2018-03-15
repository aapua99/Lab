package ua.lviv.iot.andriy;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Shop {
    private String name;
    private double area;
    private String address;
    private List<Fruit> fruitList;

    public Shop(){
        this.fruitList = new LinkedList<Fruit>();
    }

    public Shop(final String name, final double area, final String adress) {
        this.name = name;
        this.address = adress;
        this.area = area;
        this.fruitList = new LinkedList<Fruit>();
    }

    public final void addFruit(final Fruit addFruit) {
        for (Fruit fruit : fruitList) {
            if (fruit.getName().equals(addFruit.getName())) {
                fruit.setWeight(fruit.getWeight() + addFruit.getWeight());
                return;
            }
        }
        fruitList.add(addFruit);
    }

    public final boolean sellFruit(final Fruit sellFruit) {
        for (Fruit fruit : fruitList) {
            if (fruit.getName().equals(sellFruit.getName())) {
                fruit.setWeight(fruit.getWeight() - sellFruit.getWeight());
                return true;
            }
        }
        return false;

    }

    public final void sortFruitByColor(final List<Fruit> list) {
        list.sort(Comparator.comparing(Fruit::getFruitColor));
    }

    public final List<Fruit> searchFruit(final Season searchSeason) {
        List<Fruit> searchList = new LinkedList<>();
        for (Fruit fruit : fruitList) {
            if (fruit.getSeason().equals(searchSeason)) {
                searchList.add(fruit);
            }
        }
        return searchList;
    }

    public final String getName() {
        return name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public final double getArea() {
        return area;
    }

    public final void setArea(final double area) {
        this.area = area;
    }

    public final String getAddress() {
        return address;
    }

    public final void setAddress(final String adress) {
        this.address = adress;
    }

    public final List<Fruit> getFruitList() {
        return fruitList;
    }

    public final void setFruitList(final List<Fruit> fruitList) {
        this.fruitList = fruitList;
    }


}
