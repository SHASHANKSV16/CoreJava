package com.xworkz.walletapp.operations.impl;

import com.xworkz.walletapp.operations.Operations;

public class GpayImpl implements Operations {

    @Override
    public void addMoney() {
        System.out.println("money added");

    }

    @Override
    public void payMoney() {
        System.out.println("money payed");
    }

    @Override
    public void checkBalance() {
        System.out.println("baance checked");
    }
}
