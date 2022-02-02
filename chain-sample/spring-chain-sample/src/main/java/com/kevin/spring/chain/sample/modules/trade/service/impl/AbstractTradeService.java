package com.kevin.spring.chain.sample.modules.trade.service.impl;

import com.kevin.spring.chain.sample.modules.trade.entity.dto.PaymentReqDTO;
import com.kevin.spring.chain.sample.modules.trade.entity.dto.PaymentResDTO;
import com.kevin.spring.chain.sample.modules.trade.handler.AbstractTradeHandler;
import com.kevin.spring.chain.sample.modules.trade.service.TradeService;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

public abstract class AbstractTradeService implements TradeService, InitializingBean {

  private static final Logger logger = LoggerFactory.getLogger(AbstractTradeService.class);

  @Resource
  private List<AbstractTradeHandler> tradeHandlerList;


  private AbstractTradeHandler tradeHandler;


  @Override
  public void afterPropertiesSet() throws Exception {
    if (CollectionUtils.isEmpty(tradeHandlerList)) {
      logger.warn("No trade handlers");
      return;
    }
    tradeHandler = tradeHandlerList.get(0);
    for (int i = 1; i < tradeHandlerList.size(); i++) {
      AbstractTradeHandler currentHandler = tradeHandlerList.get(i - 1);
      AbstractTradeHandler nextTradeHandler = tradeHandlerList.get(i);
      currentHandler.setNextHandler(nextTradeHandler);
    }
    logger.debug("trade handlers initialize success...");
  }

  @Override
  public PaymentResDTO payment(PaymentReqDTO paymentReqDTO) {
    //参数校验
    tradeHandler.handler(paymentReqDTO);
    //核心方法调用
    return invokePayment(paymentReqDTO);
  }


  protected abstract PaymentResDTO invokePayment(PaymentReqDTO paymentReqDTO);
}
