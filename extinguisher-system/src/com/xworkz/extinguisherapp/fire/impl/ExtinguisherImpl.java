package com.xworkz.extinguisherapp.fire.impl;

import com.xworkz.extinguisherapp.fire.Extinguisher;

public class ExtinguisherImpl implements Extinguisher {
    @Override
    public void extinguishFire() {
        System.out.println("Fire extinguished successfully");
    }

    @Override
    public void checkPressure() {
        System.out.println("Extinguisher pressure checked");
    }

    @Override
    public void refill() {
        System.out.println("Extinguisher refilled");
    }
}
