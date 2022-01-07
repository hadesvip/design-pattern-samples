package com.kevin.strategy.sample.modules.order.service.factory;

import com.kevin.strategy.sample.modules.order.annotaion.OrderType;
import com.kevin.strategy.sample.modules.order.service.OrderService;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;

/**
 * 订单服务工厂
 *
 * @author kevin
 */
public class OrderServiceFactory {


  @Inject
  private List<OrderService> orderServiceList;





  public OrderService getByOrderType(String orderType) {
    Logger.getGlobal().log(Level.INFO, "根据订单类型:{}获取订单服务", orderType);
    return orderServiceList.stream()
        .filter(orderService -> {
          OrderType orderTypeAnnotation = orderService.getClass().getAnnotation(OrderType.class);
          return Objects.equals(orderTypeAnnotation.type().name(), orderType);
        }).findFirst().orElseThrow(() -> new RuntimeException("未匹配上订单服务"));

  }

}
