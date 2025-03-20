package com.example.spring_boot_kafka.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    private String orderId;
    private String product;
    private String quantity;
}
