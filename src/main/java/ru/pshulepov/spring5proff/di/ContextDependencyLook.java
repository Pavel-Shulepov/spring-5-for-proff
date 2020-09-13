package ru.pshulepov.spring5proff.di;

public class ContextDependencyLook implements ManagedComponent {

    private Dependency dependency;

    @Override
    public void performLookup(Container container) {
        dependency = (Dependency) container.getDependency("myDep");
    }

    @Override
    public String toString() {
        return dependency.toString();
    }
}
