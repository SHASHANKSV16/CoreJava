class Banner {

    static String message;
    static String color;
    static int width;
    static int height;
    static boolean isAnimated;

    public static String getMessage() {
        message = "Welcome to Our Event";
        return message;
    }

    public static String getColor() {
        color = "Red";
        return color;
    }

    public static int getWidth() {
        width = 600;
        return width;
    }

    public static int getHeight() {
        height = 300;
        return height;
    }

    public static boolean getIsAnimated() {
        isAnimated = true;
        return isAnimated;
    }
}
