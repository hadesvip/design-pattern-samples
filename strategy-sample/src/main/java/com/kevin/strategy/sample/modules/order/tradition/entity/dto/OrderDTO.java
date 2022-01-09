package com.kevin.strategy.sample.modules.order.tradition.entity.dto;

import com.kevin.strategy.sample.common.utils.GsonUtil;
import java.math.BigDecimal;

public class OrderDTO {


  private String orderNo;


  private BigDecimal price;


  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public OrderDTO() {
  }

  public OrderDTO(String orderNo, BigDecimal price) {
    this.orderNo = orderNo;
    this.price = price;
  }

  @Override
  public String toString() {
    return GsonUtil.getInstance().toJson(this);
  }
}
