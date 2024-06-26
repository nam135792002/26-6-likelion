package vn.edu.likelion.ex1;

import java.math.BigDecimal;
import java.util.Scanner;

public class CurrentAccount implements Account{

    private BigDecimal deposit;
    private BigDecimal overdraft;

    private static Scanner sc = new Scanner(System.in);

    public CurrentAccount() {
        this.deposit = BigDecimal.valueOf(0);
        this.overdraft = BigDecimal.valueOf(0);
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = this.deposit.add(deposit);
    }

    public void setOverdraft(BigDecimal overdraft) {
        this.overdraft = this.overdraft.add(overdraft);
    }

    @Override
    public void send() {
        System.out.print("Enter the money which you want to send into current account: ");
        BigDecimal money = sc.nextBigDecimal();
        this.deposit = this.deposit.add(money);

        System.out.println("You sent " + money + "$ successfully");
    }

    @Override
    public void withdraw() {
        System.out.print("Enter the money which you want to withdraw out current account: ");
        BigDecimal money = sc.nextBigDecimal();
        if(this.overdraft.compareTo(money) < 0){
            System.out.println("You withdraw over too overdraft!");
        }
        else if(this.deposit.compareTo(money) < 0){
            System.out.println("Not enough to withdraw. Your balance < " + money);
        }else{
            this.deposit = this.deposit.subtract(money);
            System.out.println("You withdraw successfully!");
        }
    }

    @Override
    public void calculateInterest() {

    }

    @Override
    public void viewBalance() {
        System.out.println("Balance of Current Account: " + this.deposit);
    }

    public static CurrentAccount create() {
        CurrentAccount currentAccount = new CurrentAccount();
        System.out.println(">> Enter info current account.");
        System.out.print("Enter the deposit: ");
        BigDecimal deposit = sc.nextBigDecimal();

        System.out.print("Enter the overdraft limit: ");
        BigDecimal overdraft = sc.nextBigDecimal();

        currentAccount.setDeposit(deposit);
        currentAccount.setOverdraft(overdraft);
        return currentAccount;
    }
}
