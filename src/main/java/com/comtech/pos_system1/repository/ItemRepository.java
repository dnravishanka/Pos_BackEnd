package com.comtech.pos_system1.repository;

import com.comtech.pos_system1.entity.Item;
import com.comtech.pos_system1.repository.custom.ItemRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long>, ItemRepositoryCustom {
}
