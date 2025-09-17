package com.xworkz.refrigeratorapp;

import com.xworkz.refrigeratorapp.refrigerator.impl.LgImpl;
import com.xworkz.refrigeratorapp.refrigerator.Refrigerator;

public class RefrigeratorRunner {
    public static void main(String[] args) {


        Refrigerator refrigerator = new LgImpl();

        refrigerator.chillWater();
        refrigerator.coolingFood();
        refrigerator.Ice();
    }
}
