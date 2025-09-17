package com.xworkz.remote.control.impl;

import com.xworkz.remote.control.Remote;

public class SonyRemoteImpl implements Remote {

    @Override
    public void powerOn() {
        System.out.println("tv is turned on");
    }

    @Override
    public void powerOff() {
        System.out.println("tv is turned off");

    }

    @Override
    public void changeChannel(int channelNumber) {
        System.out.println("the channel number is " + channelNumber);

    }
}
