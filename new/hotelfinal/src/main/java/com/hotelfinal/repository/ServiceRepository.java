package com.hotelfinal.repository;

import com.hotelfinal.model.ProvidedService;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ServiceRepository extends JpaRepository<ProvidedService, Long>{

}