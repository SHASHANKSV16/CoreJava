class CrackersRunner {
    public static void main(String[] crackerss) {

        String[] colors = {"blue", "red", "green"};

        Crackers firstCracker = new Crackers(1, "Twinkle Flash", "Sparkler", colors, 20.0);
        firstCracker.getData();

        Crackers secondCracker = new Crackers(2, "Boom Shot");
        System.out.println("The cracker id is " + secondCracker.crackerId);
        System.out.println("The name is " + secondCracker.name);
        System.out.println();

        Crackers thirdCracker = new Crackers("Glow Pot", "Flowerpot");
        System.out.println("The name is " + thirdCracker.name);
        System.out.println("The type is " + thirdCracker.type);
        System.out.println();

        Crackers fourthCracker = new Crackers(15.0);
        System.out.println("The price is " + fourthCracker.price);
        System.out.println();

        Crackers fifthCracker = new Crackers();
        fifthCracker.crackerId = 5;
        fifthCracker.name = "Thunder Blast";
        fifthCracker.type = "Rocket";
        fifthCracker.color = colors;
        fifthCracker.price = 30.0;
        fifthCracker.getData();
    }
}
