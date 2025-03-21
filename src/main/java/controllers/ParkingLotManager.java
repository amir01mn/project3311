package controllers;

import models.ParkingSpace;
import models.ParkingLot;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class ParkingLotManager {

    public ArrayList<Date> checkDate() {
        ArrayList<Date> dates = new ArrayList<>();
        dates.add(new Date());
        return dates;
    }

    public ArrayList<LocalTime> checkHours(Date date) {
        ArrayList<LocalTime> hours = new ArrayList<>();
        hours.add(LocalTime.of(8, 0));
        hours.add(LocalTime.of(9, 0));
        return hours;
    }

    public ArrayList<ParkingSpace> checkVacancy(Date date, LocalTime start, LocalTime end) {
        // Return available parking spaces (dummy implementation)
        return new ArrayList<>();
    }

    public ParkingSpace findSpt(int sptNum) {
        ParkingLot lot = new ParkingLot("PL1", "Location1", 100);
        return new ParkingSpace("S" + sptNum, lot);
    }
}
