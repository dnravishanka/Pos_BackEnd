package com.comtech.pos_system1.repository;

import com.comtech.pos_system1.entity.Orders;
import com.comtech.pos_system1.repository.custom.OrderRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders,Long>, OrderRepositoryCustom {
}
