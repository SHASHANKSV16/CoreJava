class Checkout {
    public static void proceedToCheckout(String product) {
        System.out.println("items in cart " + product);
        
        Account.signInOrRegister("naresh");
    }
}