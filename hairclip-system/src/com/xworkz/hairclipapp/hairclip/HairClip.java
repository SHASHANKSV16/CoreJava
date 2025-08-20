package com.xworkz.hairclipapp.hairclip;

public class HairClip {
    int clipId;
    String brand;
    String material;
    String color;
    int price;

    HairClip(int clipId, String brand, String material, String color, int price) {

        this.clipId = clipId;
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
    }


    public void getData() {
        System.out.println("the clip id is " + clipId);
        System.out.println("the brand is " + brand);
        System.out.println("the material is " + material);
        System.out.println("the color is " + color);
        System.out.println("the price is " + price);
        System.out.println();
    }
}
