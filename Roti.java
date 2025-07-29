public class Roti {

    int rotiId;
    String type;
    String size;
    double price;
    boolean isTandoori;

    Roti() {
    }

    Roti(int rotiId, String type) {
        this.rotiId = rotiId;
        this.type = type;
    }

    Roti(String size, double price) {
        this.size = size;
        this.price = price;
    }

    Roti(int rotiId, String type, String size, double price, boolean isTandoori) {
        
        this.rotiId = rotiId;
        this.type = type;
        this.size = size;
        this.price = price;
        this.isTandoori = isTandoori;
    }

    public void getData() {
        System.out.println("The roti id is " + rotiId);
        System.out.println("The type is " + type);
        System.out.println("The size is " + size);
        System.out.println("The price is " + price);
        System.out.println("Is that tandoori roti " + isTandoori);
        System.out.println();
    }
}
