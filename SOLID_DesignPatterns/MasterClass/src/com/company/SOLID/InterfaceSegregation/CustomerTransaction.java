package com.company.SOLID.InterfaceSegregation;

import java.util.Date;
import java.util.List;

public class CustomerTransaction implements Accounting, Reporting {


    private List<Product> products;

    private Customer customer;

    public CustomerTransaction(List<Product> products, Customer customer) {
        this.products = products;
        this.customer = customer;
    }

    @Override
    public String getName() {
        return customer.getName();

    }

    @Override
    public Date getDate() {
        return new Date();
    }

    @Override
    public String productBreakDown() {
       String reportListing = null;
        for (Product product : products) {
           reportListing += product.getName();
       }
       return reportListing;
}

    @Override
    public void prepareInvoice() {
        System.out.println("invoice prepared...");
    }

    @Override
    public void chargeCustomer() {
        System.out.println("charging customer");
    }
}
