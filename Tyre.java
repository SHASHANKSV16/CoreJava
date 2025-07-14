class Tyre {

    static String brand;
    static int diameterInInches;
    static boolean isTubeless;
    static double price;
    static String suitableFor;  

    public static String getBrand() {
        brand = "MRF";
        return brand;
    }

    public static int getDiameter() {
        diameterInInches = 17;
        return diameterInInches;
    }

    public static boolean isItTubeless() {
        isTubeless = true;
        return isTubeless;
    }

    public static double getPrice() {
        price = 4999.99;
        return price;
    }

    public static String getSuitableFor() {
        suitableFor = "Bike";
        return suitableFor;
    }
}
