class FlowerRunner {
    public static void main(String[] flowerss) {

        String[] colors = {"red", "white", "pink"};

        Flower firstFlower = new Flower(1, "Rose", colors, 15.0);
        firstFlower.getData();

        Flower secondFlower = new Flower(2, "Jasmine");
        System.out.println("The flower id is " + secondFlower.flowerId);
        System.out.println("The name is " + secondFlower.name);
        System.out.println();

        Flower thirdFlower = new Flower(20.0);
        System.out.println("The price is " + thirdFlower.price);
        System.out.println();

        Flower fourthFlower = new Flower("Lily");
        System.out.println("The name is " + fourthFlower.name);
        System.out.println();

        Flower fifthFlower = new Flower();
        fifthFlower.flowerId = 5;
        fifthFlower.name = "Tulip";
        fifthFlower.colors = colors;
        fifthFlower.price = 30.0;
        fifthFlower.getData();
    }
}
