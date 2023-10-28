package com.kafkaDemo.service;

import com.kafkaDemo.config.AppConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaService {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    public boolean updateLocation(String location){

        this.kafkaTemplate.send(AppConstants.TOPIC_NAME, location);
        log.info("-----Updated Location-----");

        return true;
    }

}
