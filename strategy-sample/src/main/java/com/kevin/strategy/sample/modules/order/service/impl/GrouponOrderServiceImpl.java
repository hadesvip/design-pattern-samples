package com.kevin.strategy.sample.modules.order.service.impl;

import static com.kevin.strategy.sample.modules.order.enums.OrderTypeEnum.NORMAL;

import com.kevin.strategy.sample.modules.order.annotaion.OrderType;
import com.kevin.strategy.sample.modules.order.entity.dto.OrderDTO;
import com.kevin.strategy.sample.modules.order.service.AbstractOrderService;
import javax.inject.Singleton;

/**
 * 团购订单服务
 *
 * @author kevin
 */
@OrderType(type = NORMAL, desc = "普通订单")
@Singleton
public class GrouponOrderServiceImpl extends AbstractOrderService {

  @Override
  public double discount(OrderDTO orderDTO) {
    return 0;
  }
}
