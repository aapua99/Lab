package ua.lviv.iot.andriy;

public class Fruit implements Comparable<Fruit> {

    private Date experationDate;
    private String name;
    private ColorFruit colorFruit;
    private double weight;
    private Season season;

    public Fruit(String name, Date experationDate, ColorFruit colorFruit, double weight, Season season) {
        this.experationDate = experationDate;
        this.colorFruit = colorFruit;
        this.weight = weight;
        this.name = name;
        this.season = season;
    }

    public Fruit(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Date getExperationDate() {
        return experationDate;
    }

    public void setExperationDate(Date experationDate) {
        this.experationDate = experationDate;
    }

    public ColorFruit getColorFruit() {
        return colorFruit;
    }

    public void setColorFruit(ColorFruit colorFruit) {
        this.colorFruit = colorFruit;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Fruit o) {
        return colorFruit.compareTo(o.getColorFruit());
    }
}
