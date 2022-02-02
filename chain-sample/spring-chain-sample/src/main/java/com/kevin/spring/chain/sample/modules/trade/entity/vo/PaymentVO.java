package com.kevin.spring.chain.sample.modules.trade.entity.vo;

/**
 * @author kevin
 */
public class PaymentVO {

  private String tradeId;


  public String getTradeId() {
    return tradeId;
  }

  public void setTradeId(String tradeId) {
    this.tradeId = tradeId;
  }


  @Override
  public String toString() {
    return "{"
        + "\"tradeId\":\""
        + tradeId + '\"'
        + '}';
  }
}
