package com.xworkz.watchapp;

import com.xworkz.watchapp.watch.Watch;
import com.xworkz.watchapp.watchshop.WatchShop;

import java.util.Scanner;

public class WatchRunner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of watch to be add");
        int size = scanner.nextInt();
        WatchShop watchShop= new WatchShop(size);
        System.out.println("watch Available are :"+watchShop.watches.length);

        for (int index=0; index<size ; index++){

            Watch watch = new Watch();

            System.out.println("Enter  id :");
            watch.setId(scanner.nextInt());

            System.out.println("Enter company name :");
            watch.setCompanyName(scanner.next());

            System.out.println("Enter model Name :");
            watch.setModelName(scanner.next());

            System.out.println("price :");
            watch.setPrice(scanner.nextDouble());

            System.out.println("Warrenty :");
            watch.setWarrenty(scanner.next());

            watchShop.addWatch(watch);
        }
        watchShop.getWatchDetails();
    }
}
