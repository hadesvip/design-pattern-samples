package com.kevin.strategy.sample.modules.order.service.impl;

import static com.kevin.strategy.sample.modules.order.enums.OrderTypeEnum.GROUPON;

import com.kevin.strategy.sample.modules.order.annotaion.OrderType;
import com.kevin.strategy.sample.modules.order.entity.dto.OrderDTO;
import com.kevin.strategy.sample.modules.order.service.AbstractOrderService;
import javax.inject.Singleton;

@OrderType(type = GROUPON, desc = "团购订单")
@Singleton
public class NormalOrderServiceImpl extends AbstractOrderService {


  @Override
  public double discount(OrderDTO orderDTO) {
    return 0;
  }
}
