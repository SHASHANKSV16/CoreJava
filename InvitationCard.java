class InvitationCard {
    int cardId;
    String occasion;     
    String color;
    double price;
    String shape; 


 InvitationCard(int cardId, String occasion, String color, double price, String shape) {
        System.out.println("Parameterized constructor");
        this.cardId = cardId;
        this.occasion = occasion;
        this.color = color;
        this.price = price;
        this.shape = shape;
    }

    
    public void getData() {
        System.out.println("the card id is " + cardId);
        System.out.println("the occasion is " + occasion);
        System.out.println("the color is " + color);
        System.out.println("the price is " + price);
        System.out.println("the shape is " + shape);
        System.out.println();
    }	
}
