package com.company;

public class Animal {


        private String name;
        public String color;
        protected String adres = "Земля";


        public Animal (String color){
            this.color = color;
        }

    public Animal() {}

    public String getName(){
           return this.name;
        }

        public void setName(String name){
            this.name = name;
        }

    public void say() {
        System.out.println("голос");
    }

}
