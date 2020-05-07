package com.kafka.kafkaexampleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaExampleAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaExampleAppApplication.class, args);
    }

}
