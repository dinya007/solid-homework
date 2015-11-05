package ru.sbt.bit.ood.solid.homework.report;

import ru.sbt.bit.ood.solid.homework.entity.Employee;

import java.util.List;

/**
 * Created by denis on 01/11/15.
 */
public interface Report {

    List<Employee> getEmployees();
    void addEmployee(Employee employee);

    double getSummaryResult();
    void setSummaryResult(double summaryResult);


}
