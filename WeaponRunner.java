class WeaponRunner {
    public static void main(String[] weapons) {

        Weapon firstWeapon = new Weapon(1, "Sword", "steel", 3.5, 1500);
        firstWeapon.getData();

        Weapon secondWeapon = new Weapon(2, "Bow");
        System.out.println("The weapon id is " + secondWeapon.weaponId);
        System.out.println("The category is " + secondWeapon.category);
        System.out.println();

        Weapon thirdWeapon = new Weapon("iron", 4.2);
        System.out.println("The material is " + thirdWeapon.material);
        System.out.println("The weight is " + thirdWeapon.weight);
        System.out.println();

        Weapon fourthWeapon = new Weapon();
        fourthWeapon.weaponId = 4;
        fourthWeapon.category = "Spear";
        fourthWeapon.material = "steel";
        fourthWeapon.weight = 3.0;
        fourthWeapon.price = 1250;
        fourthWeapon.getData();
    }
}
