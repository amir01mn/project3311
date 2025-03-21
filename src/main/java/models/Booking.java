package models;

import java.time.LocalTime;
import java.util.Date;

public class Booking {
    private String bookingID;
    private User user;
    private ParkingSpace parkingSpace;
    private ParkingLot parkingLot;
    private String status;
    private LocalTime start;
    private LocalTime end;
    private String plate;
    private Date date;

    public Booking(String bookingID, User user, ParkingSpace parkingSpace, ParkingLot parkingLot,
                   String status, Date date, LocalTime start, LocalTime end, String plate) {
        this.bookingID = bookingID;
        this.user = user;
        this.parkingSpace = parkingSpace;
        this.parkingLot = parkingLot;
        this.status = status;
        this.date = date;
        this.start = start;
        this.end = end;
        this.plate = plate;
    }

    // Default constructor
    public Booking() {
        this.bookingID = "BKG" + System.currentTimeMillis();
        this.status = "pending";
    }

    // Getters and setters
    public String getBookingID() { return bookingID; }
    public void setBookingID(String bookingID) { this.bookingID = bookingID; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public ParkingSpace getParkingSpace() { return parkingSpace; }
    public void setParkingSpace(ParkingSpace parkingSpace) { this.parkingSpace = parkingSpace; }

    public ParkingLot getParkingLot() { return parkingLot; }
    public void setParkingLot(ParkingLot parkingLot) { this.parkingLot = parkingLot; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalTime getStart() { return start; }
    public void setStart(LocalTime start) { this.start = start; }

    public LocalTime getEnd() { return end; }
    public void setEnd(LocalTime end) { this.end = end; }

    public String getPlate() { return plate; }
    public void setPlate(String plate) { this.plate = plate; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
}
