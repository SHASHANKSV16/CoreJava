package com.xworkz.shopingmall;

import com.xworkz.shopingmall.constants.Type;
import com.xworkz.shopingmall.shop.Shop;
import com.xworkz.shopingmall.shopingmall.ShopingMall;


import java.util.Scanner;

public class ShopingMallRunner {
    public static void main(String[] args) {



        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter no of shop to be add :");
        int size = scanner.nextInt();
        
        ShopingMall shopingMall = new ShopingMall(size);
        System.out.println("no of shop available are :"+shopingMall.shops.length);

        for (int index=0; index<size ; index++){

            Shop shop = new Shop();

            System.out.println("Enter shop Id :");
            shop.setShopId(scanner.nextInt());

            System.out.println("ShopName :");
            shop.setName(scanner.next());

            System.out.println("Enter shopType  from these :     GROCERY,CLOTHING,LECTRONICS,OODCOURT,HARMACY");
            shop.setShopType(Type.valueOf(scanner.next().toUpperCase()));

            System.out.println("Enter floor :");
            shop.setWhichFloor(scanner.nextInt());

            System.out.println("Enter address :");
            shop.setAddress(scanner.next());

            shopingMall.addShop(shop);
        }
        shopingMall.getShopDetails();


        System.out.println("want to get Name by shop Id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter shop Id");
            System.out.println("the Name is " + shopingMall.getNameByShopId(scanner.nextInt()));
        }
        System.out.println("want to get ShopType by shop Id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter shop Id");
            System.out.println("the ShopType is " + shopingMall.getShopTypeByShopId(scanner.nextInt()));
        }
        System.out.println("want to get Floor by shop Id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter shop Id");
            System.out.println("the Floor is " + shopingMall.getFloorByShopId(scanner.nextInt()));
        }
        System.out.println("want to get Address by shop Id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter shop Id");
            System.out.println("the Address is " + shopingMall.getAddressByShopId(scanner.nextInt()));
        }
        System.out.println("want to get Id by shop Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter shop Name");
            System.out.println("the Id is " + shopingMall.getIdByShopName(scanner.next()));
        }
        System.out.println("want to get ShopType by shop Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter shop Name");
            System.out.println("the ShopType is " + shopingMall.getShopTypeByShopName(scanner.next()));
        }
        System.out.println("want to get Floor by shop Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter shop Name");
            System.out.println("the Floor is " + shopingMall.getFloorByShopName(scanner.next()));
        }
        System.out.println("want to get Address by shop Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter shop Name");
            System.out.println("the Address is " + shopingMall.getAddressByShopName(scanner.next()));
        }

        System.out.println("want to update Name by shop Id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter shop Id");
            int shopId = scanner.nextInt();
            System.out.println("enter new Name");
            String newName = scanner.next();
            if(shopingMall.updateNameByShopId(shopId, newName))
                shopingMall.getShopDetails();
            else
                System.out.println("Name not updated");
        }
        System.out.println("want to update ShopType by shop Id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter shop Id");
            int shopId = scanner.nextInt();
            System.out.println("enter new ShopType from     GROCERY,CLOTHING,ELECTRONICS,FOODCOURT,PHARMACY");
            Type newType = Type.valueOf(scanner.next().toUpperCase());
            if(shopingMall.updateShopTypeByShopId(shopId, newType))
                shopingMall.getShopDetails();
            else
                System.out.println("ShopType not updated");
        }
        System.out.println("want to update Floor by shop Id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter shop Id");
            int shopId = scanner.nextInt();
            System.out.println("enter new Floor");
            int newFloor = scanner.nextInt();
            if(shopingMall.updateFloorByShopId(shopId, newFloor))
                shopingMall.getShopDetails();
            else
                System.out.println("Floor not updated");
        }
        System.out.println("want to update Address by shop Id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter shop Id");
            int shopId = scanner.nextInt();
            System.out.println("enter new Address");
            String newAddress = scanner.next();
            if(shopingMall.updateAddressByShopId(shopId, newAddress))
                shopingMall.getShopDetails();
            else
                System.out.println("Address not updated");
        }


    }
}
