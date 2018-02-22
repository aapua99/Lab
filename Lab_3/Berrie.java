package ua.lviv.iot.andriy;

public class Berrie extends Fruit {

    private TypeBerrie type;
    private LocationBerrie location;

    public Berrie(Date experationDate, ColorFruit colorFruit, double weight, TypeBerrie type, Season season,
                  LocationBerrie location) {
        super(type.toString(), experationDate, colorFruit, weight, season);
        this.location = location;
        this.type = type;
    }

    public Berrie(TypeBerrie type, double weight) {
        super(type.toString(), weight);
    }

    public TypeBerrie getType() {
        return type;
    }

    public void setType(TypeBerrie type) {
        this.type = type;
    }

    public LocationBerrie getLocation() {
        return location;
    }

    public void setLocation(LocationBerrie location) {
        this.location = location;
    }
}
