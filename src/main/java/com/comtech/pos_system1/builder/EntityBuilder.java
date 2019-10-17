package com.comtech.pos_system1.builder;

import com.comtech.pos_system1.dto.CustomerDto;
import com.comtech.pos_system1.dto.ItemDto;
import com.comtech.pos_system1.dto.OrderDTO;
import com.comtech.pos_system1.dto.OrderDetailDTO;
import com.comtech.pos_system1.entity.Customer;
import com.comtech.pos_system1.entity.Item;
import com.comtech.pos_system1.entity.OrderDetails;
import com.comtech.pos_system1.entity.Orders;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EntityBuilder {
    private MyFormatter myFormatter;
    public Customer buildCustomerEntity(Customer customer, CustomerDto customerDto){
        if(customerDto==null){
            return null;
        }
        customer.setCid(customerDto.getCid());
        customer.setCustomerName(customerDto.getCustomerName());
        customer.setAddress(customerDto.getAddress());
        customer.setTelephone(customerDto.getTelephone());
        customer.setIsEnable(customerDto.getIsEnable());
        return customer;
    }
    public Item buildItemEntity(Item item, ItemDto itemDto){
        if (itemDto==null){
            return null;
        }
        item.setCode(itemDto.getCode());
        item.setDescription(itemDto.getDescription());
        item.setAvailableQty(itemDto.getAvailableQty());
        item.setUnitePrice(itemDto.getUnitePrice());
        item.setIsEnable(1);
        return item;
    }
    public Orders buildOrderEntity(Orders orders, OrderDTO orderDTO){
//        if(orderDTO==null){
//            return null;
//        }
//        orders.setId(orderDTO.getId());
//        orders.setDate(myFormatter.getDateFromStr(orderDTO.getDate()));
//        orders.setCustomer(buildCustomerEntity(new Customer(),orderDTO.getCustomerDTO()));
//        orders.setIsEnable(orderDTO.getIsEnable());
        return null;
    }

    public OrderDetails buildOrderDetail(OrderDetails orderDetails, OrderDetailDTO orderDetailDTO){
//        if(orderDetailDTO==null){
//            return null;
//        }
//        List<Item> itemList=new ArrayList<>();
//        for (ItemDto dto: orderDetailDTO.getItems()){
//            itemList.add(buildItemEntity(new Item(), dto));
//        }
//        orderDetails.setId(orderDetailDTO.getId());
//        orderDetails.setIsEnable(1);
//        orderDetails.setItems(itemList);
//        orderDetails.setOrder(buildOrderEntity(new Orders(),orderDetailDTO.getOrderDTO()));
//        return orderDetails;
        return null;
    }
}
