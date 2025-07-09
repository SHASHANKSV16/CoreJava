class Broker {
    public static void brokerage(String vegetable, int quantity) {
        System.out.println("Broker arranges  for " + quantity + "kg of " + vegetable);
        Farmer.farm(vegetable, quantity);
    }
}