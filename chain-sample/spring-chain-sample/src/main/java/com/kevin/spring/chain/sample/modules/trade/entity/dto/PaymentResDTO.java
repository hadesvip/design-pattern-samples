package com.kevin.spring.chain.sample.modules.trade.entity.dto;

public class PaymentResDTO {

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
