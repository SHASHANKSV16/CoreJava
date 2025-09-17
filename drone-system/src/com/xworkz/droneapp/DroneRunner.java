package com.xworkz.droneapp;

import com.xworkz.droneapp.drone.Drone;
import com.xworkz.droneapp.drone.impl.DroneImpl;

public class DroneRunner {
    public static void main(String[] args) {
        Drone drone = new DroneImpl();
        drone.takePhoto();
        drone.recordVideo();
        drone.powerOff();
    }
}
