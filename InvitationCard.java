class InvitationCard {
    int cardId;
    String occasion;     
    String color;
    double price;
    String shape;
	String[] relative;
	

	InvitationCard(){
		
	}
	InvitationCard(int cardId, String occasion){
		this.cardId = cardId;
        this.occasion = occasion;
		
	}
	InvitationCard(String color, double price){
		this.color = color;
        this.price = price;
	}
	

 InvitationCard(int cardId, String occasion, String color, double price, String shape,String relative[]) {
        System.out.println("Parameterized constructor");
        this.cardId = cardId;
        this.occasion = occasion;
        this.color = color;
        this.price = price;
        this.shape = shape;
		this.relative = relative;
    }

    
    public void getData() {
        System.out.println("the card id is " + cardId);
        System.out.println("the occasion is " + occasion);
        System.out.println("the color is " + color);
        System.out.println("the price is " + price);
        System.out.println("the shape is " + shape);
		if (relative != null) {
            System.out.print("Relatives invited: ");
			for (String name : relative) {
                System.out.println(name);
            }
          
	}
        System.out.println();
    }	
}
