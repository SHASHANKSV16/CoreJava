class River {

    static String riverName;
    static String origin;
    static double length;
    static boolean isPolluted;
    static String flowsThrough;

    public static String name() {
        riverName = "Ganga";
        return riverName;
    }

    public static String source() {
        origin = "Gangotri Glacier";
        return origin;
    }

    public static double length() {
        length = 4545.0;
        return length;
    }

    public static boolean pollutionStatus() {
        isPolluted = true;
        return isPolluted;
    }

    public static String regions() {
        flowsThrough = "Uttarakhand, UP, Bihar, West Bengal";
        return flowsThrough;
    }
}
