package com.xworkz.hatapp.hat;

public class HatRunner {
    public static void main(String[] args) {
        Hat firstHat = new Hat(1, "Black", "Medium", "Wool", 250.0);
        firstHat.getData();

        Hat secondHat = new Hat(2, "Red", "Large", "Cotton", 300.0);
        secondHat.getData();
    }
}
