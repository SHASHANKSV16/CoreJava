package com.xworkz.bellapp;

import com.xworkz.bellapp.bell.Bell;
import com.xworkz.bellapp.bell.impl.BellImpl;

public class BellRunner {
    public static void main(String[] args) {
        Bell bell = new BellImpl();
        bell.ring();
        bell.setTone();
        bell.mute();
    }
}
