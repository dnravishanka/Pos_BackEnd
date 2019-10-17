package com.comtech.pos_system1.service.impl;

import com.comtech.pos_system1.builder.DtoBuilder;
import com.comtech.pos_system1.builder.EntityBuilder;
import com.comtech.pos_system1.builder.MyFormatter;
import com.comtech.pos_system1.dto.ItemDto;
import com.comtech.pos_system1.dto.OrderDetailDTO;
import com.comtech.pos_system1.entity.Item;
import com.comtech.pos_system1.entity.OrderDetails;
import com.comtech.pos_system1.entity.Orders;
import com.comtech.pos_system1.repository.CustomerRepository;
import com.comtech.pos_system1.repository.ItemRepository;
import com.comtech.pos_system1.repository.OrderDetailsRepository;
import com.comtech.pos_system1.repository.OrderRepository;
import com.comtech.pos_system1.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional

public class OrderDetailsServiceImpl implements OrderDetailsService {

    @Autowired
    OrderDetailsRepository orderDetailRepository;
    @Autowired
    ItemRepository itemRepository;
    @Autowired
    OrderRepository ordersRepository;
    @Autowired
    CustomerRepository customerRepository;
    private DtoBuilder dtoBuider;
    private EntityBuilder entityBuilder;
    private MyFormatter myFormatter;

    @Override
    public Long add(OrderDetailDTO orderDetailDTO) {
        OrderDetails orderDetailsSave = new OrderDetails();
        List<Item> itemList = new ArrayList<>();

        Orders orders = new Orders();
try {
    orders.setId(orderDetailDTO.getOrderDTO().getId());

    orders.setDate(orderDetailDTO.getOrderDTO().getDate());
    orders.setCustomer(customerRepository.getOne(orderDetailDTO.getOrderDTO().getCustomerId()));
    orders.setIsEnable(1);
    Orders orderSave = ordersRepository.save(orders);


    System.out.println("ord 3 : ");

    for (int i = 0; i < orderDetailDTO.getItemsList().size(); i++) {
        Item item=itemRepository.getOne(orderDetailDTO.getItemsList().get(i));
        itemList.add(item);
        item.setAvailableQty(item.getAvailableQty()-orderDetailDTO.getQty());
        itemRepository.save(item);
    }

    orderDetailsSave.setId(orderDetailDTO.getId());
    orderDetailsSave.setIsEnable(1);
    orderDetailsSave.setItems(itemList);
    orderDetailsSave.setQty(orderDetailDTO.getQty());
    orderDetailsSave.setOrder(orderSave);

    orderDetailRepository.save(orderDetailsSave);
}catch (Exception e){
    e.printStackTrace();
}
        return orderDetailsSave.getId();
            }

    @Override
    public Long update(OrderDetailDTO orderDetailDTO) {
        return null;
    }

    @Override
    public List<OrderDetailDTO> searchLike(String searchText, Integer count, Integer page) {
        return null;
    }

    @Override
    public OrderDetailDTO get(Long cid) {
        return null;
    }

    @Override
    public Long delete(Long cid) {
        return null;
    }
}
