package ru.pshulepov.spring5proff.di;

public class ConstructorInjection {

    // Внедрение зависимости через конструктор
    private final Dependency dependency;
    public ConstructorInjection(Dependency dependency) {
        this.dependency = dependency;
    }

}
