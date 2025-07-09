class Agent {
    public static void purchase(String vegetable, int quantity) {
        System.out.println("Agent supplies " + quantity + "kg of " + vegetable + " to shop");
        Broker.brokerage(vegetable, quantity);
    }
}