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

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CurrentAccount getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(CurrentAccount currentAccount) {
        this.currentAccount = currentAccount;
    }

    public SavingAccount getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }

    public static Customer addCustomer(){
        Customer customer = new Customer();
        Scanner sc = new Scanner(System.in);

        System.out.println(">> Enter the info customer");
        System.out.print("Enter the id: ");
        String id = sc.nextLine();

        System.out.print("Enter the name: ");
        String name = sc.nextLine();

        customer.setId(id);
        customer.setName(name);

        CurrentAccount currentAccount = CurrentAccount.create();
        customer.setCurrentAccount(currentAccount);

        SavingAccount savingAccount = SavingAccount.create();
        customer.setSavingAccount(savingAccount);

        return customer;
    }


}
