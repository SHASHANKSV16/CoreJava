class Television {
	static	String brand = "Acer";
    static    String model = "AR43GT2851UDFL";
    static    String modelName = "TV";
    static    int screenSizeInCm = 109;
    static    int modelYear = 2023;
    static    String dimensions = "8.1 x 96.5 x 56.8 cm";
    static    double weightInKg = 6.7;
    static    int ramSizeGB = 2;
    static    int storageCapacityGB = 16;
    static    int batteriesRequired = 2;
    static    int price = 32000; 
	
    public static void main(String[] Acer) {
        System.out.println("main started");

        // String brand = "Acer";
        // String model = "AR43GT2851UDFL";
        // String modelName = "TV";
        // int screenSizeInCm = 109;
        // int modelYear = 2023;
        // String dimensions = "8.1 x 96.5 x 56.8 cm";
        // double weightInKg = 6.7;
        // int ramSizeGB = 2;
        // int storageCapacityGB = 16;
        // int batteriesRequired = 2;
        // int price = 32000; 
		
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Model Name: " + modelName);
        System.out.println("Screen Size: " + screenSizeInCm + " cm");
        System.out.println("Model Year: " + modelYear);
        System.out.println("Product Dimensions: " + dimensions);
        System.out.println("Weight: " + weightInKg + " kg");
        System.out.println("RAM: " + ramSizeGB + " GB");
        System.out.println("Storage Capacity: " + storageCapacityGB + " GB");
        System.out.println("Batteries Required: " + batteriesRequired );
        System.out.println("Price: ₹" + price);

        System.out.println("main ended");
    }
}
