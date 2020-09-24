package com.company;
/*
* Описать класс Phone. Реализуйте метод который будет возвращать стоимость и производителя телефона.  */
public class Phone {

    public String name;
    public int cost;

    public Phone (String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Phone something() {

        return new Phone ("dd", 4);
    }
}
