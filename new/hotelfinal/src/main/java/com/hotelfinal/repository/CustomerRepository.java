package com.hotelfinal.repository;

import com.hotelfinal.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>  {

}