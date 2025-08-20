package com.xworkz.invitationcardapp.invitationcard;



public class InvitationCard {
    private int cardId;
    private String occasion;
    private String color;
    private  double price;
    private String shape;

    public void setWireDetails(int cardId, String occasion, String color, double price, String shape){
        this.cardId = cardId;
        this.occasion = occasion;
        this.color = color;
        this.price = price;
        this.shape = shape;

    }


//    public InvitationCard(int cardId, String occasion, String color, double price, String shape) {
//
//        this.cardId = cardId;
//        this.occasion = occasion;
//        this.color = color;
//        this.price = price;
//        this.shape = shape;
//    }


    public void getWireDetails() {
        System.out.println("the card id is " + cardId);
        System.out.println("the occasion is " + occasion);
        System.out.println("the color is " + color);
        System.out.println("the price is " + price);
        System.out.println("the shape is " + shape);
        System.out.println();
}
}
