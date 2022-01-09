package com.kevin.strategy.sample.functional.Interface;

import com.kevin.strategy.sample.common.utils.UUIDUtil;
import com.kevin.strategy.sample.functional.Interface.service.OrderDiscountService;
import com.kevin.strategy.sample.modules.order.tradition.entity.dto.OrderDTO;
import java.math.BigDecimal;
import java.util.logging.Logger;


public class OrderFunctionalApplication {

  public static void main(String[] args) {

    String orderNo = UUIDUtil.getInstance().generateShortUuid();
    OrderDTO orderDTO = new OrderDTO(orderNo, BigDecimal.valueOf(100));
    Logger.getGlobal().info("生成的订单信息:" + orderDTO);

    OrderDiscountService normalOrderService =
        new OrderDiscountService((order) -> order.getPrice().doubleValue(), orderDTO);
    double normalDiscount = normalOrderService.discount();
    Logger.getGlobal().info("正常订单计算的价格:" + normalDiscount);
    Logger.getGlobal().info("=========================================");

    OrderDiscountService grouponOrderService =
        new OrderDiscountService((order) -> order.getPrice().doubleValue() * 0.7, orderDTO);
    double grouponDiscount = grouponOrderService.discount();
    Logger.getGlobal().info("团购订单计算的价格:" + grouponDiscount);
    Logger.getGlobal().info("=========================================");

    OrderDiscountService promotionOrderService =
        new OrderDiscountService((order) -> order.getPrice().doubleValue() * 0.9, orderDTO);
    double promotionDiscount = promotionOrderService.discount();
    Logger.getGlobal().info("促销订单计算的价格:" + promotionDiscount);
    Logger.getGlobal().info("=========================================");


  }
}
