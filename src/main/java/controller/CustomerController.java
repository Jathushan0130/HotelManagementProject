package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import model.Customer;
import service.CustomerService;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public String listCustomers(Model model) {
        // Method name corrected from findAll() to getAllCustomers()
        model.addAttribute("customers", customerService.getAllCustomers());
        return "customers";
    }

    @PostMapping("/customers")
    public String addCustomer(Customer customer, Model model) {
        // Method name corrected from save() to addCustomer()
        customerService.addCustomer(customer);
        return "redirect:/customers";
    }
}
