package com.xworkz.walletapp;

import com.xworkz.walletapp.operations.Operations;
import com.xworkz.walletapp.operations.impl.GpayImpl;

import javax.crypto.spec.OAEPParameterSpec;

public class WalletRunner {
    public static void main(String[] args) {
        Operations gPay = new GpayImpl();
        gPay.addMoney();
        gPay.payMoney();
        gPay.checkBalance();
    }
}
