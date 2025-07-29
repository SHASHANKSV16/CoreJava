class Casino {
    int casinoId;
    String name;
    String location;
    String typeOfGames[];
    boolean isOpen24Hours;
	
	 Casino(int casinoId, String name, String location, String typeOfGames[], boolean isOpen24Hours) {
        System.out.println("Parameterized constructor");
        this.casinoId = casinoId;
        this.name = name;
        this.location = location;
        this.typeOfGames = typeOfGames;
        this.isOpen24Hours = isOpen24Hours;
    }
	
	Casino(){
		
	}
	Casino(int casinoId, String name){
		this.casinoId = casinoId;
        this.name = name;
		
	}
	Casino(String name, String location){
		this.name = name;
        this.location = location;
		
		
	}


    public void getData() {
        System.out.println("The casino id is " + casinoId);
        System.out.println("The name is " + name);
        System.out.println("The location is " + location);
        System.out.println("Is open 24 hours: " + isOpen24Hours);
		if (typeOfGames != null) {
            for (String typeOfGame : typeOfGames) {
                System.out.println(typeOfGame);
            }
        }
        System.out.println();
    }

}
