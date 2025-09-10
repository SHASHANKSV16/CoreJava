package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.constants.Type;
import com.xworkz.amazonapp.product.Product;
import lombok.NoArgsConstructor;

@NoArgsConstructor

public class Amazon {

    public Amazon(int size){
        products = new Product[size];
    }

    public Product[] products ;
    int index;

    public boolean addProduct(Product product) {
        boolean isProductAdded = false;

        if (product != null) {
            products[index++] = product;
            isProductAdded = true;
        } else System.out.println("invalid product");
        return isProductAdded;
    }
    public void getAllProductInfo() {
        System.out.println("the list of product are : ");
        for (Product product : products) {

            System.out.println("the id of the product is  " + product.getProductId());
            System.out.println("the name of the product is  " + product.getProductName());
            System.out.println("the type of the product is  " + product.getProductType());
            System.out.println("the price of the product is  " + product.getProductPrice());
            System.out.println("the mfg date of the product is  " + product.getMfgDate());
            System.out.println("------------------------------------------");

        }

    }

    public Type  getProductTypeByProductName(String productName){
            Type type= null;
             if(productName != null){
                 for(Product product:products){
                     if(product.getProductName().equals(productName)){
                         type = product.getProductType();
                     }
                 }
             }else System.out.println("enter valid name");
             if(type == null) System.out.println("name not found");

            return type;
        }
    public Type  getProductTypeByProductId(int productId){
        Type type= null;
        if(productId != 0){
            for(Product product:products){
                if(product.getProductId() == productId){
                    type = product.getProductType();
                }
            }
        }else System.out.println("enter valid ID");
        if(type == null) System.out.println("ID not found");

        return type;
}
    public double getProductPriceByProductName(String productName){
        double price = 0;
        if(productName != null){
            for(Product product : products){
                if(product.getProductName().equals(productName)){
                    price = product.getProductPrice();
                }
            }
        }else System.out.println("enter valid name");
        if(price == 0) System.out.println("name not found");
        return price;
    }
    public double getProductPriceByProductId(int productId){
        double price = 0;
        if(productId != 0){
            for(Product product : products){
                if(product.getProductId() == productId){
                    price = product.getProductPrice();
                }
            }
        }else System.out.println("enter valid ID");
        if(price == 0) System.out.println("ID not found");
        return price;
    }
    public String getMfgDateByProductName(String productName){
        String date = null;
        if(productName != null){
            for(Product product : products){
                if(product.getProductName().equals(productName)){
                    date = product.getMfgDate();
                }
            }
        }else System.out.println("enter valid name");
        if(date == null) System.out.println("name not found");
        return date;
    }
    public String getMfgDateByProductId(int productId){
            String date = null;
            if(productId != 0){
                for(Product product : products){
                    if(product.getProductId() == productId){
                        date = product.getMfgDate();
                    }
                }
            }else System.out.println("enter valid ID");
            if(date == null) System.out.println("ID not found");
            return date;
        }
    public String getProductNameByProductId(int productId){
        String name = null;
        if(productId != 0){
            for(Product product : products){
                if(product.getProductId() == productId){
                    name = product.getProductName();
                }
            }
        }else System.out.println("enter valid ID");
        if(name == null) System.out.println("ID not found");
        return name;
    }
    public int getProductIdByProductName(String productName){
        int id = 0;
        if(productName != null){
            for(Product product : products){
                if(product.getProductName().equals(productName)){
                    id = product.getProductId();
                }
            }
        }else System.out.println("enter valid name");
        if(id == 0) System.out.println("name not found");
        return id;
    }

    public boolean updateProductNameByProductId(int productId, String NewProductName ){
        boolean isUpdated = false;
            if(productId !=0 ){
                for(Product product :products){
                    if(product.getProductId() == productId){
                        product.setProductName(NewProductName);
                        isUpdated = true;
                    }
                }
            }else System.out.println("enter correct id");

        return isUpdated;
    }
    public boolean updateProductTypeByProductId(int productId, Type newProductType){
        boolean isUpdated = false;
        if(productId != 0){
            for(Product product : products){
                if(product.getProductId() == productId){
                    product.setProductType(newProductType);
                    isUpdated = true;
                }
            }
        }else System.out.println("enter correct id");
        return isUpdated;
    }
    public boolean updateProductPriceByProductId(int productId, double newProductPrice){
        boolean isUpdated = false;
        if(productId != 0){
            for(Product product : products){
                if(product.getProductId() == productId){
                    product.setProductPrice(newProductPrice);
                    isUpdated = true;
                }
            }
        }else System.out.println("enter correct id");
        return isUpdated;
    }
    public boolean updateMfgDateByProductId(int productId, String newMfgDate){
        boolean isUpdated = false;
        if(productId != 0){
            for(Product product : products){
                if(product.getProductId() == productId){
                    product.setMfgDate(newMfgDate);
                    isUpdated = true;
                }
            }
        }else System.out.println("enter correct id");
        return isUpdated;
    }




    public String[] getProductNameByMfgDate(String mfgDate){
        int indexs = 0;
        String[] names= new String[index];
        if(mfgDate != null){
            for(Product product : products){
                if(product.getMfgDate().equals(mfgDate)){


                        String name = product.getProductName();
                        names[indexs]=name;
                        indexs++;

                }
            }
        }
        return names;
    }

}
