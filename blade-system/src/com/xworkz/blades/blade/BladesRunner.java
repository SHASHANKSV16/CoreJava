package com.xworkz.blades.blade;

public class BladesRunner {
    public static void main(String[] args) {
        Blade firstBlade = new Blade(1, "Gillette", "Stainless Steel", "Double Edge", "Shaving");
        firstBlade.getData();

        Blade secondBlade = new Blade(2, "Feather", "Platinum Coated", "Single Edge", "Shaving");
        secondBlade.getData();
    }
}
