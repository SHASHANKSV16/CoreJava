package com.xworkz.jewelleryapp.jewellery;

public class JewelleryRunner {
    public static void main(String[] args) {

        Jewellery firstJewellery = new Jewellery(1, "Necklace", "Gold", "Traditional", 25.5, 95000.0);
        firstJewellery.getData();

        Jewellery secondJewellery = new Jewellery(2, "Ring", "Silver", "Modern", 5.2, 3200.0);
        secondJewellery.getData();
    }
}
