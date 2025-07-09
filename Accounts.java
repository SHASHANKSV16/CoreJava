class Accounts {
    public static void createUserAccount(String user, String model) {
        System.out.println("Creating account for " + user);
        System.out.println("Email: " + user + "@dell.com");
        System.out.println("Network and VPN access provided");
        Training.provideTraining(user);
    }
}