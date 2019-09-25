package com.company.SOLID.DependencyInversion_TDP.processes;

public abstract class GeneralManufactoringProcess {
// TEMPLATE design pattern
    private String processName;

    public GeneralManufactoringProcess() {
    }

    public GeneralManufactoringProcess(String processName) {
        this.processName = processName;
    }

    protected abstract void Assembly();
    protected abstract void Testing();
    protected abstract void Packaging();
    protected abstract void Storage();

    // template method
    public void launchProcess() {
        if (processName != null && !processName.isEmpty()) {
            Assembly();
            Testing();
            Packaging();
            Storage();
        } else {
            System.out.println("No process name was specified");
        }
    }
}
