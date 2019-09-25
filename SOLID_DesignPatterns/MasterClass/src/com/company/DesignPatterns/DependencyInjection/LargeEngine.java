package com.company.DesignPatterns.DependencyInjection;

public class LargeEngine implements Engine {

    private int horsePower;

    public LargeEngine(int horsePower) {
        this.horsePower = horsePower;
    }
    @Override
    public void startEngine() {
        System.out.println("Large engine started with " + horsePower + " of horse power");
    }
}
