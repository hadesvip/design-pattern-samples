package com.kevin.strategy.sample.service;


import com.kevin.strategy.sample.entity.Order;

/**
 * 订单服务
 *
 * @author kevin
 */
public interface OrderService {

  double discount(Order order);

}
