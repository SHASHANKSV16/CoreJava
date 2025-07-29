class InvitationCardRunner {
    public static void main(String[] cards) {
		
		String relative[] = {"Uncle", "Aunt", "Cousin"};
        InvitationCard firstCard = new InvitationCard(1, "Wedding", "Red", 25.0, "rectangle",relative);
        firstCard.getData();
		

        InvitationCard secondCard = new InvitationCard(2, "Birthday");
		System.out.println("the card id is " + secondCard.cardId);
        System.out.println("the occasion is " + secondCard.occasion);
		System.out.println();
        

        InvitationCard thirdCard = new InvitationCard("Gold", 30.0);
		System.out.println("the color is " + thirdCard.color);
        System.out.println("the price is " + thirdCard.price);
		System.out.println();
        

        InvitationCard fourthCard = new InvitationCard();
		fourthCard.cardId = 4 ;
		fourthCard.occasion = "Engagement";     
		fourthCard.color = "Purple";
		fourthCard.price =  22.5;
		fourthCard.shape = "rectangle"; 
        fourthCard.getData();

       
    }
}
