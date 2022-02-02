package com.kevin.spring.chain.sample.modules.trade.handler;

import com.kevin.spring.chain.sample.modules.trade.entity.dto.PaymentReqDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author kevin
 */
@Component
@Order(1)
public class TradeParameterValidateHandler extends AbstractTradeHandler {

  private static final Logger logger = LoggerFactory.getLogger(TradeParameterValidateHandler.class);

  @Override
  protected void doHandler(PaymentReqDTO paymentReqDTO) {
    logger.info("======处理参数校验=====");

  }
}
