class GoldRunner {
    public static void main(String[] args) {

        double weight = Gold.getWeight();
        System.out.println("Gold Weight " + weight + " grams");

        double price = Gold.getPricePerGram();
        System.out.println("Price per gram " + price);

        String purity = Gold.getPurity();
        System.out.println("Gold Purity: " + purity);

        String type = Gold.getType();
        System.out.println("Gold Type: " + type);

        boolean hallmark = Gold.isHallmarked();
        System.out.println("Is Hallmarked " + hallmark);
    }
}
