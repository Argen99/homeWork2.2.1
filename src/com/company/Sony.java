package com.company;

public class Sony extends Phone{

    private int storage;

    public Sony(String name, int year, int storage) {
        super(name, year);
        this.storage = storage;
    }

    public int getStorage() {
        return storage;
    }


    @Override
    public void print() {
        System.out.println(getName() + " " + getYear() + " " + storage);

    }
}
