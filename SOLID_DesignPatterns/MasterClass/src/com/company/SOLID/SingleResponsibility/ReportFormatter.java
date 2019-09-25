package com.company.SOLID.SingleResponsibility;

public class ReportFormatter {

    String formatedOutput;

    public ReportFormatter(Object object, FormatType formatType) {



        switch (formatType) {
            case XML:
                formatedOutput = convertObjectToXML(object);
                break;
            case CSV:
                formatedOutput = convertObjectToCSV(object);
                break;
        }
    }

    private String convertObjectToXML(Object object) {
        return "XML : <title>" + object.toString() + "</title>";
    }

    private String convertObjectToCSV(Object object) {
        return "CSV : <title>" + object.toString() + "</title>";
    }

    protected String getFormattedValue() {
        return formatedOutput;
    }
}
