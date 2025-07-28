public class Roti {
    
	int rotiId;
    String type;
    String size;
    double price;
    boolean isTandoori;
	

    Roti(int rotiId, String type, String size, double price, boolean isTandoori) {
        System.out.println("Parameterized constructor");
        this.rotiId = rotiId;
        this.type = type;
        this.size = size;
        this.price = price;
        this.isTandoori = isTandoori;
    }

    public void getData() {
        System.out.println("the roti id is " + rotiId);
        System.out.println("the type is " + type);
        System.out.println("the size is " + size);
        System.out.println("the price is " + price);
        System.out.println("is that tandoori roti " + isTandoori);
        System.out.println();
    }
}

	
	

