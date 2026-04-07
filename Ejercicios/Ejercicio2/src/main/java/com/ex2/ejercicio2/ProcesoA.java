package com.ex2.ejercicio2;

import jakarta.annotation.Priority;
import org.apache.logging.log4j.message.Message;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Priority(1)
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
