package com.xworkz.bellapp.bell.impl;

import com.xworkz.bellapp.bell.Bell;

public class BellImpl implements Bell {
    @Override
    public void ring() {
        System.out.println("Bell is ringing");
    }

    @Override
    public void mute() {
        System.out.println("Bell is muted");
    }

    @Override
    public void setTone() {
        System.out.println("Bell tone set");
    }
}
