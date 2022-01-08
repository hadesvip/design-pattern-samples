package com.kevin.strategy.sample.modules.order.service.impl;

import static com.kevin.strategy.sample.modules.order.enums.OrderTypeEnum.GROUPON;

import com.kevin.strategy.sample.modules.order.annotaion.OrderType;
import com.kevin.strategy.sample.modules.order.entity.dto.OrderDTO;
import com.kevin.strategy.sample.modules.order.service.AbstractOrderService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Singleton;

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
