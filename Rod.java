class Rod {
    int rodId;
    String type;
    double length;
    double price;
    String grade;
    String colors[];

    Rod() {
    }

    Rod(int rodId, String type) {
        this.rodId = rodId;
        this.type = type;
    }

    Rod(double length, double price) {
        this.length = length;
        this.price = price;
    }

    Rod(int rodId, String type, double length, double price, String grade, String colors[]) {
        System.out.println("Parameterized constructor");
        this.rodId = rodId;
        this.type = type;
        this.length = length;
        this.price = price;
        this.grade = grade;
        this.colors = colors;
    }

    public void getData() {
        System.out.println("The rod id is " + rodId);
        System.out.println("The type is " + type);
        System.out.println("The length is " + length);
        System.out.println("The price is " + price);
        System.out.println("The grade is " + grade);

        System.out.println("The colors are ");
        if (colors != null) {
            for (String c : colors) {
                System.out.println(c);
            }
        }
     
    }
}
