package com.xworkz.ticketapp.ticket.impl;

import com.xworkz.ticketapp.ticket.Tickets;

public class TicketsImpl implements Tickets {
    @Override
    public void bookTicket() {
        System.out.println("Ticket booked successfully");
    }

    @Override
    public void cancelTicket() {
        System.out.println("Ticket cancelled");
    }

    @Override
    public void viewSeatNumber() {
        System.out.println("Your seat number is A12");
    }
}
