class Hat {
    int hatId;
    String colors[];
    String size;
    String fabricType;
    double price;

    Hat() {
    }

    Hat(String size, String fabricType) {
        this.size = size;
        this.fabricType = fabricType;
    }

    Hat(String fabricType, double price) {
        this.fabricType = fabricType;
        this.price = price;
    }

    Hat(int hatId, String colors[], String size, String fabricType, double price) {
        System.out.println("Parameterized constructor");
        this.hatId = hatId;
        this.colors = colors;
        this.size = size;
        this.fabricType = fabricType;
        this.price = price;
    }

    public void getData() {
        System.out.println("The hat id is " + hatId);

        System.out.println("The colors are ");
        if (colors != null) {
            for (String c : colors) {
                System.out.print(c);
            }
        }

        System.out.println("The size is " + size);
        System.out.println("The fabric type is " + fabricType);
        System.out.println("The price is " + price);
        System.out.println();
    }
}
