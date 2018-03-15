package ua.lviv.iot.andriy;

import java.util.HashSet;
import java.util.Set;

public class Fruit  {

    private Date experationDate;
    private FruitType name;
    private FruitColor fruitColor;
    private double weight;
    private Season season;

    public Fruit(final FruitType name, final Date experationDate,
                 final FruitColor fruitColor, final double weight,
                 final Season season) {
        this.experationDate = experationDate;
        this.fruitColor = fruitColor;
        this.weight = weight;
        this.name = name;
        this.season = season;
    }

    public Fruit(final FruitType name, final double weight) {
        this(name, null, null, weight, null);
    }

    public final Date getExperationDate() {
        return experationDate;
    }

    public final void setExperationDate(final Date experationDate) {
        this.experationDate = experationDate;
    }

    public final FruitColor getFruitColor() {
        return fruitColor;
    }

    public final void setFruitColor(final FruitColor fruitColor) {
        this.fruitColor = fruitColor;
    }

    public final double getWeight() {
        return weight;
    }

    public final void setWeight(final double weight) {
        this.weight = weight;
    }

    public final Season getSeason() {
        return season;
    }

    public final void setSeason(final Season season) {
        this.season = season;
    }

    public final FruitType getName() {
        return name;
    }

    public final void setName(final FruitType name) {
        this.name = name;
    }

    public final String toString(){
        String result=("Experation date:"+experationDate.toString()+", "+"Fruit color "+fruitColor.toString()+", "+
                "Weight "+String.valueOf(weight)+", "+"Season "+ season.toString());
        return result;
    }

}
