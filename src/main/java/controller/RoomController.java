package controller;

import model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import service.RoomService;

@Controller
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/rooms")
    public String listRooms(Model model) {
        model.addAttribute("rooms", roomService.getAllRooms());
        return "rooms";
    }

    @PostMapping("/rooms")
    public String addRoom(Room room, Model model) {
        roomService.addRoom(room);
        return "redirect:/rooms";
    }
}
