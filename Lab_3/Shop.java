package ua.lviv.iot.andriy;

import java.util.*;

public class Shop {
    private String name;
    private double area;
    private String adress;
    private List<Fruit> listFruit;

    public Shop(String name, double area, String adress) {
        this.name = name;
        this.adress = adress;
        this.area = area;
        this.listFruit = new LinkedList<>();
    }

    public void addFruit(Fruit addFruit) {
        for (Fruit fruit : listFruit) {
            if (fruit.getName().equals(addFruit.getName())) {
                fruit.setWeight(fruit.getWeight() + addFruit.getWeight());
                return;
            }
        }
        listFruit.add(addFruit);
    }

    public void sellFruit(Fruit sellFruit) {
        for (Fruit fruit : listFruit) {
            if (fruit.getName().equals(sellFruit.getName())) {
                fruit.setWeight(fruit.getWeight() - sellFruit.getWeight());
                return;
            }
        }
    }

    public void sortFruitByColor() {
        this.listFruit.sort(Comparator.comparing(Fruit::getColorFruit));
    }

    public List<Fruit> searchFruit(Season searchSeason) {
        List<Fruit> searchList = new LinkedList<>();
        for (Fruit fruit : listFruit) {
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<Fruit> getListFruit() {
        return listFruit;
    }

    public void setListFruit(List<Fruit> listFruit) {
        this.listFruit = listFruit;
    }


}
