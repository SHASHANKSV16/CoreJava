class WalkieTalkie {

    static String brand;
    static double rangeInKm;
    static boolean isWaterResistant;
    static int batteryBackupInHours;
    static boolean hasNoiseCancellation;

    public static String getBrand() {
        brand = "Motorola";
        return brand;
    }

    public static double getRange() {
        rangeInKm = 5.0;
        return rangeInKm;
    }

    public static boolean isWaterResistant() {
        isWaterResistant = true;
        return isWaterResistant;
    }

    public static int getBatteryBackup() {
        batteryBackupInHours = 12;
        return batteryBackupInHours;
    }

    public static boolean hasNoiseCancellationFeature() {
        hasNoiseCancellation = true;
        return hasNoiseCancellation;
    }
}
