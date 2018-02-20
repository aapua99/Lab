package com.company;

public class Diamond {
    
    private String name;
    private String category;
    private String color;
    private double price;
    private double weight;
    private static double totalWeight=0;

    Diamond(){}

    Diamond(String name, String category, String color, double price){
        setName(name);
        setCategory(category);
        setColor(color);
        setPrice(price);
    }

    Diamond(String name, String category, String color, double price, double weight){
        setTotalWeight(weight);
        setName(name);
        setCategory(category);
        setColor(color);
        setPrice(price);
        setWeight(weight);
    }

    public String toString() {
        return "Diamond "+getName()+
                "\nCategory: "+getCategory()+
                "\nColor: "+getColor()+
                "\nWeight: "+getWeight()+
                "\nPrice: "+getPrice()+"\n";
    }

    public void printSum(){
        System.out.println("Weight of this diamond: "+weight);
    }

    public static void printStaticSum(){
        System.out.println("Weight of all diamond:"+ totalWeight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setTotalWeight(double weight){
        totalWeight-=this.weight;
        totalWeight+=weight;
        setWeight(weight);
    }

}
