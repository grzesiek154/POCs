package com.company.SOLID.DependencyInversion_TDP.processes;

public class LaptopManufactoringProcess extends GeneralManufactoringProcess {

    public LaptopManufactoringProcess(String processName) {
        super(processName);
    }

    @Override
    protected void Assembly() {
        System.out.println("assembled laptop");
    }

    @Override
    protected void Testing() {
        System.out.println("testing laptop");
    }

    @Override
    protected void Packaging() {
        System.out.println("packaging laptop");
    }

    @Override
    protected void Storage() {
        System.out.println("smartphone laptop");
    }
}
