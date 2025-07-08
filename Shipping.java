class Shipping {
    public static void enterShippingDetails(String user, String address) {
        System.out.println("Shipping address is  " + address);
        Payment.confirmPayment(user, "UPI");
    }
}
