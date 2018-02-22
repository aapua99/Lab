package ua.lviv.iot.andriy;

public class Berry extends Fruit {

    private FruitType type;
    private BerryLocationType location;

    public Berry(Date experationDate, FruitColor fruitColor, double weight, FruitType type, Season season,
                 BerryLocationType location) {
        super(type, experationDate, fruitColor, weight, season);
        this.location = location;
        this.type = type;
    }

    public Berry(FruitType type, double weight) {
        super(type, weight);
    }

    public FruitType getType() {
        return type;
    }

    public void setType(FruitType type) {
        this.type = type;
    }

    public BerryLocationType getLocation() {
        return location;
    }

    public void setLocation(BerryLocationType location) {
        this.location = location;
    }
}
