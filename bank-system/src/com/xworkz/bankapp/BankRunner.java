package com.xworkz.bankapp;

import com.xworkz.bankapp.operations.BankOperations;
import com.xworkz.bankapp.operations.impl.KotakImpl;

public class BankRunner {
    public static void main(String[] args) {
        BankOperations kotak = new KotakImpl();
        kotak.depositCash(500);
        kotak.withdrawCash(200);
        kotak.checkBalance();
    }
}
