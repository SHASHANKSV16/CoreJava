package com.xworkz.stadiumapp;

import com.xworkz.stadiumapp.events.EventVenue;
import com.xworkz.stadiumapp.events.impl.Chepak;

public class StadiumRunner {
    public static void main(String[] args) {
        EventVenue eventVenue = new Chepak();
        eventVenue.manageTickets();
        eventVenue.scheduleEvent();
        eventVenue.ensureSafety();
    }
}
