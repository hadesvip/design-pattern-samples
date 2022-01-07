package com.kevin.strategy.sample.modules.order.service.impl;

import static com.kevin.strategy.sample.modules.order.enums.OrderTypeEnum.PROMOTION;

import com.kevin.strategy.sample.modules.order.annotaion.OrderType;
import com.kevin.strategy.sample.modules.order.entity.dto.OrderDTO;
import com.kevin.strategy.sample.modules.order.service.AbstractOrderService;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.logging.Level;
import java.util.logging.Logger;

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
