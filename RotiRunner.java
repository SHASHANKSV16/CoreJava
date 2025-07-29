public class RotiRunner {
    public static void main(String[] rotis) {

        Roti firstRoti = new Roti(1, "Wheat", "Medium", 10.0, false);
        firstRoti.getData();

        Roti secondRoti = new Roti(2, "Maida");
        System.out.println("The roti id is " + secondRoti.rotiId);
        System.out.println("The type is " + secondRoti.type);
        System.out.println();

        Roti thirdRoti = new Roti("Small", 12.0);
        System.out.println("The size is " + thirdRoti.size);
        System.out.println("The price is " + thirdRoti.price);
        System.out.println();

        Roti fourthRoti = new Roti();
        fourthRoti.rotiId = 4;
        fourthRoti.type = "Jowar";
        fourthRoti.size = "Medium";
        fourthRoti.price = 13.5;
        fourthRoti.isTandoori = false;
        fourthRoti.getData();
    }
}
