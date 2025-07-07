class WashingMachine {
    static boolean isPower;
    static int maxRotationSpeed = 5;
    static int minRotationSpeed;
    static int currRotationSpeed;
 
    public static void powerButton() {
        if (isPower) {
            isPower = false;
            System.out.println("The washing machine is turned off");
        } else {
            isPower = true;
            System.out.println("The washing machine is turned on");
        }
    }

    public static void increaseSpeed() {
        if (isPower) {
            if (currRotationSpeed < maxRotationSpeed) {
                currRotationSpeed = currRotationSpeed + 1;
                System.out.println("The washing machine speed is " + currRotationSpeed);
            }else {
                System.out.println("Maximum speed reached: " + maxRotationSpeed);
            }
        } else {
            System.out.println("Please turn on the washing machine ");
        }
    }

    public static void decreaseSpeed() {
        if (isPower) {
            if (currRotationSpeed > minRotationSpeed) {
                currRotationSpeed = currRotationSpeed - 1;
                System.out.println("The washing machine speed is " + currRotationSpeed);
            }else{
                System.out.println("Minimum speed reached: " + minRotationSpeed);
            }
        }else{
            System.out.println("Please turn on the washing machine ");
        }
    }
}
