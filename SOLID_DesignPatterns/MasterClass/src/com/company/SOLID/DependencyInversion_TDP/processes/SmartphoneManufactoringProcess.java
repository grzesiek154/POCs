package com.company.SOLID.DependencyInversion_TDP.processes;

public class SmartphoneManufactoringProcess extends GeneralManufactoringProcess {

    public SmartphoneManufactoringProcess(String processName) {
        super(processName);
    }

    @Override
    protected void Assembly() {
        System.out.println("assembled smartphone");
    }

    @Override
    protected void Testing() {
        System.out.println("testing smartphone");
    }

    @Override
    protected void Packaging() {
        System.out.println("packaging smartphone");
    }

    @Override
    protected void Storage() {
        System.out.println("smartphone sotrage");
    }
}
