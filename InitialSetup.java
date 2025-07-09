class InitialSetup {
    public static void configureLaptop(String user, String model, String os) {
        System.out.println("Initial setup for " + model);
        System.out.println(os + "OS installed " );
        Software.installApps(user, model, "IntelliJ, Chrome, Zoom");
    }
}