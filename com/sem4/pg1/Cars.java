package com.sem4.pg1;

public class Cars {
    String Brand;
    String model;
    String year;

    public Cars(String Brand, String model, String year) {
        this.Brand = Brand;
        this.model = model;
        this.year = year;
    }

    public void display(){
        System.out.println("brand : " + Brand);
        System.out.println("model : " + model);
        System.out.println("year : " + year);
    }
}
