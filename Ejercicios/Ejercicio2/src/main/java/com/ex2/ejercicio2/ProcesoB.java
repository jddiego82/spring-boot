package com.ex2.ejercicio2;

import jakarta.annotation.Priority;
import org.apache.logging.log4j.message.Message;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Priority(2)
@Component
public class ProcesoB implements CommandLineRunner {
    private final MessageService messageService;

    public ProcesoB(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void run(String... args) throws Exception {
        messageService.showMessage("ProcesoB");
    }


}
