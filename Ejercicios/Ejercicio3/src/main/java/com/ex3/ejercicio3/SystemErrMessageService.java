package com.ex3.ejercicio3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class SystemErrMessageService implements  MessageService{
    @Override
    public void showMessage(String message) {
        System.err.println(message);
    }
}
