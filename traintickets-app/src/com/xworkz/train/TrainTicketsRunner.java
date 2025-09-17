package com.xworkz.train;

import com.xworkz.train.impl.TrainTicketsImpl;
import com.xworkz.train.tickets.TrainTickets;

public class TrainTicketsRunner {
    public static void main(String[] args) {
        TrainTickets trainTicket = new TrainTicketsImpl();
        trainTicket.reserveSeat();
        trainTicket.viewReservation();
        trainTicket.cancelReservation();
    }
}
