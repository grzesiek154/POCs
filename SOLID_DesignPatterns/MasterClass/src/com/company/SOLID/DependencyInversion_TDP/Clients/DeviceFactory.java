package com.company.SOLID.DependencyInversion_TDP.Clients;

import com.company.SOLID.DependencyInversion_TDP.processes.GeneralManufactoringProcess;
import com.company.SOLID.DependencyInversion_TDP.processes.SmartphoneManufactoringProcess;

public class DeviceFactory {

    public static void main(String[] args) {
        GeneralManufactoringProcess manufactoringProcess = new SmartphoneManufactoringProcess("Samsung Mobile");
        manufactoringProcess.launchProcess();
    }
}
