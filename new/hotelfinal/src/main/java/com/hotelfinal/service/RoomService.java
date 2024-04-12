package com.hotelfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.hotelfinal.model.Room;
import com.hotelfinal.repository.RoomRepository;

@Service
public class RoomService {
    @Autowired
    private RoomRepository RoomRepository;

    public RoomService(RoomRepository RoomRepository) {
        this.RoomRepository = RoomRepository;
    }

    public void save(Room Room) {
        RoomRepository.save(Room);
    }
    

    public List<Room> listAll() {
        return RoomRepository.findAll();
    }
}