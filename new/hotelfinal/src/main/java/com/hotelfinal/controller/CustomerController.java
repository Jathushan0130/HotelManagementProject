package com.hotelfinal.controller;

import com.hotelfinal.model.Booking;
import com.hotelfinal.model.Customer;
import com.hotelfinal.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.ui.Model;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService CustomerService;
    
    public CustomerController(CustomerService CustomerService) {
        this.CustomerService = CustomerService;
    }
    
    @GetMapping("/customers")
    public String showCustomerPage(Model model) {
        // Add existing bookings to the model
        model.addAttribute("customers", CustomerService.listAll());

        // Add a new booking object to the model
        model.addAttribute("newCustomer", new Customer());

        return "customers"; // Return the name of the view template for the bookings page
    }

    @PostMapping("/customers")
    public String saveCustomer(@ModelAttribute("newCustomers") Customer newCustomer) {
        // Save the new booking
    	CustomerService.save(newCustomer);
        // Redirect to the same page to refresh the list
        return "redirect:/customers";
    }
}