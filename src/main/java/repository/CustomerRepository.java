package repository;

import tms.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//Customer To Do: Add proper Annotation 
@Repository
public class CustomerRepository {
    // Customer To Do: Define a collection to store Customers
	private List<Customere> CustomerList;

    public void save(Customer customer) {
        // Customer To Do: Add the given Customer to the collection
    	Optional<Customer> existingCustomer = findById(customer.getId());
    if (existingCustomer.isPresent()) {
        // Update the existing Customer
        int index = CustomerList.indexOf(existingCustomer.get());
        CustomerList.set(index, customer);
    } else {
        // Add the new Customer to the repository
        CustomerList.add(customer);
    }
    }

    public Optional<Customer> findById(long id) {
        // Customer To Do: Return a Customer by its id if it exists in the collection
    	
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
        // Customer To Do: Remove the given Customer from the collection
    	
    	for (int i = 0; i < CustomerList.size(); i++) {
    		if (CustomerList.get(i).getId() == id) {
    			CustomerList.remove(i);
    		}
    	}
    }

    public List<Customer> findAll() {
        // Customer To Do: Return all Customers in the collection
    	if (CustomerList.isEmpty()) {
    		return null; // Placeholder return
    	}
    	
    	return CustomerList;
        
    }
}
