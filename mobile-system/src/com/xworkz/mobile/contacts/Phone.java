package com.xworkz.mobile.contacts;

public interface Phone {
    void makeCall(long number);
    void receiveCall(String callerName);
    void sendMessage(long number, String message);
}
