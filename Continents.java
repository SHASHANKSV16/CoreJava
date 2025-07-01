class Continents {
    public static void main(String earth[]) {

        String continent[] = { "Asia", "Africa", "North America", "South America",
		"Antarctica", "Europe", "Australia" };

        System.out.println(continent[0]);
        System.out.println(continent[1]);
        System.out.println(continent[2]);
        System.out.println(continent[3]);
        System.out.println(continent[4]);
        System.out.println(continent[5]);
        System.out.println(continent[6]);

        for (String cont : continent) {
            System.out.println(cont);
        }
    }
}
