class Account {
    public static void signInOrRegister(String user) {
        System.out.println("User signed in  " + user);
        Shipping.enterShippingDetails(user, "Bangalore, Karnataka");
    }
}