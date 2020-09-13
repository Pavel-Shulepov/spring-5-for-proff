package ru.pshulepov.spring5proff.helloworld;

public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World";
    }
}
