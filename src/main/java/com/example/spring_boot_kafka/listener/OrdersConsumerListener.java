package com.example.spring_boot_kafka.listener;

import com.example.spring_boot_kafka.entity.Orders;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrdersConsumerListener {
    @KafkaListener (topics= "order-topic", groupId="complex-data-group")
            public void consume(Orders orders){
        System.out.println("Consumed message"+orders);
    }
}
