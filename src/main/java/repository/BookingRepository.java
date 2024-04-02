package repository;

import tms.model.Booking;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//Task To Do: Add proper Annotation 
@Repository
public class BookingRepository {
    // Task To Do: Define a collection to store tasks
	private List<Booking> BookingList;

    public void save(Booking booking) {
        // Task To Do: Add the given task to the collection
    	Optional<Bookinge> existingBooking = findById(booking.getId());
    if (existingBooking.isPresent()) {
        // Update the existing service
        int index = BookingList.indexOf(existingBooking.get());
        BookingList.set(index, booking);
    } else {
        // Add the new service to the repository
        BookingList.add(booking);
    }
    }

    public Optional<Booking> findById(long id) {
        // Task To Do: Return a task by its id if it exists in the collection
    	  	
    	for (int i = 0; i < BookingList.size(); i++) {
    		if (BookingList.get(i).getId() == id) {
    			return Optional.of(BookingList.get(i));
    		}
    	}
    	
        return null; // Placeholder return
    }

    public void deletebyById(long id) {
        // Task To Do: Remove the given task from the collection
    	
    	for (int i = 0; i < BookingList.size(); i++) {
    		if (BookingList.get(i).getId() == id) {
    			sBookingList.remove(i);
    		}
    	}
    }

    public List<Booking> findAll() {
        // Task To Do: Return all tasks in the collection
    	if (BookingList.isEmpty()) {
    		return null; // Placeholder return
    	}
    	
    	return BookingList;
        
    }
}
