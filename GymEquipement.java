class GymEquipement {

    int equipmentId;
    String name;
    String type;
    String brand;
    double price;
    double weightsAvailable[];

    GymEquipement() {
    }

    GymEquipement(int equipmentId, String name) {
        this.equipmentId = equipmentId;
        this.name = name;
    }

    GymEquipement(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    GymEquipement(int equipmentId, String name, String type, String brand, double price, double weightsAvailable[]) {
     
        this.equipmentId = equipmentId;
        this.name = name;
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.weightsAvailable = weightsAvailable;
    }

    public void getData() {
        System.out.println("The equipment id is " + equipmentId);
        System.out.println("The name is " + name);
        System.out.println("The type is " + type);
        System.out.println("The brand is " + brand);
        System.out.println("The price is " + price);

        System.out.println("The weights available are  ");
        if (weightsAvailable != null) {
            for (double w : weightsAvailable) {
                System.out.println(w);
            }
        }
    }
}
