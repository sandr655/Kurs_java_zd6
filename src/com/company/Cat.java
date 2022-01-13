package com.company;

public class Cat extends Animal {

    private String name;
    protected int weight = 2;
    String adres = "USA";
    int old = 1;

    public Cat(String color) {
        super(color);
    }

    public Cat(){}


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("мяу");
    }
}
