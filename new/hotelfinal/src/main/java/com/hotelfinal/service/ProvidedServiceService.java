package com.hotelfinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.hotelfinal.model.ProvidedService;
import com.hotelfinal.repository.ServiceRepository;

@Service
public class ProvidedServiceService {
    @Autowired
    private ServiceRepository ServiceRepository;

    public ProvidedServiceService(ServiceRepository ServiceRepository) {
        this.ServiceRepository = ServiceRepository;
    }

    public void save(ProvidedService ProvidedService) {
        ServiceRepository.save(ProvidedService);
    }
    

    public List<ProvidedService> listAll() {
        return ServiceRepository.findAll();
    }
}