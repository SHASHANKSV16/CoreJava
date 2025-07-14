class DisneyLandRunner {
    public static void main(String[] disney) {

        String location = DisneyLand.getLocation();
        System.out.println("DisneyLand Location: " + location);

        int rides = DisneyLand.getNumberOfRides();
        System.out.println("Number of Rides  " + rides);

        boolean parade = DisneyLand.hasParadeShow();
        System.out.println("Has Parade Show  " + parade);

        double fee = DisneyLand.getEntryFee();
        System.out.println("Entry Fee: " + fee);

        String character = DisneyLand.getFamousCharacter();
        System.out.println("Most Famous Character: " + character);
    }
}
