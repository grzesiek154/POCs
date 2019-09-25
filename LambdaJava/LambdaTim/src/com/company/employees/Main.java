package com.company.employees;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);

        System.out.println("Employees over");
        employees.forEach(employee -> {
           if (employee.getAge() >30) {
               System.out.println(employee.getName());
           }
        });

    printEmployeesByAge(employees, "Employees over 30", employee -> employee.getAge() > 30);
    printEmployeesByAge(employees, "\nYounger that 25, ", new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge() < 25;
            }
        });

        IntPredicate graterThan15 = i -> i > 15;
        IntPredicate lessThan100 = i -> i < 100;
        System.out.println(graterThan15.test(10));
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(graterThan15.and(lessThan100).test(50));
        System.out.println(graterThan15.and(lessThan100).test(10));

        Random random = new Random();
        Supplier<Integer> randomSuplier = () -> random.nextInt(1000);

        System.out.println("=========================");
//        employees.forEach(employee -> {
//            String lastName = employee.getName().substring(employee.getName().indexOf(' ') +1);
//            System.out.println("Last Name is: " + lastName);
//        });
        System.out.println("===============================");

        Function<Employee, String> getLastName = (Employee employee) -> {
            return employee.getName().substring(employee.getName().indexOf(' ') + 1);
        };

        Function<Employee, String> getFirstName = (Employee employee) -> {
            return employee.getName().substring(employee.getName().indexOf(' '));
        };
        Function<Employee, String> upperCase = employee -> employee.getName().toUpperCase();
        Function<String, String> firstName = name -> name.substring(0, name.indexOf(' '));

        Function chainedFunction = upperCase.andThen(firstName);
        System.out.println("Chained Function");
        System.out.println(chainedFunction.apply(employees.get(0)));


        //BiFunction
        BiFunction<String, Employee, String> concatAge = (String name, Employee employee) -> {
            return name.concat(" " + employee.getAge());
        };
        String upperName = upperCase.apply(employees.get(0));
        System.out.println(concatAge.apply(upperName, employees.get(0)));

    }

    private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition) {

        System.out.println(ageText);
        System.out.println("==========================");
        employees.forEach(employee -> {
          if (ageCondition.test(employee)) {
              System.out.println(employee.getName());
          }
        });

    }
}
