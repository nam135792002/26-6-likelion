package vn.edu.likelion.ex1;

import java.math.BigDecimal;
import java.util.Scanner;

public class SavingAccount implements Account{

    private BigDecimal deposit;
    private double interest;
    private static Scanner sc = new Scanner(System.in);

    public SavingAccount(){
        this.deposit = BigDecimal.valueOf(0);
        this.interest = 0.0;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = this.deposit.add(deposit);
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public static SavingAccount create() {
        SavingAccount savingAccount = new SavingAccount();
        System.out.println(">> Enter info saving account.");

        System.out.print("Enter the deposit: ");
        BigDecimal deposit = sc.nextBigDecimal();
        savingAccount.setDeposit(deposit);

        System.out.print("Enter the interest rate: ");
        double interest = sc.nextDouble();
        savingAccount.setInterest(interest);
        return savingAccount;
    }

    @Override
    public void send() {
        System.out.print("Enter the money which you want to send into saving account: ");
        BigDecimal money = sc.nextBigDecimal();
        this.deposit = this.deposit.add(money);

        System.out.println("You sent " + money + "$ successfully");
    }

    @Override
    public void withdraw() {
        System.out.print("Enter the money which you want to withdraw out saving account: ");
        BigDecimal money = sc.nextBigDecimal();
        if(this.deposit.compareTo(money) < 0){
            System.out.println("Not enough to withdraw. Your balance < " + money);
        }else{
            this.deposit = this.deposit.subtract(money);
            System.out.println("You withdraw successfully!");
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("After applying interest on Savings Account for 1 year:");
        BigDecimal interest = this.deposit.multiply (BigDecimal.valueOf(1 + (this.interest) / 100));
        System.out.println("Your interest after one year: " + interest);
    }

    @Override
    public void viewBalance() {
        System.out.println("Balance of Saving Account: " + this.deposit);
    }
}
