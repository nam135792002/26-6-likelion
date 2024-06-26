package vn.edu.likelion.ex2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("111", "Nam", BigDecimal.valueOf(2000), 1.25);
        Programmer programmer = new Programmer("112", "Tay", BigDecimal.valueOf(3000), BigDecimal.valueOf(500));

        manager.displayInfo();
        manager.calculateSalary();

        programmer.displayInfo();
        programmer.calculateSalary();
    }
}
