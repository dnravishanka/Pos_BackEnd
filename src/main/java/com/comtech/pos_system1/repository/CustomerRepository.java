package com.comtech.pos_system1.repository;

import com.comtech.pos_system1.entity.Customer;
import com.comtech.pos_system1.repository.custom.CustomerRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long>, CustomerRepositoryCustom {
}
