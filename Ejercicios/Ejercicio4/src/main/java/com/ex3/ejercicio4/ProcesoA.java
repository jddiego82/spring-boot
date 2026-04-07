package com.ex3.ejercicio4;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class ProcesoA implements CommandLineRunner {
    private final MessageService messageService;

    public ProcesoA(MessageService messageService, Faker faker) {
        this.messageService = messageService;
        this.faker=faker;

    }

    private Faker faker = new Faker();

    @Override
    public void run(String... args) throws Exception {
        messageService.showMessage("ProcesoA - "+faker.backToTheFuture().quote());
    }


}
