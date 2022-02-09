package com.company;

public class Iphone extends Phone{

    private String color;

    public Iphone(String name, int year, String color) {
        super(name, year);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void print() {
        System.out.println(getName() + " " + getYear() + " " + color);
    }
}
