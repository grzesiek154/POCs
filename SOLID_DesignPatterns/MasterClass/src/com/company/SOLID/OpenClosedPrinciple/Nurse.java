package com.company.SOLID.OpenClosedPrinciple;

public class Nurse extends Employee {


    public Nurse(long id, String name, String department, boolean isWorking) {
        super(id, name, department, isWorking);
        System.out.println("Nurse in action...");
    }
    // Nurses
    private void checkVitalSigns() {
        System.out.println("Checking Vitals");
    }

    private void drawBlod () {
        System.out.println("drawing blood");
    }

    @Override
    public void performDuties() {
        checkVitalSigns();
        drawBlod();
    }
}
