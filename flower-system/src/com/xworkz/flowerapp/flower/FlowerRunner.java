package com.xworkz.flowerapp.flower;

public class FlowerRunner {
    public static void main(String[] args) {
        Flower firstFlower = new Flower(1, "Rose", "Red", 15.0);
        firstFlower.getData();

        Flower secondFlower = new Flower(2, "Jasmine", "White", 10.0);
        secondFlower.getData();
    }
}
