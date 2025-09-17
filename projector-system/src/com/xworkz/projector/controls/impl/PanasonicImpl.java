package com.xworkz.projector.controls.impl;

import com.xworkz.projector.controls.Controls;

public class PanasonicImpl implements Controls {
    @Override
    public void turnOn(){
        System.out.println("projector is turned on");
    }

    @Override
    public void setBrightness(int level) {
        System.out.println("projector is set brightness level "  +level);
    }

    @Override
    public void turnOff() {
        System.out.println("projector is turned off");
    }
}
