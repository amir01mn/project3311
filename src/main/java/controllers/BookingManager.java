package controllers;

import models.Booking;
import models.ParkingSpace;
import models.ParkingLot;
import models.User;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class BookingManager {
    public String bookingID;
    public User user;
    public ParkingSpace parkingSpace;
    public ParkingLot parkingLot;
    private String status;
    public LocalTime start;
    public LocalTime end;
    private HashMap<ParkingSpace, User> bookings;
    private String plate;

    public BookingManager() {
        bookings = new HashMap<>();
        status = "pending";
    }

    private boolean validatePlate(String plate) {
        return plate != null && !plate.isEmpty();
    }

    private void savePlate(String bookingID, String plate) {
        this.plate = plate;
        System.out.println("Saved plate " + plate + " for booking " + bookingID);
    }

    private void bookingReview(String sptID, LocalTime start, LocalTime end, double totalPrice, double deposit) {
        System.out.println("Reviewing booking for space: " + sptID);
    }

    private void proceedToPayment() {
        System.out.println("Proceeding to payment.");
    }

    private void saveBookingInfo(int userID, String sptID, Date date, LocalTime start, LocalTime end) {
        System.out.println("Saving booking info for user: " + userID);
    }

    private void updateBookingStatus(String bookingID, String status) {
        this.status = status;
        System.out.println("Booking " + bookingID + " updated to status: " + status);
    }

    public Booking confirmBooking() {
        Booking booking = new Booking();
        booking.setBookingID(bookingID);
        booking.setStatus("confirmed");
        System.out.println("Booking confirmed: " + booking.getBookingID());
        return booking;
    }

    public ArrayList<Booking> viewBooking() {
        return new ArrayList<>();
    }

    public Booking showBookingDetails(String bookingID) {
        Booking booking = new Booking();
        booking.setBookingID(bookingID);
        return booking;
    }

    private boolean requestCancellation(String bookingID) {
        System.out.println("Requesting cancellation for booking: " + bookingID);
        return true;
    }

    private void enable(String bookingID) {
        System.out.println("Enabling booking: " + bookingID);
    }

    private boolean requestExtend(String bookingID) {
        System.out.println("Requesting extension for booking: " + bookingID);
        return true;
    }

    public ArrayList<LocalTime> checkExtentionAvailability(String bookingID, Date date) {
        ArrayList<LocalTime> availableTimes = new ArrayList<>();
        availableTimes.add(LocalTime.of(10, 0));
        availableTimes.add(LocalTime.of(11, 0));
        return availableTimes;
    }

    private void sendBookingConfirmation() {
        System.out.println("Booking confirmation sent.");
    }

    public void editBooking() {
        System.out.println("Editing booking.");
    }

    public boolean isEmpty(String bookingID) {
        return false;
    }

    public void recordTimeOfLeave(LocalTime time) {
        System.out.println("Recorded time of leave: " + time);
    }

    public void end(String bookingID) {
        System.out.println("Ending booking: " + bookingID);
    }
}
