package ua.lviv.iot.andriy;

public class Fruit implements Comparable<Fruit> {

    private Date experationDate;
    private FruitType name;
    private FruitColor fruitColor;
    private double weight;
    private Season season;

    public Fruit(FruitType name, Date experationDate, FruitColor fruitColor, double weight, Season season) {
        this.experationDate = experationDate;
        this.fruitColor = fruitColor;
        this.weight = weight;
        this.name = name;
        this.season = season;
    }

    public Fruit(FruitType name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Date getExperationDate() {
        return experationDate;
    }

    public void setExperationDate(Date experationDate) {
        this.experationDate = experationDate;
    }

    public FruitColor getFruitColor() {
        return fruitColor;
    }

    public void setFruitColor(FruitColor fruitColor) {
        this.fruitColor = fruitColor;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public FruitType getName() {
        return name;
    }

    public void setName(FruitType name) {
        this.name = name;
    }


    @Override
    public int compareTo(Fruit o) {
        return fruitColor.compareTo(o.getFruitColor());
    }
}
