package com.company.SOLID.OpenClosedPrinciple.RemoteControllerEx;

public class Projector implements Device {


    private String name;

    public Projector(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {

        System.out.println("turning on " + toString());
    }

    @Override
    public void turnOff() {

    }

    @Override
    public String toString() {
        return "Projector{" +
                "name='" + name + '\'' +
                '}';
    }
}
