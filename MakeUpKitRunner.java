class MakeUpKitRunner {
    public static void main(String[] makeUp) {

        String brand = MakeUpKit.getBrand();
        System.out.println("Brand: " + brand);

        int items = MakeUpKit.getItemCount();
        System.out.println("Number of items: " + items);

        boolean mirror = MakeUpKit.hasMirrorInside();
        System.out.println("Has Mirror " + mirror);

        double price = MakeUpKit.getPrice();
        System.out.println("Price: " + price);

        
    }
}
