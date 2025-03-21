package iterator;

import models.Booking;
import models.ParkingSpace;
import models.User;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class BookingIterator implements Iterator<Booking> {

    private Iterator<Map.Entry<ParkingSpace, User>> iterator;

    public BookingIterator(HashMap<ParkingSpace, User> bookings) {
        this.iterator = bookings.entrySet().iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Booking next() {
        Map.Entry<ParkingSpace, User> entry = iterator.next();
        Booking booking = new Booking();
        booking.setParkingSpace(entry.getKey());
        booking.setUser(entry.getValue());
        return booking;
    }
}
