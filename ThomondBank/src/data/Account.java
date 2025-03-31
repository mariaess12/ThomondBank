package data;

import java.security.PublicKey;
import java.time.LocalDate;

abstract class Account {
private int id;
private int custNo;
double balance =0;
private LocalDate dateCreated;
private static double AIR;

public Account(int id, int custNo, double balance, LocalDate dateCreated, double AIR) {
    this.id = id;
    this.custNo = custNo;
    this.balance = balance;
    this.dateCreated = dateCreated;
    Account.AIR = AIR;
}

    public static double getAIR() {
        return AIR;
    }

    public static void setAIR(double AIR) {
        Account.AIR = AIR;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustNo() {
        return custNo;
    }

    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);


    @Override
    public String toString() {
        return String.format("Id: %d Customer No: %d Balance: %.2f", id, custNo, balance);
    }
}
