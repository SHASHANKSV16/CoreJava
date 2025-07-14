class GamingPcRunner {
    public static void main(String[] gaming) {

        String cpu = GamingPc.getProcessor();
        System.out.println("Processor: " + cpu);

        int ram = GamingPc.getRam();
        System.out.println("RAM: " + ram  );

        String gpu = GamingPc.getGraphicsCard();
        System.out.println("Graphics Card: " + gpu);

        double price = GamingPc.getPrice();
        System.out.println("Price: " + price);

        boolean rgb = GamingPc.hasRGB();
        System.out.println("Has RGB Lighting: " + rgb);
    }
}
