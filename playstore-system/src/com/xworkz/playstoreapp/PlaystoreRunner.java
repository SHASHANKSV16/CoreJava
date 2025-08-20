package com.xworkz.playstoreapp;

import com.xworkz.playstoreapp.playstore.Playstore;
import com.xworkz.playstoreapp.user.User;

public class PlaystoreRunner {

    public static void main(String[] args) {
        User user= new User();
        user.setUserId(1);
        user.setFirstName("Shashank");
        user.setLastName("null");
        user.setGender("male");
        user.setDob("16/07/2003");
        user.setAddres("#40 , 7th croos nandini layout");
        user.setAge(21);
        user.setContactNumber(7894561235l);
        user.setEmail("svsshashank16@gmail.com");
        user.setCity("bengaluru");
        user.setState("Karanataka");
        user.setCountry("India");
        user.setPincode(560096l);
        user.setPwd("123456");
        user.setCPwd("123456");

        Playstore playstore = new Playstore();
        boolean isAdded =  playstore.addUser(user);
        if(isAdded)
            playstore.userDetails();


    }
}
