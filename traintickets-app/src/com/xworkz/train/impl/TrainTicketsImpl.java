package com.xworkz.train.impl;

import com.xworkz.train.tickets.TrainTickets;

public class TrainTicketsImpl implements TrainTickets {
    public void reserveSeat() {
        System.out.println("Train seat reserved successfully");
    }

    @Override
    public void cancelReservation() {
        System.out.println("Train reservation cancelled");
    }

    @Override
    public void viewReservation() {
        System.out.println("Viewing train reservation details");
    }
}
