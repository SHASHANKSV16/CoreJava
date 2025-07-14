class TrafficSignal {

    static String colors;
    static int durationInSeconds;
    static boolean isWorking;
    static String location;
    static boolean hasCamera;

    public static String getColors() {
        colors = "Red.orange.green";
        return colors;
    }

    public static int getDuration() {
        durationInSeconds = 60;
        return durationInSeconds;
    }

    public static boolean isSignalWorking() {
        isWorking = true;
        return isWorking;
    }

    public static String getLocation() {
        location = " Junction";
        return location;
    }

    public static boolean hasCameraInstalled() {
        hasCamera = true;
        return hasCamera;
    }
}
