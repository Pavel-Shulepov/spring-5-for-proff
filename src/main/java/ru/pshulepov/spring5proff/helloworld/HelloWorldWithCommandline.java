package ru.pshulepov.spring5proff.helloworld;

public class HelloWorldWithCommandline {

    public static void main(String[] args) {
        System.out.println(args.length > 0 ? args[0] : "Hello World!");
    }

}
