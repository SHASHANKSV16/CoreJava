class CasinoRunner {
    public static void main(String[] casino) {
		
		String typeOfGames[] = {"Baccarat","Blackjack","Roulette"};
        Casino firstCasino = new Casino(1, "Star Spin", "Goa", typeOfGames, true);
        firstCasino.getData();

        Casino secondCasino = new Casino(2, "Lucky Streak");
        secondCasino.getData();

        Casino thirdCasino = new Casino("Golden Luck", "Daman");
        thirdCasino.getData();

        Casino fourthCasino = new Casino();
        fourthCasino.casinoId =4;
    fourthCasino.name = "Goa";
    fourthCasino.location = "Ace Tower";
    fourthCasino.typeOfGames = typeOfGames;
    fourthCasino.isOpen24Hours = false;
	fourthCasino.getData();

        
    }
}
