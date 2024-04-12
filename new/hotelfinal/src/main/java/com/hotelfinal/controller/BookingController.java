package com.hotelfinal.controller;

import org.springframework.ui.Model;
import com.hotelfinal.model.Booking;
import com.hotelfinal.model.Customer;
import com.hotelfinal.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.ui.Model;

@Controller
public class BookingController {
    @Autowired
    private BookingService BookingService;
    
    public BookingController(BookingService BookingService) {
        this.BookingService = BookingService;
    }

    @GetMapping("/bookings")
    public String showBookingPage(Model model) {
        // Add existing bookings to the model
        model.addAttribute("bookings", BookingService.listAll());

        // Add a new booking object to the model
        model.addAttribute("newBooking", new Booking());

        return "bookings"; // Return the name of the view template for the bookings page
    }

    @PostMapping("/bookings")
    public String saveBooking(@ModelAttribute("newBookings") Booking newBooking) {
        // Save the new booking
    	BookingService.save(newBooking);
        // Redirect to the same page to refresh the list
        return "redirect:/bookings";
    }
}