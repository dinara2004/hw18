package com.company;

public class Horse extends DomesticAnimal {
    private String color;

    public Horse(String color) {
        this.color = color;
    }

    public Horse(String nickName, int age, double weight, String gender, String color) {
        super(nickName, age, weight, gender);
        this.color = color;
    }
}
