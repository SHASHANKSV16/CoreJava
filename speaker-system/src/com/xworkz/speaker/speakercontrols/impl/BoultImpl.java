package com.xworkz.speaker.speakercontrols.impl;

import com.xworkz.speaker.speakercontrols.SpeakerControls;

public class BoultImpl implements SpeakerControls {
    @Override
    public void turnOn() {
        System.out.println("speaker is turned on");
    }

    @Override
    public void increaseVolume() {
        System.out.println("volume is increased");

    }

    @Override
    public void decreaseVolume() {
        System.out.println("volume is decreased");
    }
}
