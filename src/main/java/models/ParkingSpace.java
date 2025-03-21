package models;

public class ParkingSpace {
    private String sptID;
    private ParkingLot parkingLot;
    private String status; // e.g., "available", "booked", "disabled"
    private String presentPlate;

    public ParkingSpace(String sptID, ParkingLot parkingLot) {
        this.sptID = sptID;
        this.parkingLot = parkingLot;
        this.status = "available";
        this.presentPlate = "";
    }

    public boolean isAvailable() {
        return "available".equalsIgnoreCase(status);
    }

    public void enable() {
        status = "available";
    }

    public void disable() {
        status = "disabled";
    }

    public String findLastBooking(int sptID) {
        // Dummy implementation: in a real system, search the booking records
        return "LastBookingInfo";
    }

    public void notifySensor(Sensor sensor) {
        // Notify system with sensor info
        System.out.println("Sensor " + sensor.getSensorID() + " notified for ParkingSpace " + this.sptID);
    }

    // Getters and setters
    public String getSptID() { return sptID; }
    public ParkingLot getParkingLot() { return parkingLot; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getPresentPlate() { return presentPlate; }
    public void setPresentPlate(String presentPlate) { this.presentPlate = presentPlate; }
}
