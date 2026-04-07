package com.ex3.ejercicio3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service
public class SystemOutMessageService implements  MessageService{
    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

}
