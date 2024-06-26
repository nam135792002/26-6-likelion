package vn.edu.likelion.ex2;

import java.math.BigDecimal;

public class Programmer extends Employee{
    private BigDecimal bonus;

    public Programmer(String id, String name, BigDecimal salary, BigDecimal bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        BigDecimal realSalary = this.salary.add(bonus);
        System.out.println("Salary Programmer: " + realSalary + "$");
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + this.id + ", Name: " + this.name + ", Salary: " + this.salary + "$" + ", Bonus: " + this.bonus + "$");
    }
}
