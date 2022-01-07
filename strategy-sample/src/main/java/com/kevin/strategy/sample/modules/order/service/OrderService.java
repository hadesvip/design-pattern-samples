package com.kevin.strategy.sample.modules.order.service;

import com.kevin.strategy.sample.modules.order.entity.dto.OrderDTO;

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
