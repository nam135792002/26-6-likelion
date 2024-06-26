package vn.edu.likelion.ex2;

import java.math.BigDecimal;

public class Manager extends Employee{

    private double seniorPercent;

    public Manager(String id, String name, BigDecimal salary, double seniorPercent) {
        super(id, name, salary);
        this.seniorPercent = seniorPercent;
    }

    @Override
    public void calculateSalary() {
        BigDecimal salary = this.salary.add(this.salary.multiply(BigDecimal.valueOf(this.seniorPercent / 100)));
        System.out.println("Salary employee: " + salary + "$");
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + this.id + ", Name: " + this.name + ", Salary: " + this.salary + "$" + ", Senior percent: " + this.seniorPercent);
    }
}
