package ua.lviv.iot.andriy;

import java.util.*;

public class Shop {
    private String name;
    private double area;
    private String address;
    private List<Fruit> fruitList;

    public Shop(String name, double area, String adress) {
        this.name = name;
        this.address = adress;
        this.area = area;
        this.fruitList = new LinkedList<>();
    }

    public void addFruit(Fruit addFruit) {
        for (Fruit fruit : fruitList) {
            if (fruit.getName().equals(addFruit.getName())) {
                fruit.setWeight(fruit.getWeight() + addFruit.getWeight());
                return;
            }
        }
        fruitList.add(addFruit);
    }

    public void sellFruit(Fruit sellFruit) {
        for (Fruit fruit : fruitList) {
            if (fruit.getName().equals(sellFruit.getName())) {
                fruit.setWeight(fruit.getWeight() - sellFruit.getWeight());
                return;
            }
        }
    }

    public void sortFruitByColor(List<Fruit> list) {
        list.sort(Comparator.comparing(Fruit::getFruitColor));
    }

    public List<Fruit> searchFruit(Season searchSeason) {
        List<Fruit> searchList = new LinkedList<>();
        for (Fruit fruit : fruitList) {
            if (fruit.getSeason().equals(searchSeason)) {
                searchList.add(fruit);
            }
        }
        return searchList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

    public List<Fruit> getFruitList() {
        return fruitList;
    }

    public void setFruitList (List<Fruit> fruitList) {
        this.fruitList = fruitList;
    }


}
