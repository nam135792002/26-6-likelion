package vn.edu.likelion.ex2;

import java.math.BigDecimal;

public abstract class Employee {
    protected String id;
    protected String name;
    protected BigDecimal salary;

    public Employee(String id, String name, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    abstract public void calculateSalary();
    abstract public void displayInfo();
}
