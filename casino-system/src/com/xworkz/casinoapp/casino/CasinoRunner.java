package com.xworkz.casinoapp.casino;

public class CasinoRunner {
    public static void main(String[] args) {
        Casino firstCasino = new Casino(1, "Star Spin", "Goa", 45, true);
        firstCasino.getData();

        Casino secondCasino = new Casino(2, "Lucky Streak", "Sikkim", 30, false);
        secondCasino.getData();
    }
}
