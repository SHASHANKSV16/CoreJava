package com.xworkz.playstoreapp.validator;

import com.xworkz.playstoreapp.user.User;

public class UserValidator {


    public boolean validator(User user){
        boolean isValid = false;
        boolean isIdValid = false;
        boolean isNameValid = false;
        boolean isLastNameValid = false;
        boolean isGenderValid = false;
        boolean isDobValid = false;
        boolean isAgeValid = false;
        boolean isContactValid = false;
        boolean isEmailValid = false;
        boolean isAddressValid = false;
        boolean isCityValid = false;
        boolean isStateValid = false;
        boolean isCountryValid = false;
        boolean isPincodeValid = false;
        boolean isPwdValid = false;
        boolean isCPwdValid = false;


        if(user.getUserId() !=0)
            isIdValid = true;
        else
            System.out.println("enter id corretly");
        if(user.getFirstName() != null && !user.getFirstName().isEmpty() && user.getFirstName() != "null")
            isNameValid=true;
        else
            System.out.println("enter name correctly");
        if(user.getLastName() != null && !user.getLastName().isEmpty() && user.getLastName() != "null")
            isLastNameValid = true;
        else
            System.out.println("enter last name properly");
        if(user.getGender() != null && !user.getGender().isEmpty()&& user.getGender() != "null")
            isGenderValid = true;
        else
            System.out.println("enter gender correctly");
        if(user.getDob() != null && !user.getDob().isEmpty() && user.getDob() != "null")
            isDobValid = true;
        else
            System.out.println("enter dob correctly");
        if(user.getAge() != 0)
            isAgeValid = true;
        else
            System.out.println("enter age correctly");
        if(user.getContactNumber() != 0 )
            isContactValid = true;
        else
            System.out.println("enter number correctly");
        if(user.getEmail() != null && !user.getEmail().isEmpty()&& user.getEmail() != "null")
            isEmailValid = true;
        else
            System.out.println("enter emailID correctly" );
        if(user.getAddres() != null && !user.getAddres().isEmpty() && user.getAddres() != "null")
            isAddressValid = true;
        else
            System.out.println("enter address properly");
        if(user.getCity() != null && !user.getCity().isEmpty() && user.getCity() != "null")
            isCityValid = true;
        else
            System.out.println("enter city correctly");
        if(user.getCountry()!= null && !user.getCountry().isEmpty() && user.getCountry() != "null")
            isCountryValid = true;
        else
            System.out.println("enter country properly");
        if(user.getState()!=null && !user.getState().isEmpty())
            isStateValid = true;
        else
            System.out.println("enter state properly");
        if(user.getPincode()!=0)
            isPincodeValid = true;
        else
            System.out.println("enter pincode correctly");
        if(user.getPwd()!=null && !user.getPwd().isEmpty() && user.getPwd() != "null")
            isPwdValid = true;
        else
            System.out.println("enter password");
        if(user.getCPwd() == user.getPwd())
            isCPwdValid = true;
        else
            System.out.println("password doesn't match");

        if(isIdValid && isNameValid && isLastNameValid &&isGenderValid &&isDobValid &&isAgeValid &&isContactValid &&isEmailValid &&isAddressValid &&isCityValid &&isStateValid &&isCountryValid &&isPincodeValid &&isPwdValid && isCPwdValid )
            isValid = true;
        else
            System.out.println("not validated");


        return  isValid;
    }
}
