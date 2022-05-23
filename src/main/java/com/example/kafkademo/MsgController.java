package com.example.kafkademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class MsgController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendOrder(String msgId, String msg){
        kafkaTemplate.send("msg", msgId, msg);
    }
}
