package com.comtech.pos_system1.dto;

import java.util.List;

public class OrderDetailDTO {

    private Long id;
    List<Long> itemsList;
    OrderDTO orderDTO;
    private Integer qty;
    private Integer isEnable;

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Long> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<Long> itemsList) {
        this.itemsList = itemsList;
    }

    public OrderDTO getOrderDTO() {
        return orderDTO;
    }

    public void setOrderDTO(OrderDTO orderDTO) {
        this.orderDTO = orderDTO;
    }

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }
}
