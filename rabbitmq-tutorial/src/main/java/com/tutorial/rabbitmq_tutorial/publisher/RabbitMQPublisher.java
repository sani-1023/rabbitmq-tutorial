package com.tutorial.rabbitmq_tutorial.publisher;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RabbitMQPublisher {
    
    private static final String EXCHANGE_NAME = "exchange_demo";
    private static final String ROUTING_KEY = "routing_key_demp";

    private static final Logger logger = LoggerFactory.getLogger(RabbitMQPublisher.class);


    private final RabbitTemplate rabbitTemplate;


    public void publishMessage(String message) {
        logger.info("Publishing message: {}", message);
        rabbitTemplate.convertAndSend(EXCHANGE_NAME, ROUTING_KEY, message);
        logger.info("Message published successfully");
    }

}
