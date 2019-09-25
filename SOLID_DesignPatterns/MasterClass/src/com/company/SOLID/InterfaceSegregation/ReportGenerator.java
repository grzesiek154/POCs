package com.company.SOLID.InterfaceSegregation;

public class ReportGenerator {

    private Reporting reporting;

    public void generateReport() {

        System.out.println(reporting.getName()+ " " + reporting.productBreakDown()+ " " + reporting.getDate());
    }
}
