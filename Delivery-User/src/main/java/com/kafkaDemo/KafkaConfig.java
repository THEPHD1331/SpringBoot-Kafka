package com.kafkaDemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics = AppConstants.LOCATION_TOPIC, groupId = AppConstants.GROUP_ID)
    public void latestLocation(String location){

        System.out.println("Current Location: "+location);
    }
}
