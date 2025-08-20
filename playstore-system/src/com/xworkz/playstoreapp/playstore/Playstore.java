package com.xworkz.playstoreapp.playstore;

import com.xworkz.playstoreapp.user.User;
import com.xworkz.playstoreapp.validator.UserValidator;


public class Playstore {

    User user;

    public boolean addUser( User user){
        boolean isAdded = false;
        UserValidator userValidator = new UserValidator();

        boolean isValid =userValidator.validator(user);
        if(isValid) {
            isAdded = true;
            this.user = user;
        }
        else{
            System.out.println("user not added");}

        return isAdded;
    }
    public void userDetails(){

        System.out.println("ID is " +user.getUserId());
        System.out.println("the name is "+ user.getFirstName());
        System.out.println("the last name is "+ user.getLastName());
        System.out.println("gender : "+user.getGender());
        System.out.println("dob: "+user.getDob());
        System.out.println("age : "+ user.getAge());
        System.out.println("number : "+ user.getContactNumber());
        System.out.println("email:" + user.getEmail());
        System.out.println("address "+ user.getAddres() );
        System.out.println("city : "+ user.getCity());
        System.out.println("State :"+ user.getState());
        System.out.println(user.getCountry());
        System.out.println(user.getPincode());
        System.out.println(user.getPwd());
        System.out.println(user.getCPwd());
    }
}
