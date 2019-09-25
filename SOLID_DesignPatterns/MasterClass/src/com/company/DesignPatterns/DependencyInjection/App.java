package com.company.DesignPatterns.DependencyInjection;

public class App {

    public static void main(String[] args) {

        Vehicle raceCar = new Vehicle(new LargeEngine(250));
        raceCar.crankIgnition();
    }
}
