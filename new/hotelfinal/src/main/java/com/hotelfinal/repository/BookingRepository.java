package com.hotelfinal.repository;

import com.hotelfinal.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long>  {

}