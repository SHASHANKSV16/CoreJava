package com.xworkz.purifierapp.prifier.impl;

import com.xworkz.purifierapp.prifier.Purifier;

public class PurifierImpl implements Purifier {
    @Override
    public void startPurification() {
        System.out.println("Water purification started");
    }

    @Override
    public void stopPurification() {
        System.out.println("Water purification stopped");
    }

    @Override
    public void checkWaterQuality() {
        System.out.println("Water quality checked");
    }
}
