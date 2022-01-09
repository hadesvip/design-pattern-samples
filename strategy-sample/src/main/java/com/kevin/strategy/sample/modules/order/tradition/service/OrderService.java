package com.kevin.strategy.sample.modules.order.tradition.service;

import com.kevin.strategy.sample.modules.order.tradition.entity.dto.OrderDTO;

/**
 * 订单服务
 *
 * @author kevin
 */
public interface OrderService {

  /**
   *
   */
  double discount(OrderDTO orderDTO);
}
