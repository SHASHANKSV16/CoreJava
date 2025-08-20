package com.xworkz.amusementpark;

import com.xworkz.amusementpark.park.AmusementPark;

public class AmusementParkRunner {
    static int parkId ;
   static  String parkName;
    static String parkPlace ;
   static  String type;
   static  double price;
   public static void main(String[] park) {
        AmusementPark park1 = new AmusementPark();
       park1.setParkName("wonderla");
       park1.setparkId(1);
       park1.setParkPlace("banglore");
       park1.setType("water");
       park1.setPrice(1999.9);

        parkId = park1.getParkId();
        parkName = park1.getParkName();
       parkPlace = park1.getParkPlace();
        type = park1.getType();
       price = park1.getPrice();
       AmusementParkRunner.getData();





        AmusementPark park2 = new AmusementPark();
        park2.setParkName("imagica");
        park2.setparkId(2);
        park2.setParkPlace("banglore");
        park2.setType("fun");
        park2.setPrice(1562.9);

         parkId = park2.getParkId();
        parkName = park2.getParkName();
         parkPlace = park2.getParkPlace();
        type = park2.getType();
         price = park2.getPrice();
       AmusementParkRunner.getData();


    }



    public static  void getData() {
        System.out.println("The park id is " + parkId);
        System.out.println("The park name is " + parkName);
        System.out.println("The park place is " + parkPlace);
        System.out.println("The type is " + type);
        System.out.println("The price is " + price);
        System.out.println();
    }
}

