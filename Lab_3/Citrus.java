package ua.lviv.iot.andriy;

public class Citrus extends Fruit {

    private TypeCitrus type;

    public Citrus(Date experationDate, ColorFruit colorFruit, double weight, TypeCitrus type, Season season) {
        super(type.toString(), experationDate, colorFruit, weight, season);
        this.type = type;
    }

    public Citrus(TypeCitrus type, double weight) {
        super(type.toString(), weight);
    }

    public TypeCitrus getType() {
        return type;
    }

    public void setType(TypeCitrus type) {
        this.type = type;
    }

}
