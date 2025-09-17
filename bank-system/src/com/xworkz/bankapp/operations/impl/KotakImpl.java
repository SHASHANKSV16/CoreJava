package com.xworkz.bankapp.operations.impl;

import com.xworkz.bankapp.operations.BankOperations;

public class KotakImpl implements BankOperations {

    @Override
    public void withdrawCash(double amount) {
        System.out.println("withdrawed the amount of " + amount);
    }

    @Override
    public void depositCash(double amount) {
        System.out.println("deposited the amount of " + amount);

    }

    @Override
    public void checkBalance() {
        System.out.println("balance is checked");

    }
}
