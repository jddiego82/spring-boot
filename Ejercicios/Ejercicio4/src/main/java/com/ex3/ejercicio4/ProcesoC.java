package com.ex3.ejercicio4;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(3)
@Component
public class ProcesoC implements CommandLineRunner {
    private final MessageService messageService;

    public ProcesoC(MessageService messageService, Faker faker) {
        this.messageService = messageService;
        this.faker = faker;
    }
    private Faker faker = new Faker();

    @Override
    public void run(String... args) throws Exception {
        messageService.showMessage("ProcesoC - "+faker.leagueOfLegends().quote());
    }


}
