package com.kafka.kafkaexampleapp.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.KafkaListeners;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private static void accept(ConsumerRecord<String, String> s) {
        System.out.println(s.key() + "---" + s.value());
    }

    @KafkaListener(topics = "test5", groupId = "goupe-ms")
    public void onMessage(ConsumerRecord<String ,String> message){
        System.out.println("*******");
        System.out.println(message);
    }
}
