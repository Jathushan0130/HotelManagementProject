package repository;

import tms.model.Room;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//room To Do: Add proper Annotation 
@Repository
public class RoomRepository {
    // room To Do: Define a collection to store rooms
	private List<Room> RoomList;

    public void save(Room room) {
        // room To Do: Add the given room to the collection
    	Optional<Room> existingRoom = findById(room.getId());
    if (existingRoom.isPresent()) {
        // Update the existing Room
        int index = RoomList.indexOf(existingRoom.get());
        RoomList.set(index, room);
    } else {
        // Add the new Room to the repository
        RoomList.add(room);
    }
    }

    public Optional<Room> findById(long id) {
        // room To Do: Return a room by its id if it exists in the collection
    	
    	if (RoomList.isEmpty()) {
    		return null; // Placeholder return
    	}
    	
    	for (int i = 0; i < RoomList.size(); i++) {
    		if (RoomList.get(i).getId() == id) {
    			return Optional.of(RoomList.get(i));
    		}
    	}
    	
        return null; // Placeholder return
    }

    public void deletebyById(long id) {
        // room To Do: Remove the given room from the collection
    	
    	for (int i = 0; i < RoomList.size(); i++) {
    		if (RoomList.get(i).getId() == id) {
    			RoomList.remove(i);
    		}
    	}
    }

    public List<Room> findAll() {
        // room To Do: Return all rooms in the collection
    	if (RoomList.isEmpty()) {
    		return null; // Placeholder return
    	}
    	
    	return RoomList;
        
    }
}
