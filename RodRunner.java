class RodRunner {
    public static void main(String[] rods) {

        String colors[] = {"black", "grey", "blue"};

        Rod firstRod = new Rod(1, "steel", 150.0, 120.0, "TMT", colors);
        firstRod.getData();

        Rod secondRod = new Rod(2, "iron");
        System.out.println("The rod id is " + secondRod.rodId);
        System.out.println("The type is " + secondRod.type);
        System.out.println();

        Rod thirdRod = new Rod(200.0, 150.0);
        System.out.println("The length is " + thirdRod.length);
        System.out.println("The price is " + thirdRod.price);
        System.out.println();

        Rod fourthRod = new Rod();
        fourthRod.rodId = 4;
        fourthRod.type = "copper";
        fourthRod.length = 180.0;
        fourthRod.price = 170.0;
        fourthRod.grade = "Premium";
        fourthRod.colors = colors;
        fourthRod.getData();
    }
}
