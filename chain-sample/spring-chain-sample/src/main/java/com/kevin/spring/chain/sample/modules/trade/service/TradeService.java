package com.kevin.spring.chain.sample.modules.trade.service;

import com.kevin.spring.chain.sample.modules.trade.entity.dto.PaymentReqDTO;
import com.kevin.spring.chain.sample.modules.trade.entity.dto.PaymentResDTO;

public interface TradeService {

  PaymentResDTO payment(PaymentReqDTO paymentReqDTO);

}
