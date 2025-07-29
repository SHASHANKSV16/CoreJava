class Marble {

    int marbleId;
    String colour;
    String shape;
    double price;
    boolean isRajasthanMarble;
    String[] locations; 

    Marble() {

    }

    Marble(int marbleId, String colour) {
        this.marbleId = marbleId;
        this.colour = colour;
    }

    Marble(String shape, double price) {
        this.shape = shape;
        this.price = price;
    }

    Marble(String colour, String shape, boolean isRajasthanMarble) {
        this.colour = colour;
        this.shape = shape;
        this.isRajasthanMarble = isRajasthanMarble;
    }

    // Constructor with array included
    Marble(int marbleId, String colour, String shape, double price, boolean isRajasthanMarble, String[] locations) {
        this.marbleId = marbleId;
        this.colour = colour;
        this.shape = shape;
        this.price = price;
        this.isRajasthanMarble = isRajasthanMarble;
        this.locations = locations;
    }

    public void getData() {
        System.out.println("the marble id is " + marbleId);
        System.out.println("the colour is " + colour);
        System.out.println("the shape is " + shape);
        System.out.println("the price is " + price);
        System.out.println("is that rajasthan marble " + isRajasthanMarble);

        
        if (locations != null) {
            System.out.print("Available in  ");
            for (String loc : locations) {
                System.out.println(loc);
            }
            System.out.println();
        }

        System.out.println();
    }
}
