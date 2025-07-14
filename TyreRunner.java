class TyreRunner {
    public static void main(String[] tyre) {

        String brand = Tyre.getBrand();
        System.out.println("Tyre Brand: " + brand);

        int diameter = Tyre.getDiameter();
        System.out.println("Diameter: " + diameter );

        boolean tubeless = Tyre.isItTubeless();
        System.out.println("Is it Tubeless? " + tubeless);

        double price = Tyre.getPrice();
        System.out.println("Price: " + price);

        String vehicleType = Tyre.getSuitableFor();
        System.out.println("Suitable for: " + vehicleType);
    }
}
