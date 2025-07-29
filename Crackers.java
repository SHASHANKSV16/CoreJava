class Crackers {

    int crackerId;
    String name;
    String type;
    String color[];
    double price;

    Crackers() {
    }

    Crackers(int crackerId, String name) {
        this.crackerId = crackerId;
        this.name = name;
    }

    Crackers(String name, String type) {
        this.name = name;
        this.type = type;
    }

    Crackers(double price) {
        this.price = price;
    }

    Crackers(int crackerId, String name, String type, String color[], double price) {
        System.out.println("Parameterized constructor");
        this.crackerId = crackerId;
        this.name = name;
        this.type = type;
        this.color = color;
        this.price = price;
    }

    public void getData() {
        System.out.println("The cracker id is " + crackerId);
        System.out.println("The name is " + name);
        System.out.println("The type is " + type);
        System.out.println("The colors are: ");
        if (color != null) {
            for (String c : color) {
                System.out.println(c);
            }
        }
   
        System.out.println("The price is " + price);
        System.out.println();
    }
}
