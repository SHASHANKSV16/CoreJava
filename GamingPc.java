class GamingPc {

    static String processor;
    static int ram;
    static String graphicsCard;
    static double price;
    static boolean hasRGBLighting;

    public static String getProcessor() {
        processor = "Intel Core i9";
        return processor;
    }

    public static int getRam() {
        ram = 32;
        return ram;
    }

    public static String getGraphicsCard() {
        graphicsCard = "NVIDIA RTX ";
        return graphicsCard;
    }

    public static double getPrice() {
        price = 149999.99;
        return price;
    }

    public static boolean hasRGB() {
        hasRGBLighting = true;
        return hasRGBLighting;
    }
}
