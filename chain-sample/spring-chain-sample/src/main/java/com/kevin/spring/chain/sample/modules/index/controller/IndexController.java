package com.kevin.spring.chain.sample.modules.index.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页
 *
 * @author kevin
 */
@RestController
public class IndexController {

  private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

  @GetMapping("/")
  public ResponseEntity<String> welcome() {
    logger.info("spring-chain-application start success!");
    return new ResponseEntity<>("spring-chain-application start success!", HttpStatus.OK);
  }

}
