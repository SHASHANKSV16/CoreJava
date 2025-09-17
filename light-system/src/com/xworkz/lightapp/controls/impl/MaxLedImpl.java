package com.xworkz.lightapp.controls.impl;

import com.xworkz.lightapp.controls.LightControls;

public class MaxLedImpl implements LightControls {
    @Override
    public void turnOn() {
        System.out.println("light is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("light is turned off");

    }

    @Override
    public void colour(String color) {
        System.out.println("light is color changed to "+color);

    }
}
