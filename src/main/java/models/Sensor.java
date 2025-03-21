package models;

public class Sensor {
    private String sensorID;
    private ParkingSpace parkingSpace;
    private boolean state; // true if active

    public Sensor(String sensorID, ParkingSpace parkingSpace) {
        this.sensorID = sensorID;
        this.parkingSpace = parkingSpace;
        this.state = true;
    }

    public boolean checkForVehicle(int sptID) {
        // Dummy check – in real life, integrate with sensor hardware
        return Math.random() > 0.5;
    }

    public String scanLicense() {
        // Dummy license scan
        return "ABC-123";
    }

    private void sendInfoToSystem() {
        // Internal method to send info to the system
        System.out.println("Sensor " + sensorID + " sending info to system.");
    }

    public void saveVehicleInfo() {
        System.out.println("Vehicle info saved for sensor " + sensorID);
    }

    public String getSensorID() {
        return sensorID;
    }
}
