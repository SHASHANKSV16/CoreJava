package com.xworkz.crackersapp.crackers;

public class CrackersRunner {
    public static void main(String[] args) {

        Crackers firstCracker = new Crackers(1, "Twinkle Flash", "Sparkler", "Silver", 20.0);
        firstCracker.getData();

        Crackers secondCracker = new Crackers(2, "Boom Shot", "Rocket", "Red", 50.0);
        secondCracker.getData();
    }
}
