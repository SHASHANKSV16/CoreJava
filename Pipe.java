class Pipe {
    int pipeId;
    double diameter;
    double length;
    String colors[];
    double price;

    Pipe() {
    }

    Pipe(int pipeId, double diameter) {
        this.pipeId = pipeId;
        this.diameter = diameter;
    }

    Pipe(int pipeId, double diameter, double length) {
        this.pipeId = pipeId;
        this.diameter = diameter;
        this.length = length;
    }

    Pipe(int pipeId, double diameter, double length, String colors[], double price) {
        System.out.println("Parameterized constructor");
        this.pipeId = pipeId;
        this.diameter = diameter;
        this.length = length;
        this.colors = colors;
        this.price = price;
    }

    public void getData() {
        System.out.println("the pipe id is " + pipeId);
        System.out.println("the diameter is " + diameter);
        System.out.println("the length is " + length);
        if (colors != null) {
            System.out.println("the colors are ");
            for (String c : colors) {
                System.out.println(c);
            }
            System.out.println();
        }
        System.out.println("the price is " + price);
        System.out.println();
    }
}
