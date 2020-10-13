package com.rabbitmq.mensagensrabbitmqapi.resource;

import com.rabbitmq.mensagensrabbitmqapi.sender.FilaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sendmensage")
public class sendResource {

    @Autowired
    private FilaSender filaSender;

    @GetMapping("/enviar")
    @ResponseStatus(HttpStatus.OK)
    public void enviarMensagem(@RequestParam(required = true) String mensage) {
        filaSender.send(mensage);
    }

}
