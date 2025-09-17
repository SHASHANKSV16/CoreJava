package com.xworkz.purifierapp;

import com.xworkz.purifierapp.prifier.Purifier;
import com.xworkz.purifierapp.prifier.impl.PurifierImpl;

public class PurifierRunner {
    public static void main(String[] args) {
        Purifier purifier = new PurifierImpl();
        purifier.startPurification();
        purifier.checkWaterQuality();
        purifier.stopPurification();
    }
}
