class Helmet {
	static    String brand = "Steelbird";
    static    String color = "Glossy Fluo Orange/Blue with Clear Visor";
    static    String shape = "Full Face";
    static    String materialType = "Acrylonitrile Butadiene Styrene (ABS)";
    static    String ageRange = "Adult";
       
    static    String includedComponents = "1 Helmet";
    static    int price = 1399;
	
    public static void main(String[] BikeGears) {
        System.out.println("main started");

        // String brand = "Steelbird";
        // String color = "Glossy Fluo Orange/Blue with Clear Visor";
        // String shape = "Full Face";
        // String materialType = "Acrylonitrile Butadiene Styrene (ABS)";
        // String ageRange = "Adult";
        
        // String includedComponents = "1 Helmet";
        // int price = 1399;

        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Shape: " + shape);
        System.out.println("Material Type: " + materialType);
        System.out.println("Age Range: " + ageRange);
        System.out.println("Included Components: " + includedComponents);
        System.out.println("Price: ₹" + price);

        System.out.println("main ended");
    }
}
