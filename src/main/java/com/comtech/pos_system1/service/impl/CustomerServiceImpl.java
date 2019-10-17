package com.comtech.pos_system1.service.impl;

import com.comtech.pos_system1.builder.DtoBuilder;
import com.comtech.pos_system1.builder.EntityBuilder;
import com.comtech.pos_system1.dto.CustomerDto;
import com.comtech.pos_system1.entity.Customer;
import com.comtech.pos_system1.repository.CustomerRepository;
import com.comtech.pos_system1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
@Autowired
CustomerRepository customerRepository;
@Autowired
EntityBuilder entityBuilder;
@Autowired
DtoBuilder dtoBuilder;


    @Override
    public Long add(CustomerDto customerDto) {
        Customer saved=customerRepository.save(entityBuilder.buildCustomerEntity(new Customer(),customerDto));
        return null !=saved ? saved.getCid() : null;
    }

    @Override
    public Long update(CustomerDto customerDto) {
        Customer saved=customerRepository.save(entityBuilder.buildCustomerEntity(new Customer(),customerDto));
        return null !=saved ? saved.getCid() : null;
    }

    @Override
    public List<CustomerDto> searchLike(String searchText, Integer count, Integer page) {
        List<CustomerDto> list= new ArrayList<>();

        for (Customer entity : customerRepository.search(searchText, count,page)){
            list.add(dtoBuilder.buildCustomerDto(entity));
        }
        return list;
    }

    @Override
    public CustomerDto get(Long cid) {
        return dtoBuilder.buildCustomerDto(customerRepository.getOne(cid));
    }

    @Override
    public Long delete(Long cid) {
        Customer customer=customerRepository.getOne(cid);
        customer.setIsEnable(0);
        Customer saved= customerRepository.save(customer);

        return null !=saved.getCid() ? saved.getCid() :null;
    }
}
