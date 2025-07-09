class Shop {
    public static void sell(String vegetable, int quantity) {
        System.out.println("Shop sells " + quantity + "kg of " + vegetable + " to customer");
        Agent.purchase(vegetable, quantity);
    }
}