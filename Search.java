class Search {
    public static void findProduct(String productName) {
        System.out.println("Searching for product is " + productName);
        Cart.addToCart(productName, 1);
    }
}