package com.xworkz.amusementpark.park;

public class AmusementPark {

    private int parkId;

    public void setparkId(int parkId){
        this.parkId= parkId;
    }

    public int getParkId(){
        return parkId;
    }

    private String parkName;

    public void setParkName(String parkName){
        this.parkName= parkName;
    }

    public String getParkName() {
        return parkName;
    }

    private String parkPlace;
    public void setParkPlace(String parkPlace){
        this.parkPlace= parkPlace;
    }

    public String getParkPlace() {
        return parkPlace;
    }

    private String type;
    public void setType(String type){
        this.type= type;
    }

    public String getType() {
        return type;
    }

    private Double price;
    public void setPrice(Double price){
        this.price= price;
    }
    public double getPrice(){
        return price;
    }


//    AmusementPark(int parkId, String parkName, String parkPlace, String type, double price) {
//        System.out.println("Parameterized constructor is invoked");
//        this.parkId = parkId;
//        this.parkName = parkName;
//        this.parkPlace = parkPlace;
//        this.type = type;
//        this.price = price;
//    }
   public  AmusementPark(){

    }


//    public void getData() {
//        System.out.println("The park id is " + parkId);
//        System.out.println("The park name is " + parkName);
//        System.out.println("The park place is " + parkPlace);
//        System.out.println("The type is " + type);
//        System.out.println("The price is " + price);
//        System.out.println();
//    }
}
