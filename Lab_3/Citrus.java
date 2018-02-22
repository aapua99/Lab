package ua.lviv.iot.andriy;

public class Citrus extends Fruit {

    private FruitType type;

    public Citrus(Date experationDate, FruitColor fruitColor, double weight, FruitType type, Season season) {
        super(type, experationDate, fruitColor, weight, season);
        this.type = type;
    }

    public Citrus(FruitType type, double weight) {
        super(type, weight);
    }

    public FruitType getType() {
        return type;
    }

    public void setType(FruitType type) {
        this.type = type;
    }

}
