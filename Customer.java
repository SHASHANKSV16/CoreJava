class Customer {
    public static void buy(String vegetable, int quantity) {
        System.out.println("Customer wants to buy " + quantity + "kg of " + vegetable);
        Shop.sell(vegetable, quantity);
    }
}
