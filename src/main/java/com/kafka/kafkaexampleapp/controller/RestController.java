package com.kafka.kafkaexampleapp.controller;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private KafkaTemplate<String,String> kafkaTemplate;

    public RestController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping("send/{message}/{topic}")
    public String sendMessage(@PathVariable String message,@PathVariable String topic){

        kafkaTemplate.send(message,topic);
        return "Message sent...";
    }
}
