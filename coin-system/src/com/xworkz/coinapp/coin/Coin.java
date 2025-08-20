package com.xworkz.coinapp.coin;

public class Coin {
    int coinId;
    String material;
    String shape;
    int year;
    double value;

    Coin(int coinId, String material, String shape, int year, double value) {

        this.coinId = coinId;
        this.material = material;
        this.shape = shape;
        this.year = year;
        this.value = value;
    }

    public void getData() {
        System.out.println("The coin id is " + coinId);
        System.out.println("The material is " + material);
        System.out.println("The shape is " + shape);
        System.out.println("The year is " + year);
        System.out.println("The value is " + value);
        System.out.println();
    }
}
