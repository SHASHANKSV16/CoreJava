package com.xworkz.monitorsystem;

import com.xworkz.monitorsystem.controls.Controls;
import com.xworkz.monitorsystem.controls.impl.DellMonitorImpl;

public class MonitorRunner {
    public static void main(String[] args) {
        Controls dell =  new DellMonitorImpl();
        dell.turnOn();
        dell.setBrightness(6);
        dell.turnOff();
    }
}
