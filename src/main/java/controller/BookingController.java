package controller;

import model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import service.BookingService;

@Controller
public class BookingController {

    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/bookings")
    public String listBookings(Model model) {
        // Using getAllBookings method from BookingService
        model.addAttribute("bookings", bookingService.getAllBookings());
        return "bookings";
    }

    @PostMapping("/bookings")
    public String addBooking(Booking booking) {
        // Using addBooking method from BookingService
        bookingService.addBooking(booking);
        return "redirect:/bookings";
    }
}
