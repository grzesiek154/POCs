package com.company.SOLID.SingleResponsibility;

public class Employee {
    private long id;
    private String name;
    private String department;
    private boolean isWorking;

    public Employee(long id, String name, String department, boolean isWorking) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.isWorking = isWorking;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", isWorking=" + isWorking +
                '}';
    }
}
