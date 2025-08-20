package com.xworkz.playstoreapp.user;

public class User {
    private int userId;
    private String firstName;
    private String lastName;
    private String gender;
    private String dob;
    private int age;
    private Long contactNumber;
    private String email;
    private String addres;
    private String city;
    private String state;
    private String country;
    private long pincode;
    private String pwd;
    private String CPwd;

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getAddres() {
        return addres;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Long getContactNumber() {
        return contactNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public long getPincode() {
        return pincode;
    }

    public void setCPwd(String CPwd) {
        this.CPwd = CPwd;
    }

    public String getCPwd() {
        return CPwd;
    }

}
