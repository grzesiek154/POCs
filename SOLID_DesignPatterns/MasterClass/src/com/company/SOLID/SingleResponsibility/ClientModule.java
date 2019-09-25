package com.company.SOLID.SingleResponsibility;

public class ClientModule {


    public static void main(String[] args) {
        Employee peggy = new Employee(1, "peggy", "accounting", true);
        ClientModule.hireNewEmployee(peggy);
        printEmployeeReport(peggy);
    }
    public static void hireNewEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmplyee(employee);
    }

    public static void terminateEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmplyee(employee);

    }

    public static void printEmployeeReport(Employee employee) {

        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee,FormatType.CSV);
        System.out.println(formatter.getFormatedEmployee());
    }
}
