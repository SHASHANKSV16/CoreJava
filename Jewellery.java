class Jewellery {
    int jewelleryId;
    String type;
    String material;
    String design;
    double weight;
    double price;
	String[] manufactures;

    Jewellery() {
     
    }

    Jewellery(int jewelleryId, String type) {
        this.jewelleryId = jewelleryId;
        this.type = type;
    }

    Jewellery(String material, double price) {
        this.material = material;
        this.price = price;
    }

    Jewellery(int jewelleryId, String type, String material, String design, double weight, double price,String manufactures[]) {
    
        this.jewelleryId = jewelleryId;
        this.type = type;
        this.material = material;
        this.design = design;
        this.weight = weight;
        this.price = price;
		this.manufactures = manufactures;
    }

    public void getData() {
        System.out.println("the jewellery id is " + jewelleryId);
        System.out.println("the type is " + type);
        System.out.println("the material is " + material);
        System.out.println("the design is " + design);
        System.out.println("the weight is " + weight);
        System.out.println("the price is " + price);
		if(manufactures!= null){
			for( String manufacture : manufactures){
				System.out.println(manufacture);
			}
		}
        System.out.println();
    }
}

