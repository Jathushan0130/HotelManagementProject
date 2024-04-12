package com.hotelfinal.controller;

import org.springframework.ui.Model;

import com.hotelfinal.model.Customer;
import com.hotelfinal.model.Room;
import com.hotelfinal.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.ui.Model;

@Controller
public class RoomController {
    @Autowired
    private RoomService RoomService;
    
    public RoomController(RoomService RoomService) {
        this.RoomService = RoomService;
    }

    
    @GetMapping("/rooms")
    public String showRoomPage(Model model) {
        // Add existing bookings to the model
        model.addAttribute("rooms", RoomService.listAll());

        // Add a new booking object to the model
        model.addAttribute("newRoom", new Room());

        return "rooms"; // Return the name of the view template for the bookings page
    }

    @PostMapping("/rooms")
    public String saveRoom(@ModelAttribute("newRooms") Room newRoom) {
        // Save the new booking
    	RoomService.save(newRoom);
        // Redirect to the same page to refresh the list
        return "redirect:/rooms";
    }
}