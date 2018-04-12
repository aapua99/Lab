package ua.lviv.iot.andriy.model;


import javax.persistence.*;
import javax.ws.rs.Consumes;

@Entity
public class Fruit  {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "fruit_id")
    private int id;
    //@Column(name = "fruit_date")
    @Transient
    private Date experationDate;
    @Column(name = "fruit_type")
    private FruitType name;
    @Column(name = "fruit_color")
    private FruitColor fruitColor;
    @Column(name = "fruit_weight")
    private double weight;
    @Column(name = "fruit_season")
    private Season season;

    public Fruit(){

    }

    public Fruit(final FruitType name, final Date experationDate,
                 final FruitColor fruitColor, final double weight,
                 final Season season) {
        this.experationDate = experationDate;
        this.fruitColor = fruitColor;
        this.weight = weight;
        this.name = name;
        this.season = season;
    }
    public Fruit(final FruitType name, final Date experationDate,
                 final FruitColor fruitColor, final double weight,
                 final Season season, final  int id) {
        this.experationDate = experationDate;
        this.fruitColor = fruitColor;
        this.weight = weight;
        this.name = name;
        this.season = season;
        this.id=id;
    }

    public Fruit(final FruitType name, final double weight) {
        this(name, null, null, weight, null);
    }
    public Fruit(final FruitType name, final double weight, final int id) {
        this(name, null, null, weight, null,id);
    }


    public  Date getExperationDate() {
        return experationDate;
    }

    public  void setExperationDate(final Date experationDate) {
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

    public  void setSeason( Season season) {
        this.season = season;
    }

    public  FruitType getName() {
        return name;
    }

    public  void setName( FruitType name) {
        this.name = name;
    }

    public  String toString(){
        String result=("Experation date:"+experationDate.toString()+", "+"Fruit color "+fruitColor.toString()+", "+
                "Weight "+String.valueOf(weight)+", "+"Season "+ season.toString());
        return result;
    }

    public  int getId() {
        return id;
    }

    public  void setId(  int id) {
        this.id = id;
    }
}
