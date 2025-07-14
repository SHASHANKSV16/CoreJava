class GardenRunner {
    public static void main(String[] info) {

        String name = Garden.name();
        System.out.println("Garden Name is " + name);

        String city = Garden.place();
        System.out.println("Location is " + city);

        int benchCount = Garden.benches();
        System.out.println("Number of benches " + benchCount);

        boolean open = Garden.openStatus();
        System.out.println("Is it open to public " + open);

        String highlight = Garden.special();
        System.out.println("Famous for " + highlight);
    }
}
