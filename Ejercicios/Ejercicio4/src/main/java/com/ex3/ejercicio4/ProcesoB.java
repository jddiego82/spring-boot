package com.ex3.ejercicio4;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class ProcesoB implements CommandLineRunner {

    private final MessageService messageService;

    public ProcesoB(@Qualifier("systemOutMessageService")MessageService messageService, Faker faker) {
        this.messageService = messageService;
        this.faker = faker;
    }

    private Faker faker = new Faker();

    @Override
    public void run(String... args) throws Exception {
        messageService.showMessage("ProcesoB - "+faker.yoda().quote());
    }


}
