package com.kevin.spring.chain.sample.modules.trade.handler;

import com.kevin.spring.chain.sample.modules.trade.entity.dto.PaymentReqDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 支付权限校验
 *
 * @author kevin
 */
@Component
@Order(2)
public class TradeAuthValidateHandler extends AbstractTradeHandler {

  private static final Logger logger = LoggerFactory.getLogger(TradeAuthValidateHandler.class);

  @Override
  protected void doHandler(PaymentReqDTO paymentReqDTO) {
    logger.info("=====支付权限校验=====");
  }
}
