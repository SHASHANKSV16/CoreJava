package com.xworkz.amazonapp;

import com.sun.jmx.mbeanserver.NamedObject;
import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.constants.Type;
import com.xworkz.amazonapp.product.Product;

import java.util.Scanner;

public class AmazonRunner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of products to be added");
         int size = scanner.nextInt();
         Amazon amazon = new Amazon(size);
         System.out.println("the available products are : "+amazon.products.length);

         for (int index=0; index<size ; index++){
             Product product = new Product();
             System.out.println("Enter product Id :");
             product.setProductId(scanner.nextInt());

             System.out.println("Enter product name  :");
             product.setProductName(scanner.next());

             System.out.println("Enter type of product from these : ELECTRONICS,CLOTHING,GROCERY,FURNITURE,TOYS");
             product.setProductType(Type.valueOf(scanner.next().toUpperCase()));

             System.out.println("Enter the mfgDate :");
             product.setMfgDate(scanner.next());

             System.out.println("Enter the product price : ");
             product.setProductPrice(scanner.nextDouble());

             amazon.addProduct(product);
         }

        amazon.getAllProductInfo();

        System.out.println("want to get type of product by product name:yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter product name");
            System.out.println("the type of product is "+amazon.getProductTypeByProductName(scanner.next()));
        }
        System.out.println("want to get type of product by productID :yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter product ID");
            System.out.println("the type of product is "+amazon.getProductTypeByProductId(scanner.nextInt()));
        }
        System.out.println("want to get price of product  by product Name :yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter product Name");
            System.out.println("the type of product is "+amazon.getProductPriceByProductName(scanner.next()));
        }
        System.out.println("want to get price of product by product ID :yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter product ID");
            System.out.println("the type of product is "+amazon.getProductPriceByProductId(scanner.nextInt()));
        }
        System.out.println("want to get mfg date  of product by product ID :yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter product ID");
            System.out.println("the type of product is "+amazon.getMfgDateByProductId(scanner.nextInt()));
        }
        System.out.println("want to get mfg date  of product by product name :yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter product Name ");
            System.out.println("the type of product is "+amazon.getMfgDateByProductName(scanner.next()));
        }
        System.out.println("want to get product name by product ID :yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter product ID");
            System.out.println("the type of product is "+amazon.getProductNameByProductId(scanner.nextInt()));
        }
        System.out.println("want to get  productID by product name :yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter product Name ");
            System.out.println("the type of product is "+amazon.getProductIdByProductName(scanner.next()));
        }

        System.out.println("want to update name by product id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter product id");
            int productId= scanner.nextInt();
            System.out.println("enter new product Name");
            String productName = scanner.next();
            if(amazon.updateProductNameByProductId(productId,productName)) amazon.getAllProductInfo();
            else System.out.println("name not updated");
        }
        System.out.println("want to update type by product id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter product id");
            int productId= scanner.nextInt();
            System.out.println("Enter new type of product from these : ELECTRONICS,CLOTHING,GROCERY,FURNITURE,TOYS");
            Type productType = Type.valueOf(scanner.next().toUpperCase());
            if(amazon.updateProductTypeByProductId(productId,productType)) amazon.getAllProductInfo();
            else System.out.println("type not updated");
        }
        System.out.println("want to update price by product id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter product id");
            int productId= scanner.nextInt();
            System.out.println("enter new product price");
            double productPrice = scanner.nextDouble();
            if(amazon.updateProductPriceByProductId(productId,productPrice)) amazon.getAllProductInfo();
            else System.out.println("price not updated");
        }
        System.out.println("want to update mgf Date by product id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter product id");
            int productId= scanner.nextInt();
            System.out.println("enter new product Mfg Date");
            String mfgDate = scanner.next();
            if(amazon.updateMfgDateByProductId(productId,mfgDate)) amazon.getAllProductInfo();
            else System.out.println("MfgDate not updated");
        }

        System.out.println("want to get   product name by MFG DATE  :yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter MFGDate");
            String[] names = amazon.getProductNameByMfgDate(scanner.next());
            for (String name:names){
                System.out.println(name);
            }
        }












    }
}
