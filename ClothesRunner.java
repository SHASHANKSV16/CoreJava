class ClothesRunner {
    public static void main(String[] zudio) {

        String type = Clothes.getType();
        System.out.println("Clothing Type: " + type);

        String color = Clothes.getColor();
        System.out.println("Color: " + color);

        String size = Clothes.getSize();
        System.out.println("Size: " + size);

        double price = Clothes.getPrice();
        System.out.println("Price: " + price);

        boolean isCotton = Clothes.isCottonMaterial();
        System.out.println("Is it made of cotton " + isCotton);
    }
}
