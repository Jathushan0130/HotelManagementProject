package repository;

import tms.model.Booking;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//booking To Do: Add proper Annotation 
@Repository
public class BookingRepository {
    // booking To Do: Define a collection to store bookings
	private List<Booking> BookingList;

    public void save(Booking booking) {
        // booking To Do: Add the given booking to the collection
    	Optional<Bookinge> existingBooking = findById(booking.getId());
    if (existingBooking.isPresent()) {
        // Update the existing booking
        int index = BookingList.indexOf(existingBooking.get());
        BookingList.set(index, booking);
    } else {
        // Add the new booking to the repository
        BookingList.add(booking);
    }
    }

    public Optional<Booking> findById(long id) {
        // booking To Do: Return a booking by its id if it exists in the collection
    	  	
    	for (int i = 0; i < BookingList.size(); i++) {
    		if (BookingList.get(i).getId() == id) {
    			return Optional.of(BookingList.get(i));
    		}
    	}
    	
        return null; // Placeholder return
    }

    public void deletebyById(long id) {
        // booking To Do: Remove the given booking from the collection
    	
    	for (int i = 0; i < BookingList.size(); i++) {
    		if (BookingList.get(i).getId() == id) {
    			sBookingList.remove(i);
    		}
    	}
    }

    public List<Booking> findAll() {
        // booking To Do: Return all bookings in the collection
    	if (BookingList.isEmpty()) {
    		return null; // Placeholder return
    	}
    	
    	return BookingList;
        
    }
}
