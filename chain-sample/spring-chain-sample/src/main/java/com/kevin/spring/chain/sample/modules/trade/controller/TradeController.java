package com.kevin.spring.chain.sample.modules.trade.controller;

import com.kevin.spring.chain.sample.modules.trade.entity.dto.PaymentReqDTO;
import com.kevin.spring.chain.sample.modules.trade.entity.dto.PaymentResDTO;
import com.kevin.spring.chain.sample.modules.trade.entity.vo.PaymentVO;
import com.kevin.spring.chain.sample.modules.trade.service.TradeService;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 交易
 *
 * @author kevin
 */
@RestController
public class TradeController {


  private static final Logger logger = LoggerFactory.getLogger(TradeController.class);

  @Resource
  private TradeService tradeService;


  @GetMapping("/api/trade/payment")
  public ResponseEntity payment(){
    logger.info("=========[payment]=========");
    PaymentResDTO paymentResDTO = tradeService.payment(new PaymentReqDTO());
    logger.info("调用支付响应数据:{}",paymentResDTO);
    PaymentVO paymentVO = new PaymentVO();
    paymentVO.setTradeId(paymentResDTO.getTradeId());
    return new ResponseEntity(paymentVO, HttpStatus.OK);
  }

}
