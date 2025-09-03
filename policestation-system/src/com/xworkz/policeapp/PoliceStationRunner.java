package com.xworkz.policeapp;

import com.xworkz.policeapp.police.Police;
import com.xworkz.policeapp.policestation.PoliceStation;

public class PoliceStationRunner {
    public static void main(String[] args) {
        Police police1=new Police(101,"Constable","Suresh",15000.00,5);
        Police police2=new Police(102,"Head Constable","Ramesh",20000.00,7);
        Police police3=new Police(103,"Sub-Inspector","Anita",30000.00,10);
        Police police4=new Police(104,"Inspector","Prakash",40000.00,12);
        Police police5=new Police(105,"Assistant Commissioner","Deepak",55000.00,15);
        Police police6=new Police(106,"Commissioner","Lakshmi",75000.00,20);




        PoliceStation policeStation=new PoliceStation();

        if(policeStation.addPolice(police1)&&policeStation.addPolice(police2)&&policeStation.addPolice(police3)&&
                policeStation.addPolice(police4)&&policeStation.addPolice(police5)&&policeStation.addPolice(police6)){
            policeStation.getAllPoliceDetails();
        }


    }
}
