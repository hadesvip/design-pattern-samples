package com.kevin.strategy.sample.modules.order.tradition.entity.dto;

import com.kevin.strategy.sample.common.utils.GsonUtil;
import java.math.BigDecimal;

/**
 * 订单信息
 *
 * @author kevin
 */
public class OrderDTO {

  /**
   * 订单号
   */
  private String orderNo;

  /**
   * 价格
   */
  private BigDecimal price;


  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public OrderDTO() {
  }

  public OrderDTO(String orderNo, BigDecimal price) {
    this.orderNo = orderNo;
    this.price = price;
  }

  @Override
  public String toString() {
    return GsonUtil.getInstance().toJson(this);
  }
}
