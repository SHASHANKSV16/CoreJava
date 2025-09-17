package com.xworkz.remote;

import com.xworkz.remote.control.Remote;
import com.xworkz.remote.control.impl.SonyRemoteImpl;

public class TvRunner {
    public static void main(String[] args) {
        Remote remote = new SonyRemoteImpl();
        remote.powerOn();
        remote.changeChannel(25);
        remote.powerOff();
    }
}
