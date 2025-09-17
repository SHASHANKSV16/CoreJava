package com.xworkz.monitorsystem.controls.impl;

import com.xworkz.monitorsystem.controls.Controls;

public class DellMonitorImpl implements Controls {
    @Override
    public void turnOn() {
        System.out.println("Monitor turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("monitor turned of");
    }

    @Override
    public void setBrightness(int level) {
        System.out.println("the brightness level is set at" + level);
    }
}
