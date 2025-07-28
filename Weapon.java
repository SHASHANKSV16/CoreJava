class Weapon {
    int weaponId;
    String category; 
    String material;
    double weight;
    int price;
	
	Weapon(int weaponId, String category, String material, double weight, int price) {
        System.out.println("Parameterized constructor");
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
