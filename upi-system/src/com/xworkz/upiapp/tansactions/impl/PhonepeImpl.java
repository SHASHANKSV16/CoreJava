package com.xworkz.upiapp.tansactions.impl;

import com.xworkz.upiapp.tansactions.Transactions;

public class PhonepeImpl implements Transactions {
    @Override
    public void transferMoney() {
        System.out.println("money transferred");
    }

    @Override
    public void checkTransactionStatus() {
        System.out.println("status checked");
    }

    @Override
    public void cancelTransaction() {
        System.out.println("transaction cancelled");

    }
}
