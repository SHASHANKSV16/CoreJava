class JewelleryRunner {
    public static void main(String[] malabar) {
		String manufactures[] = {"malabar","bhima","navratan"};
        Jewellery firstJewellery = new Jewellery(1, "Necklace", "Gold", "Traditional", 25.0, 50000.0,manufactures);
        firstJewellery.getData();

        Jewellery secondJewellery = new Jewellery(2, "Ring");
        System.out.println("the jewellery id is " + secondJewellery.jewelleryId);
        System.out.println("the type is " + secondJewellery.type);
        System.out.println();

        Jewellery thirdJewellery = new Jewellery("Silver", 2000.0);
        System.out.println("the material is " + thirdJewellery.material);
        System.out.println("the price is " + thirdJewellery.price);
        System.out.println();

        Jewellery fourthJewellery = new Jewellery();
        fourthJewellery.jewelleryId = 4;
        fourthJewellery.type = "Bangle";
        fourthJewellery.material = "Platinum";
        fourthJewellery.design = "Modern";
        fourthJewellery.weight = 15.0;
        fourthJewellery.price = 30000.0;
        fourthJewellery.getData();
    }
}
