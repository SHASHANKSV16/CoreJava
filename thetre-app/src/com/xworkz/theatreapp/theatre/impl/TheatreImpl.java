package com.xworkz.theatreapp.theatre.impl;

import com.xworkz.theatreapp.theatre.Theatre;

public class TheatreImpl implements Theatre {
    @Override
    public void startShow() {
        System.out.println("Theatre show has started");
    }

    @Override
    public void endShow() {
        System.out.println("Theatre show has ended");
    }

    @Override
    public void sellTicket() {
        System.out.println("Theatre ticket sold");
    }
}
