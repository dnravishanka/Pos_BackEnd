package com.comtech.pos_system1.dto;

public class ItemDto {
    private Long id;
    private Long code;
    private String description;
    private Integer availableQty;
    private Double unitePrice;
    private Integer isEnable;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(Integer availableQty) {
        this.availableQty = availableQty;
    }

    public Double getUnitePrice() {
        return unitePrice;
    }

    public void setUnitePrice(Double unitePrice) {
        this.unitePrice = unitePrice;
    }

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }
}
