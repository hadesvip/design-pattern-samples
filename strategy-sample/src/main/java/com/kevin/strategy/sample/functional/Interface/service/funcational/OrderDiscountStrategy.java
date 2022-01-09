package com.kevin.strategy.sample.functional.Interface.service.funcational;


import com.kevin.strategy.sample.modules.order.tradition.entity.dto.OrderDTO;

@FunctionalInterface
public interface OrderDiscountStrategy {

  double discount(OrderDTO orderDTO);


}
