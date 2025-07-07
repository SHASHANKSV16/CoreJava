class AC {
    static boolean onOrOff;
    static int maxTemp = 27;
    static int minTemp = 20;
    static int currTemp = 24;

    public static void power(){
        if (onOrOff){
            onOrOff = false;
            System.out.println("The AC is turned off");
        } else {
            onOrOff = true;
            System.out.println("The AC is turned on");
        }
    }

    public static void increaseTemp() {
        if (onOrOff) {
            if (currTemp < maxTemp) {
                currTemp = currTemp + 1;
                System.out.println("Current AC temperature: " + currTemp );
            } else {
                System.out.println("Maximum temperature reached: " + maxTemp );
            }
        } else {
            System.out.println("Please turn on the AC first");
        }
    }

    public static void decreaseTemp() {
        if (onOrOff) {
            if (currTemp > minTemp) {
                currTemp = currTemp - 1;
                System.out.println("Current AC temperature: " + currTemp);
            } else {
                System.out.println("Minimum temperature reached: " + minTemp);
            }
        } else {
            System.out.println("Please turn on the AC first");
        }
    }
}
