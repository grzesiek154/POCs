package com.company.DesignPatterns.DependencyInjection;

public class SmalEngine implements Engine{

    private int horsePower;

    public SmalEngine(int horsePower) {
        this.horsePower = horsePower;
    }
    @Override
    public void startEngine() {
        System.out.println("Small engine started with " + horsePower + " of horse power");
    }
}
