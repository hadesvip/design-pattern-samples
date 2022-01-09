package com.kevin.strategy.sample.functional.Interface.service;

import com.kevin.strategy.sample.functional.Interface.service.funcational.OrderDiscountStrategy;
import com.kevin.strategy.sample.modules.order.tradition.entity.dto.OrderDTO;

public class OrderDiscountService {


  private final OrderDiscountStrategy orderDiscountStrategy;

  private final OrderDTO orderDTO;

  public OrderDiscountService(
      OrderDiscountStrategy orderDiscountStrategy, OrderDTO orderDTO) {
    this.orderDiscountStrategy = orderDiscountStrategy;
    this.orderDTO = orderDTO;
  }


  public double discount() {
    return orderDiscountStrategy.discount(this.orderDTO);
  }

}
