package ru.pshulepov.spring5proff.di;

public class SetterInjection {

    private Dependency dependency;

    // Внедрение зависимости через сеттер
    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }

    @Override
    public String toString() {
        return dependency.toString();
    }
}
