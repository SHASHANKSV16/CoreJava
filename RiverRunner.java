class RiverRunner {
    public static void main(String[] ganga) {

        String name = River.name();
        System.out.println("River Name " + name);

        String origin = River.source();
        System.out.println("Origin " + origin);

        double length = River.length();
        System.out.println("Length " + length + " km");

        boolean polluted = River.pollutionStatus();
        System.out.println("Is it polluted " + polluted);

        String areas = River.regions();
        System.out.println("Flows through " + areas);
    }
}
