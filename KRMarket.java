class KRMarket {

    static String location;
    static int numberOfShops;
    static boolean isCrowded;
    static String famousFor;
    static String openingTime;

    public static String getLocation() {
        location = "Bengaluru, Karnataka";
        return location;
    }

    public static int getNumberOfShops() {
        numberOfShops = 500;
        return numberOfShops;
    }

    public static boolean isItCrowded() {
        isCrowded = true;
        return isCrowded;
    }

    public static String getFamousFor() {
        famousFor = "Flowers, Vegetables and household items and clothes";
        return famousFor;
    }

    public static String getOpeningTime() {
        openingTime = "2:00 AM";
        return openingTime;
    }
}
