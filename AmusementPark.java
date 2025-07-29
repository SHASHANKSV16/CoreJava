class AmusementPark {

    int parkId;
    String parkName;
    String parkPlace;
    String type;
    Double price;
    String typeOfGames[];

    AmusementPark() {
        
    }

    AmusementPark(int parkId, String parkName) {
        this.parkId = parkId;
        this.parkName = parkName;
    }

    AmusementPark(String parkPlace, String type) {
        this.parkPlace = parkPlace;
        this.type = type;
    }

    
    AmusementPark(double price, String[] typeOfGames) {
        this.price = price;
        this.typeOfGames = typeOfGames;
    }

    AmusementPark(int parkId, String parkName, String parkPlace, String type, double price, String typeOfGames[]) {
        System.out.println("Parameterized constructor is invoked");
        this.parkId = parkId;
        this.parkName = parkName;
        this.parkPlace = parkPlace;
        this.type = type;
        this.price = price;
        this.typeOfGames = typeOfGames;
    }

    public void getData() {
        System.out.println("The park id is " + parkId);
        System.out.println("The park name is " + parkName);
        System.out.println("The park place is " + parkPlace);
        System.out.println("The type is " + type);
        System.out.println("The price is " + price);

        if (typeOfGames != null) {
            System.out.print("The type of games are ");
            for (String game : typeOfGames) 
                System.out.println(game);
            
           
        }
        System.out.println();
    }
}