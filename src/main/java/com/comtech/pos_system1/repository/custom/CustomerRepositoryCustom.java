package com.comtech.pos_system1.repository.custom;

import com.comtech.pos_system1.entity.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> search(String searchText, Integer count, Integer page);
}
