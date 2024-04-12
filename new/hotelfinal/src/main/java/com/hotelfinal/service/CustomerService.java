package com.hotelfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.hotelfinal.model.Customer;
import com.hotelfinal.repository.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository CustomerRepository;

    public CustomerService(CustomerRepository CustomerRepository) {
        this.CustomerRepository = CustomerRepository;
    }


    public void save(Customer Customer) {
        CustomerRepository.save(Customer);
    }

    public List<Customer> listAll() {
        return CustomerRepository.findAll();
    }
}
