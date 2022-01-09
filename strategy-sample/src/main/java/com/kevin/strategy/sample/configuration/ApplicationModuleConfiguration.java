package com.kevin.strategy.sample.configuration;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.kevin.strategy.sample.modules.order.tradition.service.OrderService;
import com.kevin.strategy.sample.modules.order.tradition.service.impl.GrouponOrderServiceImpl;
import com.kevin.strategy.sample.modules.order.tradition.service.impl.NormalOrderServiceImpl;
import com.kevin.strategy.sample.modules.order.tradition.service.impl.PromotionOrderServiceImpl;

/**
 * @author kevin
 */
public class ApplicationModuleConfiguration extends AbstractModule {

  @Override
  protected void configure() {
    bind(OrderService.class).annotatedWith(Names.named("normalOrderService"))
        .to(NormalOrderServiceImpl.class);
    bind(OrderService.class).annotatedWith(Names.named("promotionOrderService"))
        .to(PromotionOrderServiceImpl.class);
    bind(OrderService.class).annotatedWith(Names.named("grouponOrderService"))
        .to(GrouponOrderServiceImpl.class);
  }
}
