class Pipe {
    int pipeId;
    double diameter;  
    double length;    
    String color;
    double price;
	
	
	 Pipe(int pipeId, double diameter, double length, String color, double price) {
        System.out.println("Parameterized constructor");
        this.pipeId = pipeId;
        this.diameter = diameter;
        this.length = length;
        this.color = color;
        this.price = price;
    }

    
    public void getData() {
        System.out.println("the pipe id is " + pipeId);
        System.out.println("the diameter is " + diameter);
        System.out.println("the length is " + length);
        System.out.println("the color is " + color);
        System.out.println("the price is " + price);
        System.out.println();
    }
}
