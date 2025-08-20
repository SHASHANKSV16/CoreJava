package com.xworkz.coinapp.coin;

public class CoinRunner {
    public static void main(String[] args) {
        Coin firstCoin = new Coin(1, "silver", "Round", 1950, 1.0);
        firstCoin.getData();

        Coin secondCoin = new Coin(2, "gold", "Hexagon", 1965, 10.0);
        secondCoin.getData();
    }
}
