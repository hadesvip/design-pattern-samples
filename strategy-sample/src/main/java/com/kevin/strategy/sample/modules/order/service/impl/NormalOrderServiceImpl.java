package com.kevin.strategy.sample.modules.order.service.impl;

import com.kevin.strategy.sample.modules.order.annotaion.OrderType;
import com.kevin.strategy.sample.modules.order.entity.dto.OrderDTO;
import com.kevin.strategy.sample.modules.order.service.AbstractOrderService;

import javax.inject.Singleton;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.kevin.strategy.sample.modules.order.enums.OrderTypeEnum.NORMAL;

/**
 * @author kevin
 */
@OrderType(type = NORMAL, desc = "普通订单")
@Singleton
public class NormalOrderServiceImpl extends AbstractOrderService {


  @Override
  public double discount(OrderDTO orderDTO) {
    Logger.getGlobal().log(Level.INFO, "普通订单");
    return 0;
  }
}
