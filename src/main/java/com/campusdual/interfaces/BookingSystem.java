package com.campusdual.interfaces;

import java.util.Date;

public class BookingSystem {
    public static void main(String[] args) {
        CarBooking cb = new CarBooking("000000BBB");
        cb.book(new Date());
        cb.getTicketDetail();
        cb.cancelBook();
        cb.getTicketDetail();
        FlightBooking fb = new FlightBooking("Iberia", "1658548156");
        fb.book(new Date(), "V72");
        fb.book(new Date(), "V73");
        fb.getTicketDetail();
        }
}
