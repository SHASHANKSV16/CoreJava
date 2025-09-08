package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.product.Product;

import java.util.Scanner;

public class AmazonRunner {
    public static void main(String[] args) {





        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of products to be add");
         int size = scanner.nextInt();
         Amazon amazon = new Amazon(size);
         System.out.println("the available products are : "+amazon.products.length);

         for (int index=0; index<size ; index++){
             Product product = new Product();
             System.out.println("Enter product Id :");
             product.setProductId(scanner.nextInt());

             System.out.println("Enter product name  :");
             product.setProductName(scanner.next());

             System.out.println("Enter type of product");
             product.setProductType(scanner.next());

             System.out.println("Enter the mfgDate :");
             product.setMfgDate(scanner.next());

             System.out.println("Enter the product price : ");
             product.setProductPrice(scanner.nextDouble());

             amazon.addProduct(product);
         }

        amazon.getAllProductInfo();



    }
}
