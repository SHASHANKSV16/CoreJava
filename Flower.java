class Flower {
    int flowerId;
    String name;
    String color;
    double price;

  Flower(int flowerId, String name, String color, double price) {
        System.out.println("Parameterized constructor");
        this.flowerId = flowerId;
        this.name = name;
        this.color = color;
        this.price = price;
    }

    
    public void getData() {
        System.out.println("the flower id is " + flowerId);
        System.out.println("the name is " + name);
        System.out.println("the color is " + color);
        System.out.println("the price is " + price);
        System.out.println();
    }	
}
