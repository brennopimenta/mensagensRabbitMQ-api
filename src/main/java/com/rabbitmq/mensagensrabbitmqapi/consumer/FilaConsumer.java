package com.rabbitmq.mensagensrabbitmqapi.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class FilaConsumer {

    @RabbitListener(queues = {"${queue.order.name}"})
    public void receive(@Payload String fileBody) {
        System.out.println("A seguinte mensagem foi consumida da fila no RabbitMQ : " + fileBody);
    }

}
