package com.xworkz.blades.blade;

public class Blade {
    int bladeId;
    String brand;
    String material;
    String type;
    String usage;

    Blade(int bladeId, String brand, String material, String type, String usage) {
        System.out.println("Parameterized constructor");
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
        System.out.println("The usage is " + usage);
        System.out.println();
    }
}
