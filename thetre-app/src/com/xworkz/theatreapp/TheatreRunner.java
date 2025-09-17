package com.xworkz.theatreapp;

import com.xworkz.theatreapp.theatre.Theatre;
import com.xworkz.theatreapp.theatre.impl.TheatreImpl;

public class TheatreRunner {
    public static void main(String[] args) {
        Theatre theatre = new TheatreImpl();
        theatre.sellTicket();
        theatre.startShow();
        theatre.endShow();
    }
}
