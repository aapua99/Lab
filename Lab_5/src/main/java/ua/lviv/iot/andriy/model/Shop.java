package ua.lviv.iot.andriy.model;

import ua.lviv.iot.andriy.model.Fruit;
import ua.lviv.iot.andriy.model.Season;

import java.util.*;

public class Shop {
    private String name;
    private double area;
    private String address;
    private static Map<Integer, Fruit> fruitList=new HashMap<>();

    public Shop(){
    }

    public Shop(final String name, final double area, final String adress) {
        this.name = name;
        this.address = adress;
        this.area = area;
        this.fruitList = new HashMap<>();
    }

    public final void addFruit(final Fruit addFruit) {
        for (Map.Entry<Integer,Fruit> fruit : fruitList.entrySet()) {
            if ((fruit.getValue().getName().equals(addFruit.getName()))&&(fruit.getValue().getId()==addFruit.getId())) {
                fruit.getValue().setWeight(fruit.getValue().getWeight() + addFruit.getWeight());
                return;
            }
        }
        fruitList.put(addFruit.getId(), addFruit);
    }

    public final boolean sellFruit(final Fruit sellFruit) {
        for (Map.Entry<Integer,Fruit> fruit : fruitList.entrySet()) {
            if (fruit.getValue().getName().equals(sellFruit.getName())) {
                fruit.getValue().setWeight(fruit.getValue().getWeight() - sellFruit.getWeight());
                return true;
            }
        }
        return false;

    }

    public final void sortFruitByColor(final List<Fruit> list) {
        list.sort(Comparator.comparing(Fruit::getFruitColor));
    }

    public final Map<Integer, Fruit> searchFruit(final Season searchSeason) {
        Map<Integer,Fruit> searchList = new HashMap<>();
        for (Map.Entry<Integer,Fruit> fruit : fruitList.entrySet()) {
            if (fruit.getValue().getSeason().equals(searchSeason)) {
                searchList.put(fruit.getValue().getId(),fruit.getValue());
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

    public final Map<Integer, Fruit> getFruitList() {
        return fruitList;
    }

    public final void setFruitList(final Map<Integer,Fruit> fruitList) {
        this.fruitList = fruitList;
    }






}
