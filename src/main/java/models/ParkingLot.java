package models;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private String parkingID;
    private String location;
    private int capacity;
    private String status; // e.g., "open", "closed"
    private List<ParkingSpace> spaces;

    public ParkingLot(String parkingID, String location, int capacity) {
        this.parkingID = parkingID;
        this.location = location;
        this.capacity = capacity;
        this.status = "open";
        this.spaces = new ArrayList<>();
        // Initialize parking spaces
        for (int i = 1; i <= capacity; i++) {
            spaces.add(new ParkingSpace(parkingID + "-S" + i, this));
        }
    }

    public ParkingLot createParkingLot(int capacity) {
        return new ParkingLot(this.parkingID, this.location, capacity);
    }

    public void addSpace(ParkingSpace space) {
        spaces.add(space);
    }

    public void enable(String parkingID) {
        if (this.parkingID.equals(parkingID)) {
            status = "open";
        }
    }

    public void disable(String parkingID) {
        if (this.parkingID.equals(parkingID)) {
            status = "closed";
        }
    }

    // Getters and setters
    public String getParkingID() { return parkingID; }
    public String getLocation() { return location; }
    public int getCapacity() { return capacity; }
    public String getStatus() { return status; }
    public List<ParkingSpace> getSpaces() { return spaces; }
}
