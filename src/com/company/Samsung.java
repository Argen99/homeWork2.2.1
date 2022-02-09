package com.company;

public class Samsung extends Phone{

    private String model;

    public Samsung(String name, int year, String model) {
        super(name, year);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void print() {
        System.out.println(getName() + " " + getYear() + " " + model);

    }
}
