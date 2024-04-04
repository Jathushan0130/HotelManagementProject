package controller;

import model.ProvidedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import service.ProvidedServiceService;

@Controller
public class ProvidedServiceController {

    @Autowired
    private ProvidedServiceService providedServiceService;

    @GetMapping("/services")
    public String listServices(Model model) {
        // Updated to use the correct service method name
        model.addAttribute("services", providedServiceService.getAllProvidedServices());
        return "services";
    }

    @PostMapping("/services")
    public String addService(ProvidedService providedService, Model model) {
        // Updated to use the correct service method name
        providedServiceService.addProvidedService(providedService);
        return "redirect:/services";
    }
}
