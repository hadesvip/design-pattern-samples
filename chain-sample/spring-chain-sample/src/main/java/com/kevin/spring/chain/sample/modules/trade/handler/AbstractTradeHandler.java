package com.kevin.spring.chain.sample.modules.trade.handler;

import com.kevin.spring.chain.sample.modules.trade.entity.dto.PaymentReqDTO;
import java.util.Objects;

public abstract class AbstractTradeHandler {


  private AbstractTradeHandler nextHandler;


  protected boolean hasNext() {
    return Objects.nonNull(nextHandler);
  }

  public void handler(PaymentReqDTO paymentReqDTO) {
    doHandler(paymentReqDTO);
    if (hasNext()) {
      nextHandler.doHandler(paymentReqDTO);
    }
  }


  public void setNextHandler(AbstractTradeHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  public AbstractTradeHandler getNextHandler() {
    return nextHandler;
  }



  protected abstract void doHandler(PaymentReqDTO paymentReqDTO);


}
