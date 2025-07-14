class Garden {

    static String gardenName;
    static String location;
    static int numberOfBenches;
    static boolean isOpenToPublic;
    static String famousFor;

    public static String name() {
        gardenName = "Cubbon Park";
        return gardenName;
    }

    public static String place() {
        location = "Bengaluru";
        return location;
    }

    public static int benches() {
        numberOfBenches = 150;
        return numberOfBenches;
    }

    public static boolean openStatus() {
        isOpenToPublic = true;
        return isOpenToPublic;
    }

    public static String special() {
        famousFor = "Greenery and Jogging Tracks";
        return famousFor;
    }
}
