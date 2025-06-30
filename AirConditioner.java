class AirConditioner {
	  static String brand = "Daikin";
      static  String model = "MTKL50U";
      static  double capacityTons = 1.5;
      static  int energyRating = 3;
      static  double annualEnergyConsumption = 966.47; 
      static  int noiseLevelDb = 35;
      static  String installationType = "Split System";
      static  int price = 37489;
	
	
	
    public static void main(String[] Air) {
        System.out.println("main started");

        /*String brand = "Daikin";
        String model = "MTKL50U";
        double capacityTons = 1.5;
        int energyRating = 3;
        double annualEnergyConsumption = 966.47; 
        int noiseLevelDb = 35;
        String installationType = "Split System";
        int price = 37489;*/

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Capacity: " + capacityTons );
        System.out.println("Energy Efficiency Rating: " + energyRating );
        System.out.println("Annual Energy Consumption: " + annualEnergyConsumption );
        System.out.println("Noise Level: " + noiseLevelDb );
        System.out.println("Installation Type: " + installationType);
        System.out.println("Price: ₹" + price);
        System.out.println("main ended");
    }
}
