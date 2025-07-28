class Hat {
    int hatId;
    String color;
    String size;
    String fabricType; 
    double price;
	
	 Hat(int hatId, String color, String size, String fabricType, double price) {
        System.out.println("Parameterized constructor");
        this.hatId = hatId;
        this.color = color;
        this.size = size;
        this.fabricType = fabricType;
        this.price = price;
    }

   
    public void getData() {
        System.out.println("the hat id is " + hatId);
        System.out.println("the color is " + color);
        System.out.println("the size is " + size);
        System.out.println("the fabric type is " + fabricType);
        System.out.println("the price is " + price);
        System.out.println();
    }
	
}
