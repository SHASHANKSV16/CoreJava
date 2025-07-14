class Gold {

    static double weightInGrams;
    static double pricePerGram;
    static String purity;
    static String type;
    static boolean isHallmarked;

    public static double getWeight() {
        weightInGrams = 15.5;
        return weightInGrams;
    }

    public static double getPricePerGram() {
        pricePerGram = 9820.75;
        return pricePerGram;
    }

    public static String getPurity() {
        purity = "22K";
        return purity;
    }

    public static String getType() {
        type = "Necklace";
        return type;
    }

    public static boolean isHallmarked() {
        isHallmarked = true;
        return isHallmarked;
    }
}
