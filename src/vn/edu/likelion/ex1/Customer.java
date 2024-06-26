package vn.edu.likelion.ex1;

import java.util.Scanner;

public class Customer {
    private String id;
    private String name;
    private CurrentAccount currentAccount;
    private SavingAccount savingAccount;

    public Customer(){
        this.currentAccount = new CurrentAccount();
        this.savingAccount = new SavingAccount();
    }

    public CurrentAccount getCurrentAccount() {
        return currentAccount;
    }

    public SavingAccount getSavingAccount() {
        return savingAccount;
    }

    public void addCustomer(){
        Scanner sc = new Scanner(System.in);

        System.out.println(">> Enter the info customer");
        System.out.print("Enter the id: ");
        String id = sc.nextLine();

        System.out.print("Enter the name: ");
        String name = sc.nextLine();

        this.id = id;
        this.name = name;
        this.currentAccount.create();
        this.savingAccount.create();
    }


}
