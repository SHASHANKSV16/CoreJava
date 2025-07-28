class AmusementPark{
	
	int parkId;
	String parkName;
	String parkPlace;
	String type;
	Double price;
	
	AmusementPark(int parkId, String parkName, String parkPlace, String type, double price) {
        System.out.println("Parameterized constructor is invoked");
        this.parkId = parkId;
        this.parkName = parkName;
        this.parkPlace = parkPlace;
        this.type = type;
        this.price = price;
    }


    public void getData() {
        System.out.println("The park id is " + parkId);
        System.out.println("The park name is " + parkName);
        System.out.println("The park place is " + parkPlace);
        System.out.println("The type is " + type);
        System.out.println("The price is " + price);
        System.out.println();
    }
}