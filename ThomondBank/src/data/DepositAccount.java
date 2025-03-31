package data;

import java.time.LocalDate;

public class DepositAccount extends Account {

    public DepositAccount(int id, int custNo, double balance, LocalDate dateCreated, double AIR) {
        super(id, custNo, balance, dateCreated, AIR);
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("try again");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }
}

