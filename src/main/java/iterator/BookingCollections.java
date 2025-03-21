package iterator;

import models.ParkingSpace;
import models.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BookingCollections {
    private HashMap<ParkingSpace, User> bookings;

    public BookingCollections() {
        bookings = new HashMap<>();
    }

    public void addBooking(ParkingSpace spot, User user) {
        bookings.put(spot, user);
    }

    public Iterator<Map.Entry<ParkingSpace, User>> iterator() {
        return bookings.entrySet().iterator();
    }

    public HashMap<ParkingSpace, User> getBookings() {
        return bookings;
    }
}
