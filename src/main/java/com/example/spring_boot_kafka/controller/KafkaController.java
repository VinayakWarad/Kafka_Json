package com.example.spring_boot_kafka.controller;

import com.example.spring_boot_kafka.entity.Orders;
import com.example.spring_boot_kafka.service.OrdersProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/orders")
@RestController
public class KafkaController {
    @Autowired
    OrdersProducerService ordersProducerService;
    @PostMapping("/publish")
    public ResponseEntity<Orders> publishOrder(@RequestParam Orders orders){
        ordersProducerService.sendMessages(orders);
      return new ResponseEntity<>(orders,HttpStatus.CREATED);
    }
}
