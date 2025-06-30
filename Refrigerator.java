class Refrigerator {
	
	static	String brand = "Haier";
    static    String model = "HEF-333TS-P";
    static    int capacityLitres = 328;
    static    int freshFoodCapacity = 254;
    static    int freezerCapacity = 74;
    static    int annualEnergyConsumption = 240; 
    static    String installationType = "Freestanding";
    static    String partNumber = "HEF-333TS-P";
    static    int price = 32990;
	
    public static void main(String[] Haier) {
        System.out.println("main started");

        // String brand = "Haier";
        // String model = "HEF-333TS-P";
        // int capacityLitres = 328;
        // int freshFoodCapacity = 254;
        // int freezerCapacity = 74;
        // int annualEnergyConsumption = 240; 
        // String installationType = "Freestanding";
        // String partNumber = "HEF-333TS-P";
        // int price = 32990;

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Total Capacity: " + capacityLitres + " litres");
        System.out.println("Refrigerator Fresh Food Capacity: " + freshFoodCapacity + " litres");
        System.out.println("Freezer Capacity: " + freezerCapacity + " litres");
        System.out.println("Annual Energy Consumption: " + annualEnergyConsumption + " kWh");
        System.out.println("Installation Type: " + installationType);
        System.out.println("Part Number: " + partNumber);
        System.out.println("Price: ₹" + price);

        System.out.println("main ended");
    }
}
