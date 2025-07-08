package com.tutorial.rabbitmq_tutorial.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQconsumer {
    private static final String QUEUE_NAME = "queue_demo";

    @RabbitListener(queues = QUEUE_NAME)
    public void consumeMessage(String message) {
        System.out.println("Received message: " + message);
        // Process the message as needed
    }
}
