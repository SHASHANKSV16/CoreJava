class WalkieTalkieRunner {
    public static void main(String[] args) {

        String brand = WalkieTalkie.getBrand();
        System.out.println("Brand " + brand);

        double range = WalkieTalkie.getRange();
        System.out.println("Range" + range + " km");

        boolean waterResistant = WalkieTalkie.isWaterResistant();
        System.out.println("Is Water Resistant " + waterResistant);

        int battery = WalkieTalkie.getBatteryBackup();
        System.out.println("Battery Backup " + battery + " hours");

        boolean noiseCancel = WalkieTalkie.hasNoiseCancellationFeature();
        System.out.println("Has Noise Cancellation " + noiseCancel);
    }
}
