package com.xworkz.projector;

import com.xworkz.projector.controls.Controls;
import com.xworkz.projector.controls.impl.PanasonicImpl;

public class ProjectorRunner {
    public static void main(String[] args) {
        Controls panasonic = new PanasonicImpl();
        panasonic.turnOn();
        panasonic.setBrightness(8);
        panasonic.turnOff();

    }
}
