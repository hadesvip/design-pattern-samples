package com.kevin.strategy.sample.modules.order;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.kevin.strategy.sample.configuration.ApplicationModuleConfiguration;
import com.kevin.strategy.sample.modules.order.entity.dto.OrderDTO;
import com.kevin.strategy.sample.modules.order.service.OrderService;
import com.kevin.strategy.sample.modules.order.service.factory.OrderServiceFactory;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kevin
 */
public class OrderApplication {

  public static void main(String[] args) {

    Injector injector = Guice.createInjector(new ApplicationModuleConfiguration());
    OrderServiceFactory orderServiceFactory = injector.getInstance(OrderServiceFactory.class);
    Logger.getGlobal().log(Level.INFO, orderServiceFactory.toString());
    Logger.getGlobal().log(Level.INFO, "=============================");
    OrderService normalOrderService = orderServiceFactory.getByOrderType("NORMAL");
    OrderService grouponOrderService = orderServiceFactory.getByOrderType("GROUPON");
    OrderService promotionOrderService = orderServiceFactory.getByOrderType("PROMOTION");

    normalOrderService.discount(new OrderDTO());
    grouponOrderService.discount(new OrderDTO());
    promotionOrderService.discount(new OrderDTO());

  }
}
