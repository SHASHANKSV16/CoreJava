class Rod {
    int rodId;
    String type;      
    double length;    
    double price;
    String grade;     
	
	  Rod(int rodId, String type, double length, double price, String grade) {
        System.out.println("Parameterized constructor");
        this.rodId = rodId;
        this.type = type;
        this.length = length;
        this.price = price;
        this.grade = grade;
    }

    public void getData() {
        System.out.println("the rod id is " + rodId);
        System.out.println("the type is " + type);
        System.out.println("the length is " + length);
        System.out.println("the price is " + price);
        System.out.println("the grade is " + grade);
        System.out.println();
    }
}
