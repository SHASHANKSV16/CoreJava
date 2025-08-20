package com.xworkz.invitationcardapp;

import com.xworkz.invitationcardapp.invitationcard.InvitationCard;

public class InvitationCardRunner {
    public static void main(String[] args) {
       InvitationCard firstCard = new InvitationCard();
//        firstCard.getData();
//
//        InvitationCard secondCard = new InvitationCard(2, "Birthday", "Blue", 15.0, "square");
//        secondCard.getData();

        firstCard.setWireDetails(1, "Wedding", "Red", 25.0, "rectangle");
        firstCard.getWireDetails();
    }
}
