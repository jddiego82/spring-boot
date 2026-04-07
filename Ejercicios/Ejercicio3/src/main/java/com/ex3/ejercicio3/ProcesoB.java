package com.ex3.ejercicio3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Order(2)
@Component
public class ProcesoB implements CommandLineRunner {

    private final MessageService messageService;

    public ProcesoB(@Qualifier("systemOutMessageService")MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void run(String... args) throws Exception {
        messageService.showMessage("ProcesoB");
    }


}
