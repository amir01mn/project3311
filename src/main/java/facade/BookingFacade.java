package facade;

import models.ParkingSpace;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public interface BookingFacade {
    ArrayList<ParkingSpace> populateSpots();
    ParkingSpace chooseSpot(ArrayList<ParkingSpace> spotList);
    void createBooking(int userID, String sptID, Date date, LocalTime start, LocalTime end);
    void cancelBooking();
    boolean varifyLicencePlate(String plate);
    void extendBooking(String bookingID);
    void payDeposit(String paymentDetails);
}
