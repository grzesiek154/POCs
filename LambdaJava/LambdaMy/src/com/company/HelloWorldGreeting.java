package com.company;

public class HelloWorldGreeting implements Greeting {
    @Override
    public void perform() {
        System.out.println("HelloWorld");
    }
}
