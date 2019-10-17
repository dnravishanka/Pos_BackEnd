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

@Component
public class DtoBuilder {
    public CustomerDto buildCustomerDto(Customer customer){
        if(customer==null){
            return null;
        }
    CustomerDto customerDto=new CustomerDto();
        customerDto.setCid(customer.getCid());
        customerDto.setCustomerName(customer.getCustomerName());
        customerDto.setAddress(customer.getAddress());
        customerDto.setTelephone(customer.getTelephone());
        customerDto.setIsEnable(customer.getIsEnable());
        return customerDto;
    }
    public OrderDTO buildOrderDTO(Orders orders){
        if(orders==null){
            return null;
        }
        OrderDTO orderDTO=new OrderDTO();
        orderDTO.setId(orders.getId());
        orderDTO.setDate(orders.getDate());
        orderDTO.setCustomerDTO(buildCustomerDto(orders.getCustomer()));
        orderDTO.setCustomerId(orderDTO.getCustomerDTO().getCid());
        orderDTO.setIsEnable(orders.getIsEnable());

        return orderDTO;
    }
    public ItemDto buildItemDto(Item item){
        if (item==null){
            return null;
        }
        ItemDto itemDto=new ItemDto();
        itemDto.setCode(item.getCode());
        itemDto.setDescription(item.getDescription());
        itemDto.setAvailableQty(item.getAvailableQty());
        itemDto.setUnitePrice(item.getUnitePrice());
        itemDto.setIsEnable(item.getIsEnable());
        return itemDto;
    }
    public OrderDetailDTO buildOrderDetailDTO(OrderDetails orderDetail){
//        if(orderDetail==null){
//            return null;
//        }
//        OrderDetailDTO orderDetailDTO= new OrderDetailDTO();
//        orderDetailDTO.setId(orderDetail.getId());
//        orderDetailDTO.setItems(buildItemDTO(orderDetail.getItems()));
//        orderDetailDTO.setOrderDTO(orderDetail.getOrder());
//        orderDetailDTO.setIsEnable(orderDetail.getIsEnable());
//        return orderDetailDTO;
        return null;
    }
}
