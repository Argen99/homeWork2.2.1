package com.company;

public abstract class Phone implements Printable {

    private String name;
    private int year;

    public Phone(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
