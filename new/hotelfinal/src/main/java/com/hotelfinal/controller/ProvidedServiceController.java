package com.hotelfinal.controller;

import org.springframework.ui.Model;

import com.hotelfinal.model.Customer;
import com.hotelfinal.model.ProvidedService;
import com.hotelfinal.service.ProvidedServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.ui.Model;


@Controller
public class ProvidedServiceController {
    @Autowired
    private ProvidedServiceService ProvidedServiceService;
    
    public ProvidedServiceController(ProvidedServiceService ProvidedServiceService) {
        this.ProvidedServiceService = ProvidedServiceService;
    }


    @GetMapping("/services")
    public String showProvidedServicePage(Model model) {
        // Add existing bookings to the model
        model.addAttribute("services", ProvidedServiceService.listAll());

        // Add a new booking object to the model
        model.addAttribute("newService", new ProvidedService());

        return "services"; // Return the name of the view template for the bookings page
    }

    @PostMapping("/services")
    public String saveProvidedService(@ModelAttribute("newService") ProvidedService newProvidedService) {
        // Save the new booking
    	ProvidedServiceService.save(newProvidedService);
        // Redirect to the same page to refresh the list
        return "redirect:/services";
    }
}