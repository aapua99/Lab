package ua.lviv.iot.andriy;

public class Citrus extends Fruit {

    private FruitType type;

    public Citrus(final Date experationDate, final FruitColor fruitColor,
                  final double weight, final FruitType type,
                  final Season season) {
        super(type, experationDate, fruitColor, weight, season);
        this.type = type;
    }

    public Citrus(final FruitType type,
                  final double weight) {
        super(type, weight);
    }

    public final FruitType getType() {
        return type;
    }

    public final void setType(final FruitType type) {
        this.type = type;
    }

}
