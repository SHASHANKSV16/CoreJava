package com.xworkz.mobile.contacts.impl;

import com.xworkz.mobile.contacts.Phone;

public class Apple implements Phone {
    @Override
    public void makeCall(long number) {
        System.out.println("contacting to " +number+"from iphone");
    }

    @Override
    public void receiveCall(String callerName) {
        System.out.println("reciving call from " +callerName+"to iphone");

    }

    @Override
    public void sendMessage(long number, String message) {
        System.out.println("sending meassage to" + number + " of message "+ message );

    }
}
