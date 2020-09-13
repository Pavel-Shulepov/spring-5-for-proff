package ru.pshulepov.spring5proff.helloworld;

public interface MessageRenderer {

    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();

}
