class Weapon {
    int weaponId;
    String category;
    String material;
    double weight;
    int price;

    Weapon() {
    }

    Weapon(int weaponId, String category) {
        this.weaponId = weaponId;
        this.category = category;
    }

    Weapon(String material, double weight) {
        this.material = material;
        this.weight = weight;
    }

    Weapon(int weaponId, String category, String material, double weight, int price) {
      
        this.weaponId = weaponId;
        this.category = category;
        this.material = material;
        this.weight = weight;
        this.price = price;
    }

    public void getData() {
        System.out.println("The weapon id is " + weaponId);
        System.out.println("The category is " + category);
        System.out.println("The material is " + material);
        System.out.println("The weight is " + weight);
        System.out.println("The price is " + price);
        System.out.println();
    }
}
