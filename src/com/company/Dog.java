package com.company;

public class Dog extends Animal {

    private String name;
    protected int weight = 4;
    int old = 23;

    public Dog(String color) {
        super(color);
    }

    public Dog(){}

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("гаф");
    }

}
