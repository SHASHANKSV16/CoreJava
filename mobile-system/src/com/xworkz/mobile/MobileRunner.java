package com.xworkz.mobile;

import com.xworkz.mobile.contacts.Phone;
import com.xworkz.mobile.contacts.impl.Apple;

public class MobileRunner {
    public static void main(String[] args) {
        Phone phone1 = new Apple();
        phone1.makeCall(9874561235l);
        phone1.receiveCall("Friend");
        phone1.sendMessage(9874561235l,"hi how are you");
    }
}
