package com.comtech.pos_system1.repository;

import com.comtech.pos_system1.entity.OrderDetails;
import com.comtech.pos_system1.repository.custom.OrderDetailsRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails,Long>, OrderDetailsRepositoryCustom {
}
