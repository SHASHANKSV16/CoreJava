class DisneyLand {

    static String location;
    static int numberOfRides;
    static boolean hasParade;
    static double entryFee;
    static String mostFamousCharacter;

    public static String getLocation() {
        location = "California, USA";
        return location;
    }

    public static int getNumberOfRides() {
        numberOfRides = 50;
        return numberOfRides;
    }

    public static boolean hasParadeShow() {
        hasParade = true;
        return hasParade;
    }

    public static double getEntryFee() {
        entryFee = 1999.99;
        return entryFee;
    }

    public static String getFamousCharacter() {
        mostFamousCharacter = "Mickey Mouse";
        return mostFamousCharacter;
    }
}
