class Blade {

    int bladeId;
    String brand;
    String material;
    String type;
    String usage[];

    Blade() {
        
    }

    Blade(int bladeId, String brand) {
        this.bladeId = bladeId;
        this.brand = brand;
    }

    Blade(String material, String type) {
        this.material = material;
        this.type = type;
    }

    Blade(int bladeId, String brand, String material, String type, String usage[]) {
      
        this.bladeId = bladeId;
        this.brand = brand;
        this.material = material;
        this.type = type;
        this.usage = usage;
    }

    public void getData() {
        System.out.println("The blade id is " + bladeId);
        System.out.println("The brand is " + brand);
        System.out.println("The material is " + material);
        System.out.println("The type is " + type);

        System.out.print("The usage is ");
        if (usage != null) {
            for (String u : usage) {
                System.out.print(u);
            }
        }
       
    }
}
