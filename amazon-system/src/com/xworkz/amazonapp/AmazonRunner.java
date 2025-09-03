package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.product.Product;

public class AmazonRunner {
    public static void main(String[] args) {

        Product product1 =new Product(1,"fan","home appliance",2000,"14-05-2024");

        Product product2 = new Product(2,"fridge","home appliance",30000.00,"25-04-2025");

        Product product3 = new Product(3,"table","home appliance",3000.00,"21-04-2025");
        Product product4 = new Product(4,"TV","home appliance",70000.00,"23-04-2025");
        Product product5 = new Product(5,"washing machine","home appliance",70000.00,"24-04-2025");
        Product product6 = new Product(6,"Cooker","home appliance",50000.00,"23-04-2025");
        Product product7 = new Product(7,"Mixer","home appliance",90000.00,"29-04-2025");
        Product product8 = new Product(8,"Grinder","home appliance",70000.00,"20-04-2025");
        Product product9 = new Product(9,"Oven","home appliance",20000.00,"25-01-2025");
        Product product10 = new Product(10,"Mobile","Electricals",30000.00,"25-03-2025");
        Product product11 = new Product(11,"Laptop"," Electricals",40000.00,"25-04-2023");
        Product product12 = new Product(12,"Chair","home appliance",50000.00,"25-08-2022");
        Product product13 = new Product(13,"Ear phones","Electricals",80000.00,"25-04-2025");
        Product product14= new Product(14,"watch","Electricals",90000.00,"27-02-2025");
        Product product15= new Product(15,"fridge","home appliance",30000.00,"25-04-2025");

            Amazon amazon = new Amazon();

        if (amazon.addProduct(product1) && amazon.addProduct(product2) && amazon.addProduct(product3) &&
                amazon.addProduct(product4) && amazon.addProduct(product5) && amazon.addProduct(product6) &&
                amazon.addProduct(product7) && amazon.addProduct(product8) && amazon.addProduct(product9) &&
                amazon.addProduct(product10) && amazon.addProduct(product11) && amazon.addProduct(product12) &&
                amazon.addProduct(product13) && amazon.addProduct(product14) && amazon.addProduct(product15)) {
            amazon.getAllProductInfo();
        }

        amazon.getAllProductInfo();



    }
}
