class CoinRunner {
    public static void main(String[] money) {

        String[] shapesAvailable = {"Round","Hexagon"};
        

        Coin firstCoin = new Coin(1, "silver", shapesAvailable, 1950, 1.0);
        firstCoin.getData();

        Coin secondCoin = new Coin(2, "gold");
        System.out.println("The coin id is " + secondCoin.coinId);
        System.out.println("The material is " + secondCoin.material);
        System.out.println();

      

        Coin thirdCoin = new Coin(2000, 25.0);
        System.out.println("The year is " + thirdCoin.year);
        System.out.println("The value is " + thirdCoin.value);
        System.out.println();

        Coin fourthCoin = new Coin();
        fourthCoin.coinId = 5;
        fourthCoin.material = "copper";
        fourthCoin.shapesAvailable = shapesAvailable;
        fourthCoin.year = 1980;
        fourthCoin.value = 0.5;
        fourthCoin.getData();
    }
}
