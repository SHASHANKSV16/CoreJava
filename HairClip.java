class HairClip {
    int clipId;
    String brand;
    String material;
    String colors[];
    int price;

    HairClip() {
    }

    HairClip(int clipId, String brand) {
        this.clipId = clipId;
        this.brand = brand;
    }

    HairClip(String brand, String material) {
        this.brand = brand;
        this.material = material;
    }

    HairClip(int clipId, String brand, String material, String colors[], int price) {
        System.out.println("Parameterized constructor");
        this.clipId = clipId;
        this.brand = brand;
        this.material = material;
        this.colors = colors;
        this.price = price;
    }

    public void getData() {
        System.out.println("The clip id is " + clipId);
        System.out.println("The brand is " + brand);
        System.out.println("The material is " + material);

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
