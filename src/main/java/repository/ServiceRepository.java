package repository;

import tms.model.ProvidedService;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//service To Do: Add proper Annotation 
@Repository
public class ServiceRepository {
    // service To Do: Define a collection to store services
	private List<ProvidedService> serviceList;

    public void save(ProvidedService service) {
        // service To Do: Add the given service to the collection
    	Optional<ProvidedService> existingService = findById(service.getId());
    if (existingService.isPresent()) {
        // Update the existing service
        int index = serviceList.indexOf(existingService.get());
        serviceList.set(index, service);
    } else {
        // Add the new service to the repository
        serviceList.add(service);
    }
    }

    public Optional<ProvidedService> findById(long id) {
        // service To Do: Return a service by its id if it exists in the collection
    	
    	if (serviceList.isEmpty()) {
    		return null; // Placeholder return
    	}
    	
    	for (int i = 0; i < serviceList.size(); i++) {
    		if (serviceList.get(i).getId() == id) {
    			return Optional.of(serviceList.get(i));
    		}
    	}
    	
        return null; // Placeholder return
    }

    public void deletebyById(long id) {
        // service To Do: Remove the given service from the collection
    	
    	for (int i = 0; i < serviceList.size(); i++) {
    		if (serviceList.get(i).getId() == id) {
    			serviceList.remove(i);
    		}
    	}
    }

    public List<ProvidedService> findAll() {
        // service To Do: Return all services in the collection
    	if (serviceList.isEmpty()) {
    		return null; // Placeholder return
    	}
    	
    	return serviceList;
        
    }
}
