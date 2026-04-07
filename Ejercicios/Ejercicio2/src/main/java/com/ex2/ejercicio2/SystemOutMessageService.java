package com.ex2.ejercicio2;

public class SystemOutMessageService implements  MessageService{
    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

}
