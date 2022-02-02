package com.kevin.spring.chain.sample.modules.trade.service.impl;

import com.kevin.spring.chain.sample.modules.trade.entity.dto.PaymentReqDTO;
import com.kevin.spring.chain.sample.modules.trade.entity.dto.PaymentResDTO;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TradeServiceImpl extends AbstractTradeService {

  private static final Logger logger = LoggerFactory.getLogger(TradeServiceImpl.class);

  @Override
  protected PaymentResDTO invokePayment(PaymentReqDTO paymentReqDTO) {
    logger.info("=====执行核心支付逻辑=====");
    PaymentResDTO paymentResDTO = new PaymentResDTO();
    paymentResDTO.setTradeId(UUID.randomUUID().toString().replaceAll("-", ""));
    return paymentResDTO;

  }
}
