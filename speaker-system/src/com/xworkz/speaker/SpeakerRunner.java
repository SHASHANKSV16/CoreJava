package com.xworkz.speaker;

import com.xworkz.speaker.speakercontrols.SpeakerControls;
import com.xworkz.speaker.speakercontrols.impl.BoultImpl;

public class SpeakerRunner {

    public static void main(String[] args) {
        SpeakerControls boult = new BoultImpl();
        boult.turnOn();
        boult.decreaseVolume();
        boult.increaseVolume();
    }
}
