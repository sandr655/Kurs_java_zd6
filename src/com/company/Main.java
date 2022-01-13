package com.company;

public class Main {

    public static void main(String[] args) {


        Cat barsik = new Cat("Black");
        barsik.setName("Barsik");
        System.out.println(barsik.color+" Кот имя "+barsik.getName()+" адресс "+barsik.adres+" вес "+ barsik.weight+" возраст "+ barsik.old);
        barsik.say();

        Dog sharik = new Dog("Black");
        sharik.setName("шарик");
        System.out.println(sharik.color+" Собака имя "+sharik.getName()+" адресс "+sharik.adres+" вес "+ sharik.weight+" возраст "+ sharik.old);
        sharik.say();


    }
}
