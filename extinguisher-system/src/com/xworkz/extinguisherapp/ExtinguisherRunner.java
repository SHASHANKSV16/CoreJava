package com.xworkz.extinguisherapp;

import com.xworkz.extinguisherapp.fire.Extinguisher;
import com.xworkz.extinguisherapp.fire.impl.ExtinguisherImpl;

public class ExtinguisherRunner {
    public static void main(String[] args) {
        Extinguisher extinguisher = new ExtinguisherImpl();
        extinguisher.checkPressure();
        extinguisher.extinguishFire();
        extinguisher.refill();
    }
}
