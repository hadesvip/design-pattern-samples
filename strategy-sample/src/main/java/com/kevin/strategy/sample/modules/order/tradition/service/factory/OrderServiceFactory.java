package com.kevin.strategy.sample.modules.order.tradition.service.factory;

import com.google.common.collect.Lists;
import com.kevin.strategy.sample.modules.order.tradition.annotaion.OrderType;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import com.kevin.strategy.sample.modules.order.tradition.service.OrderService;

/**
 * 订单服务工厂
 *
 * @author kevin
 */
@Singleton
public class OrderServiceFactory {

  @Inject
  @Named("normalOrderService")
  private OrderService normalOrderService;

  @Inject
  @Named("promotionOrderService")
  private OrderService promotionOrderService;

  @Inject
  @Named("grouponOrderService")
  private OrderService grouponOrderService;

  private final AtomicBoolean initialize = new AtomicBoolean(false);

  private final List<OrderService> orderServiceList = Lists.newArrayList();

  void initializedOrderServiceList() {
    if (initialize.get()) {
      return;
    }
    orderServiceList.add(normalOrderService);
    orderServiceList.add(promotionOrderService);
    orderServiceList.add(grouponOrderService);
    initialize.compareAndSet(false, true);
  }

  public OrderService getByOrderType(String orderType) {
    Logger.getGlobal().log(Level.INFO, "根据订单类型:" + orderType + "获取订单服务");
    initializedOrderServiceList();
    return orderServiceList.stream()
        .filter(orderService -> {
          OrderType orderTypeAnnotation = orderService.getClass().getAnnotation(OrderType.class);
          return Objects.equals(orderTypeAnnotation.type().name(), orderType);
        }).findFirst().orElseThrow(() -> new RuntimeException("未匹配上订单服务"));

  }

}
