class Radio {

    static String brand;
    static double frequency;
    static boolean isOn;
    static int volumeLevel;
    static double price;

    public static String getBrand() {
        brand = "Philips";
        return brand;
    }

    public static double getFrequency() {
        frequency = 98.3;
        return frequency;
    }

    public static boolean isRadioOn() {
        isOn = true;
        return isOn;
    }

    public static int getVolumeLevel() {
        volumeLevel = 5;
        return volumeLevel;
    }

    public static double getPrice() {
        price = 1599.50;
        return price;
    }
}
