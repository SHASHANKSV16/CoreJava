class MarbleRunner {
    public static void main(String[] marbles) {

        
        String[] locations = {"Jaipur", "Makrana", "Udaipur"};

     
        Marble firstMarble = new Marble(1, "Black", "Round", 2541.00, true, locations);
        firstMarble.getData();

     
        Marble secondMarble = new Marble(2, "Red");
        System.out.println("the marble id is " + secondMarble.marbleId);
        System.out.println("the colour is " + secondMarble.colour);
        System.out.println();

        Marble thirdMarble = new Marble("Square", 3500.00);
        System.out.println("the shape is " + thirdMarble.shape);
        System.out.println("the price is " + thirdMarble.price);
        System.out.println();

       
        Marble fourthMarble = new Marble("Green", "Oval", true);
        System.out.println("the colour is " + fourthMarble.colour);
        System.out.println("the shape is " + fourthMarble.shape);
        System.out.println("is that rajasthan marble " + fourthMarble.isRajasthanMarble);
        System.out.println();

       
        Marble fifthMarble = new Marble();
        fifthMarble.marbleId = 5;
        fifthMarble.colour = "White";
        fifthMarble.shape = "Rectangle";
        fifthMarble.price = 4000.00;
        fifthMarble.isRajasthanMarble = false;
        fifthMarble.getData();
    }
}
