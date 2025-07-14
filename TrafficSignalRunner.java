class TrafficSignalRunner {
    public static void main(String[] signal) {

        String color = TrafficSignal.getColors();
        System.out.println("Current Signal Color: " + color);

        int duration = TrafficSignal.getDuration();
        System.out.println("Signal Duration: " + duration + " seconds");

        boolean working = TrafficSignal.isSignalWorking();
        System.out.println("Is the signal working " + working);

        String location = TrafficSignal.getLocation();
        System.out.println("Signal Location: " + location);

        boolean hasCamera = TrafficSignal.hasCameraInstalled();
        System.out.println("Is  camera installed " + hasCamera);
    }
}
