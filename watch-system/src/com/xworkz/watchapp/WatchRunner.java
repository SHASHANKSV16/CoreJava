package com.xworkz.watchapp;

import com.xworkz.watchapp.constants.Warranty;
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

            System.out.println("Warranty from NO_WARRANTY,SIX_MONTHS,ONE_YEAR,TWO_YEARS :");
            watch.setWarranty(Warranty.valueOf(scanner.next().toUpperCase()));

            watchShop.addWatch(watch);
        }
        watchShop.getWatchDetails();


        System.out.println("want to get Model Name by Id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter watch Id");
            System.out.println("the Model Name is " + watchShop.getModelNameById(scanner.nextInt()));
        }
        System.out.println("want to get Company Name by Id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter watch Id");
            System.out.println("the Company Name is " + watchShop.getCompanyNameById(scanner.nextInt()));
        }
        System.out.println("want to get Price by Id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter watch Id");
            System.out.println("the Price is " + watchShop.getPriceById(scanner.nextInt()));
        }
        System.out.println("want to get Warranty by Id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter watch Id");
            System.out.println("the Warranty is " + watchShop.getWarrantyById(scanner.nextInt()));
        }
        System.out.println("want to get Id by Model Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter watch Model Name");
            System.out.println("the Id is " + watchShop.getIdByModelName(scanner.next()));
        }
        System.out.println("want to get Company Name by Model Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter watch Model Name");
            System.out.println("the Company Name is " + watchShop.getCompanyNameByModelName(scanner.next()));
        }
        System.out.println("want to get Price by Model Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter watch Model Name");
            System.out.println("the Price is " + watchShop.getPriceByModelName(scanner.next()));
        }
        System.out.println("want to get Warranty by Model Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter watch Model Name");
            System.out.println("the Warranty is " + watchShop.getWarrantyByModelName(scanner.next()));
        }

        System.out.println("want to update Model Name by Id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter watch Id");
            int id = scanner.nextInt();
            System.out.println("enter new Model Name");
            String newModelName = scanner.next();
            if(watchShop.updateModelNameById(id, newModelName))
                watchShop.getWatchDetails();
            else
                System.out.println("Model Name not updated");
        }
        System.out.println("want to update Company Name by Id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter watch Id");
            int id = scanner.nextInt();
            System.out.println("enter new Company Name");
            String newCompanyName = scanner.next();
            if(watchShop.updateCompanyNameById(id, newCompanyName))
                watchShop.getWatchDetails();
            else
                System.out.println("Company Name not updated");
        }
        System.out.println("want to update Price by Id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter watch Id");
            int id = scanner.nextInt();
            System.out.println("enter new Price");
            double newPrice = scanner.nextDouble();
            if(watchShop.updatePriceById(id, newPrice))
                watchShop.getWatchDetails();
            else
                System.out.println("Price not updated");
        }
        System.out.println("want to update Warranty by Id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter watch Id");
            int id = scanner.nextInt();
            System.out.println("enter new Warranty from NO_WARRANTY, SIX_MONTHS, ONE_YEAR, TWO_YEARS, THREE_YEARS");
            Warranty newWarranty = Warranty.valueOf(scanner.next().toUpperCase());
            if(watchShop.updateWarrantyById(id, newWarranty))
                watchShop.getWatchDetails();
            else
                System.out.println("Warranty not updated");
        }

    }
}
