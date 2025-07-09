class Cart {
    public static void addToCart(String product, int quantity) {
        System.out.println("Added to cart: " + product + " of quantity " + quantity );
        Checkout.proceedToCheckout(product);
    }
}