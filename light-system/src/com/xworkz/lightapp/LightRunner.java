package com.xworkz.lightapp;

import com.xworkz.lightapp.controls.LightControls;
import com.xworkz.lightapp.controls.impl.MaxLedImpl;

public class LightRunner {
    public static void main(String[] args) {
        LightControls maxLed = new MaxLedImpl();
        maxLed.turnOn();
        maxLed.colour("yellow");
        maxLed.turnOff();
    }
}
