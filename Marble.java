class Marble{

	int marbleId;
	String colour;
	String shape;
	double price;
	boolean isRajasthanMarble;
	
	  Marble(int marbleId, String colour, String shape, double price, boolean isRajasthanMarble) {
        System.out.println("Parameterized constructor");
        this.marbleId = marbleId;
        this.colour = colour;
        this.shape = shape;
        this.price = price;
        this.isRajasthanMarble = isRajasthanMarble;
    }


    public void getData() {
        System.out.println("the marble id is " + marbleId);
        System.out.println("the colour is " + colour);
        System.out.println("the shape is " + shape);
        System.out.println("the price is " + price);
        System.out.println("is that rajasthan marble " + isRajasthanMarble);
        System.out.println();
    }

}