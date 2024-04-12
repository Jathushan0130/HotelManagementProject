package com.hotelfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.hotelfinal.model.Booking;
import com.hotelfinal.repository.BookingRepository;

@Service
public class BookingService {
    @Autowired
    private BookingRepository BookingRepository;

    public BookingService(BookingRepository BookingRepository) {
        this.BookingRepository = BookingRepository;
    }

    public void save(Booking Booking) {
        BookingRepository.save(Booking);
    }
    

    public List<Booking> listAll() {
        return BookingRepository.findAll();
    }
}