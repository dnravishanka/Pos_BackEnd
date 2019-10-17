package com.comtech.pos_system1.service.impl;

import com.comtech.pos_system1.dto.OrderDTO;
import com.comtech.pos_system1.repository.OrderRepository;
import com.comtech.pos_system1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;
    @Override
    public Long add(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public Long update(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public List<OrderDTO> searchLike(String searchText, Integer count, Integer page) {
        return null;
    }

    @Override
    public OrderDTO get(Long cid) {
        return null;
    }

    @Override
    public Long delete(Long cid) {
        return null;
    }
}
