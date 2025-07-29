class SafariRunner {
    public static void main(String[] forest) {

        String animals[] = {"lion", "tiger", "elephant"};

        Safari firstSafari = new Safari(1, "Adichunchunagiri Wildlife Sanctuary", 1981, 10.84, "Mandya", animals);
        firstSafari.getData();

        Safari secondSafari = new Safari(2, "Arabithittu Wildlife Sanctuary");
        System.out.println("The safariId is " + secondSafari.safariId);
        System.out.println("The name is " + secondSafari.name);
        System.out.println();

        Safari thirdSafari = new Safari(3, "Attiveri Bird Sanctuary", 1994, 2.23);
        System.out.println("The safariId is " + thirdSafari.safariId);
        System.out.println("The name is " + thirdSafari.name);
        System.out.println("The declared year is " + thirdSafari.declared);
        System.out.println("The length in km is " + thirdSafari.longKm);
        System.out.println();

        Safari fourthSafari = new Safari();
        fourthSafari.safariId = 4;
        fourthSafari.name = "Bhadra Wildlife Sanctuary";
        fourthSafari.declared = 1974;
        fourthSafari.longKm = 492.0;
        fourthSafari.district = "Chikkamagaluru";
        fourthSafari.animals = animals;
        fourthSafari.getData();
    }
}
