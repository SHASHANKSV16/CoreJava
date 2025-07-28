class Blazer{

	int blazerId;
	String colour;
	int noOfPockets;
	int noOfButtons;
	String typeOfMaterial;
	String type;
	
	
	Blazer(int blazerId, String colour, int noOfPockets, int noOfButtons, String typeOfMaterial, String type) {
        System.out.println("Parameterized constructor is invoked");
        this.blazerId = blazerId;
        this.colour = colour;
        this.noOfPockets = noOfPockets;
        this.noOfButtons = noOfButtons;
        this.typeOfMaterial = typeOfMaterial;
        this.type = type;
    }

    
    public void getData() {
        System.out.println("The blazer id is " + blazerId);
        System.out.println("The colour is " + colour);
        System.out.println("The number of pockets are " + noOfPockets);
        System.out.println("The number of buttons are " + noOfButtons);
        System.out.println("The material is " + typeOfMaterial);
        System.out.println("The type of blazer is " + type);
        System.out.println();
    }

}