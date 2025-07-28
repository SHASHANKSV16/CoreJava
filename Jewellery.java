class Jewellery {
    int jewelleryId;
    String type;        
    String material;    
    String design;      
    double weight;      
    double price; 

Jewellery(int jewelleryId, String type, String material, String design, double weight, double price) {
        System.out.println("Parameterized constructor");
        this.jewelleryId = jewelleryId;
        this.type = type;
        this.material = material;
        this.design = design;
        this.weight = weight;
        this.price = price;
    }

   
    public void getData() {
        System.out.println("the jewellery id is " + jewelleryId);
        System.out.println("the type is " + type);
        System.out.println("the material is " + material);
        System.out.println("the design is " + design);
        System.out.println("the weight is " + weight);
        System.out.println("the price is " + price);
        System.out.println();
    }
	
}
