package com.kevin.strategy.sample.functional.Interface.service.funcational;


import com.kevin.strategy.sample.modules.order.tradition.entity.dto.OrderDTO;

/**
 * 订单折扣策略
 *
 * @author kevin
 */
@FunctionalInterface
public interface OrderDiscountStrategy {

  /**
   * 订单折扣后的价格
   *
   * @param orderDTO 订单信息
   */
  double discount(OrderDTO orderDTO);


}
