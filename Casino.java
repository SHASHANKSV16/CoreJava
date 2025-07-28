class Casino {
    int casinoId;
    String name;
    String location;
    int numberOfGames;
    boolean isOpen24Hours;
	
	 Casino(int casinoId, String name, String location, int numberOfGames, boolean isOpen24Hours) {
        System.out.println("Parameterized constructor");
        this.casinoId = casinoId;
        this.name = name;
        this.location = location;
        this.numberOfGames = numberOfGames;
        this.isOpen24Hours = isOpen24Hours;
    }


    public void getData() {
        System.out.println("The casino id is " + casinoId);
        System.out.println("The name is " + name);
        System.out.println("The location is " + location);
        System.out.println("The number of games is " + numberOfGames);
        System.out.println("Is open 24 hours: " + isOpen24Hours);
        System.out.println();
    }

}
