class AmusementParkRunner {
    public static void main(String[] parks) {

        String[] wonderlaGames = {"Water Slides", "Wave Pool", "Rain Dance"};
        AmusementPark park1 = new AmusementPark(1, "Wonderla", "Bengaluru", "Water Park", 1500.0, wonderlaGames);
        park1.getData();

        AmusementPark park2 = new AmusementPark(2, "Imagicaa");
        System.out.println("The park id is " + park2.parkId);
        System.out.println("The park name is " + park2.parkName);
        System.out.println();

        AmusementPark park3 = new AmusementPark("Mumbai", "Theme Park");
        System.out.println("The park place is " + park3.parkPlace);
        System.out.println("The type is " + park3.type);
        System.out.println();

       
        

        AmusementPark park5 = new AmusementPark();
        park5.parkId = 5;
        park5.parkName = "Ramoji Film City";
        park5.parkPlace = "Hyderabad";
        park5.type = "Theme Park";
        park5.price = 1600.0;
        
        park5.getData();
    }
}