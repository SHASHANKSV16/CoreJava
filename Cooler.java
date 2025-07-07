class Cooler {
    static boolean isPower;
    static int maxSpeed = 5;
    static int minSpeed;
    static int currSpeed;
 
    public static void powerButton() {
        if (isPower) {
            isPower = false;
            System.out.println("The cooler is turned off");
        } else {
            isPower = true;
            System.out.println("The cooler is turned on");
        }
    }

    public static void increaseSpeed() {
        if (isPower) {
            if (currSpeed < maxSpeed) {
                currSpeed = currSpeed + 1;
                System.out.println("The cooler speed is " + currSpeed);
            }else {
                System.out.println("Maximum speed reached: " + maxSpeed);
            }
        } else {
            System.out.println("Please turn on the cooler ");
        }
    }

    public static void decreaseSpeed() {
        if (isPower) {
            if (currSpeed > minSpeed) {
                currSpeed = currSpeed - 1;
                System.out.println("The cooler speed is " + currSpeed);
            }else{
                System.out.println("Minimum speed reached: " + minSpeed);
            }
        }else{
            System.out.println("Please turn on the cooler ");
        }
    }
}
