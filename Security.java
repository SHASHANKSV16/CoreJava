class Security {
    public static void enableSecurity(String user, String model) {
        System.out.println("Applying security to " + user + " laptop");
        System.out.println("Enabled Antivirus");
        Accounts.createUserAccount(user, model);
    }
}