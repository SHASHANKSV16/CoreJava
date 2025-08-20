package com.xworkz.gymequipementapp.gymequipement;

public class GymEquipement {
    int equipmentId;
    String name;
    String type;
    String brand;
    double price;
    double weight;

    GymEquipement(int equipmentId, String name, String type, String brand, double price, double weight) {
        this.equipmentId = equipmentId;
        this.name = name;
        this.type = type;
        this.brand = brand;
        this.price = price;
        this.weight = weight;
    }

    public void getData() {
        System.out.println("the equipment id is " + equipmentId);
        System.out.println("the name is " + name);
        System.out.println("the type is " + type);
        System.out.println("the brand is " + brand);
        System.out.println("the price is " + price);
        System.out.println("the weight is " + weight);
        System.out.println();
    }
}
