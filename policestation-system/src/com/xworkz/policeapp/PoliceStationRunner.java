package com.xworkz.policeapp;

import com.xworkz.policeapp.police.Police;
import com.xworkz.policeapp.policestation.PoliceStation;

import java.util.Scanner;

public class PoliceStationRunner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of police to be add :");
        int size = scanner.nextInt();

        PoliceStation policeStation = new PoliceStation(size);
        System.out.println("Enter no of polices are available :"+policeStation.polices.length);

        for (int index=0; index<size ; index++){
            Police police = new Police();

            System.out.println("Enter police Id :");
            police.setPoliceId(scanner.nextInt());

            System.out.println("Enter police name");
            police.setName(scanner.next());

            System.out.println("Enter type of post :");
            police.setTypeOfPost(scanner.next());

            System.out.println("Enter salary :");
            police.setSalary(scanner.nextDouble());

            System.out.println("Enter Experience");
            police.setExperience(scanner.nextInt());

            policeStation.addPolice(police);
        }

        policeStation.getAllPoliceDetails();
    }
}
