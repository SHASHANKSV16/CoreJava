package com.xworkz.crackersapp.crackers;

public class Crackers {
    int crackerId;
    String name;
    String type;
    String color;
    double price;

    Crackers(int crackerId, String name, String type, String color, double price) {
        this.crackerId = crackerId;
        this.name = name;
        this.type = type;
        this.color = color;
        this.price = price;
    }


    public void getData() {
        System.out.println("The cracker id is " + crackerId);
        System.out.println("The name is " + name);
        System.out.println("The type is " + type);
        System.out.println("The color is " + color);
        System.out.println("The price is " + price);
        System.out.println();
    }
}
