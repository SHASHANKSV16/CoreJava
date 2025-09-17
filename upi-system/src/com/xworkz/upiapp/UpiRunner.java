package com.xworkz.upiapp;

import com.xworkz.upiapp.tansactions.Transactions;
import com.xworkz.upiapp.tansactions.impl.PhonepeImpl;

public class UpiRunner {
    public static void main(String[] args) {
        Transactions phonePe = new PhonepeImpl();
        phonePe.transferMoney();
        phonePe.cancelTransaction();
        phonePe.checkTransactionStatus();
    }
}
