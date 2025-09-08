package com.xworkz.shopingmall;

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

            System.out.println("Enter shopType :");
            shop.setShopType(scanner.next());

            System.out.println("Enter floor :");
            shop.setWhichFloor(scanner.nextInt());

            System.out.println("Enter address :");
            shop.setAddress(scanner.next());

            shopingMall.addShop(shop);
        }
        shopingMall.getShopDetails();
    }
}
