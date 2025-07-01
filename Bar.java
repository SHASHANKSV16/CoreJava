class Bar {
    public static void main(String alcohol[]) {

        String alcoholNames[] = { "Whiskey", "Vodka", "Rum", "Gin", "Tequila", "Brandy",
		"Beer", "Wine", "Scotch", "Champagne", "Absinthe", "Cognac" };

        System.out.println(alcoholNames[0]);
        System.out.println(alcoholNames[1]);
        System.out.println(alcoholNames[2]);
        System.out.println(alcoholNames[3]);
        System.out.println(alcoholNames[4]);
        System.out.println(alcoholNames[5]);
        System.out.println(alcoholNames[6]);
        System.out.println(alcoholNames[7]);
        System.out.println(alcoholNames[8]);
        System.out.println(alcoholNames[9]);
        System.out.println(alcoholNames[10]);
        System.out.println(alcoholNames[11]);

        for (String drink : alcoholNames) {
            System.out.println(drink);
        }
    }
}
