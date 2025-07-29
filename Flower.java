class Flower {

    int flowerId;
    String name;
    String colors[];
    double price;

    Flower() {
    }

    Flower(int flowerId, String name) {
        this.flowerId = flowerId;
        this.name = name;
    }

    Flower(double price) {
        this.price = price;
    }

    Flower(String name) {
        this.name = name;
    }

    Flower(int flowerId, String name, String colors[], double price) {
     
        this.flowerId = flowerId;
        this.name = name;
        this.colors = colors;
        this.price = price;
    }

    public void getData() {
        System.out.println("The flower id is " + flowerId);
        System.out.println("The name is " + name);
        System.out.println("The colors are: ");
        if (colors != null) {
            for (String c : colors) {
                System.out.println(c);
            }
        }
        System.out.println("The price is " + price);
        System.out.println();
    }
}
