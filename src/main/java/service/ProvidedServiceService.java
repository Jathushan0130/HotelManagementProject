package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import model.ProvidedService;
import repository.ServiceRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProvidedServiceService {

    private final ServiceRepository serviceRepository;

    @Autowired
    public ProvidedServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public List<ProvidedService> getAllProvidedServices() {
        return serviceRepository.findAll();
    }

    public void addProvidedService(ProvidedService service) {
        serviceRepository.save(service);
    }

    public Optional<ProvidedService> getProvidedServiceById(Long id) {
        return serviceRepository.findById(id);
    }

    public void updateProvidedService(ProvidedService service) {
        serviceRepository.save(service);
    }

    public void deleteProvidedServiceById(Long id) {
        serviceRepository.deletebyById(id);
    }

}
