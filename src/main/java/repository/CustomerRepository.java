package repository;

import tms.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//Task To Do: Add proper Annotation 
@Repository
public class CustomerRepository {
    // Task To Do: Define a collection to store tasks
	private List<Customere> CustomerList;

    public void save(Customer customer) {
        // Task To Do: Add the given task to the collection
    	Optional<Customer> existingCustomer = findById(customer.getId());
    if (existingCustomer.isPresent()) {
        // Update the existing service
        int index = CustomerList.indexOf(existingCustomer.get());
        CustomerList.set(index, customer);
    } else {
        // Add the new service to the repository
        CustomerList.add(customer);
    }
    }

    public Optional<Customer> findById(long id) {
        // Task To Do: Return a task by its id if it exists in the collection
    	
    	if (CustomerList.isEmpty()) {
    		return null; // Placeholder return
    	}
    	
    	for (int i = 0; i < CustomerList.size(); i++) {
    		if (CustomerList.get(i).getId() == id) {
    			return Optional.of(CustomerList.get(i));
    		}
    	}
    	
        return null; // Placeholder return
    }

    public void deletebyById(long id) {
        // Task To Do: Remove the given task from the collection
    	
    	for (int i = 0; i < CustomerList.size(); i++) {
    		if (CustomerList.get(i).getId() == id) {
    			CustomerList.remove(i);
    		}
    	}
    }

    public List<Customer> findAll() {
        // Task To Do: Return all tasks in the collection
    	if (CustomerList.isEmpty()) {
    		return null; // Placeholder return
    	}
    	
    	return CustomerList;
        
    }
}
