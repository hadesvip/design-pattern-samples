package com.kevin.strategy.sample.modules.order.tradition.service.impl;

import static com.kevin.strategy.sample.modules.order.tradition.enums.OrderTypeEnum.NORMAL;

import com.kevin.strategy.sample.modules.order.tradition.annotaion.OrderType;
import com.kevin.strategy.sample.modules.order.tradition.entity.dto.OrderDTO;
import com.kevin.strategy.sample.modules.order.tradition.service.AbstractOrderService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Singleton;

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
