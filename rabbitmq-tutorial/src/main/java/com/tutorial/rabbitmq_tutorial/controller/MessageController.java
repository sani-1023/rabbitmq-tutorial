package com.tutorial.rabbitmq_tutorial.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmq.client.RpcClient.Response;
import com.tutorial.rabbitmq_tutorial.publisher.RabbitMQPublisher;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class MessageController {
    
    private final RabbitMQPublisher rabbitMQPublisher;

    @RequestMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestParam("message") String message) {
        rabbitMQPublisher.publishMessage(message);
        return ResponseEntity.ok("Message published successfully");
    }

    
}
