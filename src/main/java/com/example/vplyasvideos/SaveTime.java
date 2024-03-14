package com.example.vplyasvideos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaveTime {

  private static final Logger logger = LoggerFactory.getLogger(SaveTime.class);

  @PostMapping("/sas")
  public void getVideos(@RequestBody Sas sas) {
    logger.info(String.valueOf(sas.getD()));
  }
}
