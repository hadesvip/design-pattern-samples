package com.kevin.spring.chain.sample.modules.trade.handler;

import com.kevin.spring.chain.sample.modules.trade.entity.dto.PaymentReqDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 支付规则校验
 *
 * @author kevin
 */
@Component
@Order(3)
public class TradeRuleValidateHandler extends AbstractTradeHandler {

  private static final Logger logger = LoggerFactory.getLogger(TradeRuleValidateHandler.class);


  @Override
  protected void doHandler(PaymentReqDTO paymentReqDTO) {
    logger.info("=====支付规则校验====");

  }
}
