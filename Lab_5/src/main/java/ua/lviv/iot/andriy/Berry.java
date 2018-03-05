package ua.lviv.iot.andriy;

public class Berry extends Fruit {

    private FruitType type;
    private BerryLocationType location;

    public Berry(final Date experationDate, final FruitColor fruitColor,
                 final double weight, final FruitType type, final Season season,
                 final BerryLocationType location) {
        super(type, experationDate, fruitColor, weight, season);
        this.location = location;
        this.type = type;
    }

    public Berry(final FruitType type, final double weight) {
        super(type, weight);
    }

    public final FruitType getType() {
        return type;
    }

    public final void setType(final FruitType type) {
        this.type = type;
    }

    public final BerryLocationType getLocation() {
        return location;
    }

    public final void setLocation(final BerryLocationType location) {
        this.location = location;
    }
}
