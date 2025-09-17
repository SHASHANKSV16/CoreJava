package com.xworkz.bankapp.operations;

public interface BankOperations {
    void withdrawCash(double amount);
    void depositCash(double amount);
    void checkBalance();
}
