package com.company.SOLID.SingleResponsibility;

import java.sql.SQLException;

public class EmployeeDAO {

    public void saveEmplyee(Employee employee) {
        DataBaseConnectionManager connectionManager = DataBaseConnectionManager.getManagerInstance();
        try{
            connectionManager.connect();
        } catch (SQLException sqlE) {
            sqlE.getErrorCode();
        }
        connectionManager.disconnect();

    }

    public void deleteEmplyee(Employee employee) {

    }
}
