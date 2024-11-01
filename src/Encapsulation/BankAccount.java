package Encapsulation;

public class BankAccount {
    private String name;
    private double balance =0;

    public BankAccount(String name) {
        this.name = name;
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
    }

    public void withdrawl(double withdrawlAmount) {
        balance -= withdrawlAmount;
    }

    public String getAccName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

}
