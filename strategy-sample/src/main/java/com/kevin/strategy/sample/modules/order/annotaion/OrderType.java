package com.kevin.strategy.sample.modules.order.annotaion;

import com.kevin.strategy.sample.modules.order.enums.OrderTypeEnum;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 订单类型
 *
 * @author kevin
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface OrderType {

  /**
   * 订单类型
   */
  OrderTypeEnum type();


  /**
   * 描述
   */
  String desc();

}
