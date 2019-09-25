package com.company.SOLID.SingleResponsibility;

public class EmployeeReportFormatter extends ReportFormatter{

    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);
    }


    public String getFormatedEmployee() {
        return getFormattedValue();
    }
}
