package com.xworkz.ticketapp;

import com.xworkz.ticketapp.ticket.Tickets;
import com.xworkz.ticketapp.ticket.impl.TicketsImpl;

public class TicketsRunner {
    public static void main(String[] args) {
        Tickets ticket = new TicketsImpl();
        ticket.bookTicket();
        ticket.viewSeatNumber();
        ticket.cancelTicket();
    }
}
