package vn.edu.likelion.ex1;

public class Main {
    public static void main(String[] args) {
        Customer customer = Customer.addCustomer();

        System.out.println("--------------------------*------------------------------");

        customer.getCurrentAccount().viewBalance();
        customer.getSavingAccount().viewBalance();

        System.out.println("--------------------------*------------------------------");

        customer.getCurrentAccount().send();
        customer.getSavingAccount().send();

        System.out.println("--------------------------*------------------------------");

        customer.getCurrentAccount().viewBalance();
        customer.getSavingAccount().viewBalance();

        System.out.println("--------------------------*------------------------------");

        customer.getCurrentAccount().withdraw();
        customer.getSavingAccount().withdraw();

        customer.getCurrentAccount().viewBalance();
        customer.getSavingAccount().viewBalance();

        System.out.println("--------------------------*------------------------------");

        customer.getSavingAccount().calculateInterest();
    }
}
