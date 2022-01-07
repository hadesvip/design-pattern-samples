package com.kevin.strategy.sample.modules.order.service.impl;

import static com.kevin.strategy.sample.modules.order.enums.OrderTypeEnum.GROUPON;
import static com.kevin.strategy.sample.modules.order.enums.OrderTypeEnum.NORMAL;

import com.kevin.strategy.sample.modules.order.annotaion.OrderType;
import com.kevin.strategy.sample.modules.order.entity.dto.OrderDTO;
import com.kevin.strategy.sample.modules.order.service.AbstractOrderService;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 团购订单服务
 *
 * @author kevin
 */
@OrderType(type = GROUPON, desc = "团购订单")
@Singleton
public class GrouponOrderServiceImpl extends AbstractOrderService {

  @Override
  public double discount(OrderDTO orderDTO) {
    Logger.getGlobal().log(Level.INFO, "团购订单");
    return 0;
  }
}
