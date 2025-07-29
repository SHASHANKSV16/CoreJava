class HatRunner {
    public static void main(String[] hats) {

        String colors[] = {"Black", "Red", "Blue"};

        Hat firstHat = new Hat(1, colors, "Medium", "Wool", 250.0);
        firstHat.getData();

        Hat secondHat = new Hat("Large", "Cotton");
        System.out.println("The size is " + secondHat.size);
        System.out.println("The fabric type is " + secondHat.fabricType);
        System.out.println();

        Hat thirdHat = new Hat("Polyester", 180.0);
        System.out.println("The fabric type is " + thirdHat.fabricType);
        System.out.println("The price is " + thirdHat.price);
        System.out.println();

        Hat fourthHat = new Hat();
        fourthHat.hatId = 4;
        fourthHat.colors = colors;
        fourthHat.size = "Small";
        fourthHat.fabricType = "Linen";
        fourthHat.price = 200.0;
        fourthHat.getData();
    }
}


        
