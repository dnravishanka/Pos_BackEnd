package com.comtech.pos_system1.dto;

import java.util.Date;

public class OrderDTO {
    private Long id;
    private Date date;
    private Long customerId;
    CustomerDto customerDTO;
    private Integer isEnable;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public CustomerDto getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDto customerDTO) {
        this.customerDTO = customerDTO;
    }

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }
}
