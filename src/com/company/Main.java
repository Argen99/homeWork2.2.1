package com.company;

public class Main {

    public static void main(String[] args) {

        Printable print[] = {createObject("Iphone"),
                createObject("Samsung"),
                createObject("Sony")};
        for (Printable printable:print ) {
            printable.print();
        }

    }
    public static Printable createObject(String className){
        switch (className){
            case "Samsung":
                Samsung samsung = new Samsung("Samsung",2020,"A50");
                return samsung;

            case "Iphone":
                Iphone iphone = new Iphone("Iphone",2021,"White");
                return iphone;

            case "Sony":
                Sony sony = new Sony("Sony",2018,64);
                return sony;

            default:
                return null;
        }

    }



}
