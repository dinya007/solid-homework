package ru.sbt.bit.ood.solid.homework.entity;

/**
 * Created by denis on 01/11/15.
 */
public class Employee {

    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
