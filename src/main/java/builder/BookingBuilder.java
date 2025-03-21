package builder;

import controllers.BookingManager;
import models.Booking;

public class BookingBuilder {

    private BookingManager bookingManager;

    public BookingBuilder(BookingManager bookingManager) {
        this.bookingManager = bookingManager;
    }

    public Booking createBooking() {
        System.out.println("Creating booking using BookingBuilder.");
        return bookingManager.confirmBooking();
    }

    public void updateParkingSpace() {
        System.out.println("Updating parking space.");
    }

    public void populateBookingHashMap() {
        System.out.println("Populating booking hashmap.");
    }
}
