package com.company.DesignPatterns.ObserverPattern.CoffeShopExercise;

public class Customer implements WaitingCustomer {

    private String name;
    private String dringOrdered;

    public Customer(String name, String dringOrdered) {
        this.name = name;
        this.dringOrdered = dringOrdered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDringOrdered() {
        return dringOrdered;
    }

    public void setDringOrdered(String dringOrdered) {
        this.dringOrdered = dringOrdered;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", dringOrdered='" + dringOrdered + '\'' +
                '}';
    }

    @Override
    public void orderReady(String preparedDring) {
        System.out.println("Coffee drink " + preparedDring + " for " + name + " is ready");
    }
}
