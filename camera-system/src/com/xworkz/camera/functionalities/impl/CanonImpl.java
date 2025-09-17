package com.xworkz.camera.functionalities.impl;

import com.xworkz.camera.functionalities.Functionalities;

public class CanonImpl implements Functionalities {
    @Override
    public void capturePhoto() {
        System.out.println("photo captured");
    }

    @Override
    public void recordVideo() {
        System.out.println("video recorded");

    }

    @Override
    public void zoomIn() {
        System.out.println("zoomed in");

    }
}
