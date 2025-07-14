class Clothes {

    static String type;
    static String color;
    static String size;
    static double price;
    static boolean isCotton;

    public static String getType() {
        type = "T-Shirt";
        return type;
    }

    public static String getColor() {
        color = "Blue";
        return color;
    }

    public static String getSize() {
        size = "M";
        return size;
    }

    public static double getPrice() {
        price = 799.99;
        return price;
    }

    public static boolean isCottonMaterial() {
        isCotton = true;
        return isCotton;
    }
}
