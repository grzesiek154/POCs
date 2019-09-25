package com.company.SOLID.OpenClosedPrinciple;

public class Doctor extends Employee {

    public Doctor(long id, String name, String department, boolean isWorking) {
        super(id, name, department, isWorking);
        System.out.println("Doctor is doing stuff");
    }

    private void prescribeMedicine() {
        System.out.println("Prescribe Medicine");
    }

    private void diagnosePatient() {
        System.out.println("diagnosing patient");
    }
    @Override
    public void performDuties() {
        prescribeMedicine();
        diagnosePatient();

    }
}
