package com.kevin.strategy.sample.modules.order.tradition.service.impl;

import static com.kevin.strategy.sample.modules.order.tradition.enums.OrderTypeEnum.PROMOTION;

import com.kevin.strategy.sample.modules.order.tradition.annotaion.OrderType;
import com.kevin.strategy.sample.modules.order.tradition.entity.dto.OrderDTO;
import com.kevin.strategy.sample.modules.order.tradition.service.AbstractOrderService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Singleton;

/**
 * 促销订单服务
 *
 * @author kevin
 */
@OrderType(type = PROMOTION, desc = "促销订单")
@Singleton
public class PromotionOrderServiceImpl extends AbstractOrderService {

  @Override
  public double discount(OrderDTO orderDTO) {
    Logger.getGlobal().log(Level.INFO, "促销订单");
    return 0;
  }
}
