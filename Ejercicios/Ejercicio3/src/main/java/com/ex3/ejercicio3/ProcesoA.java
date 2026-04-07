package com.ex3.ejercicio3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class ProcesoA implements CommandLineRunner {
    private final MessageService messageService;

    public ProcesoA(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void run(String... args) throws Exception {
        messageService.showMessage("ProcesoA");
    }


}
