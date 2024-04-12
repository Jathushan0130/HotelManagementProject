package com.hotelfinal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Room {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private String roomNumber;
    private String roomType;
    private double price;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<Booking> bookings;
    
    // Constructors
    public Room() {}

    public Room(String roomNumber, String roomType, double price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    

}