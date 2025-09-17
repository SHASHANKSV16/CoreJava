package com.xworkz.droneapp.drone.impl;

import com.xworkz.droneapp.drone.Drone;

public class DroneImpl implements Drone {
    @Override
    public void takePhoto() {
        System.out.println("Photo taken by ");
    }

    @Override
    public void recordVideo() {
        System.out.println("Video recording started ");
    }

    @Override
    public void powerOff() {
        System.out.println("Drone turned off");
    }
}
