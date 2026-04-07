package com.ex3.ejercicio3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(3)
@Component
public class ProcesoC implements CommandLineRunner {
    private final MessageService messageService;

    public ProcesoC(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void run(String... args) throws Exception {
        messageService.showMessage("ProcesoC");
    }


}
