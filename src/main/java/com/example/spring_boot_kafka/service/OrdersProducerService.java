package com.example.spring_boot_kafka.service;

import com.example.spring_boot_kafka.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrdersProducerService {
    private static final String TOPIC="complex-data-group";
    @Autowired
    private KafkaTemplate<String, Orders> kafkaTemplate;

    public void sendMessages(Orders order){
        this.kafkaTemplate.send(TOPIC,order);
    }
}
