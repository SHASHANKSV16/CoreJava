class Tailor {

    static String tailorName;
    static int experienceInYears;
    static String shopLocation;
    static boolean stitchesForLadiesAndGents;
    static double stitchingCharge;

    public static String getName() {
        tailorName = "veeresh Tailors";
        return tailorName;
    }

    public static int getExperience() {
        experienceInYears = 5;
        return experienceInYears;
    }

    public static String getLocation() {
        shopLocation = "laggere";
        return shopLocation;
    }

    public static boolean doesStitchAll() {
        stitchesForLadiesAndGents = true;
        return stitchesForLadiesAndGents;
    }

    public static double getCharge() {
        stitchingCharge = 250.0;
        return stitchingCharge;
    }
}
