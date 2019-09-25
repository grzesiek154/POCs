package com.company.DesignPatterns.ObserverPattern.CoffeShopExercise;

import java.util.ArrayList;
import java.util.List;

public class CoffeAttendent {

    private List<Customer> customerList;
    private List<String> completedDrinks;

    public CoffeAttendent() {
        this.customerList = new ArrayList<>();
        this.completedDrinks = new ArrayList<>();
    }

    public void takeOrder (Customer customer) {
        customerList.add(customer);
        System.out.println("Order from " + customer.getName() + " has been taken.");
    }

    public void prepareDrink(String drink) {
        double timeTaken = Math.random()* 10; // give value between 1 and 50
        try {
            Thread.sleep((long) (timeTaken)*1000);
            completedDrinks.add(drink);
        } catch (InterruptedException e) {
            System.out.println(" for some reason, drink was not prepared..");
        }
    }

  public void callOutCompletedOrders() {
        for (String readyDring : completedDrinks) {
            System.out.println("Order up: " + readyDring);
            for (Customer customer : customerList) {
                customer.orderReady(readyDring);
            }
        }
    }
}
