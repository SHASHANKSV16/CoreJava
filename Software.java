class Software {
    public static void installApps(String user, String model, String apps) {
        
        System.out.println("Installed apps " + apps);
        Security.enableSecurity(user, model);
    }
}