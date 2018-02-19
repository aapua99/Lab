package com.company;

public class Main {

    public static void main(String[] args) {
        Diamond diamond1=new Diamond();
        Diamond diamond2=new Diamond("Агат","Натуральний", "Червоний",200000);
        Diamond diamond3=new Diamond("Азурит","Натуральний", "Синій",4000000,0.2);

        System.out.println(diamond1.toString());
        System.out.println(diamond2.toString());
        System.out.println(diamond3.toString());

        diamond3.printSum();
        Diamond.printStaticSum();


    }
}
