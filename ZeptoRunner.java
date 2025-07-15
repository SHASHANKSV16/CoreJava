class ZeptoRunner{


 public static void main(String[] food){
 
 String itemName = "mixed berry cooler";
 double itemCost = Zepto.getItemCost(itemName);
 if(itemCost > 0.0)
 System.out.println("the price of  " +itemName+ " is " + itemCost );

 int quantity = 2;
 itemCost = Zepto.getItemCost(itemName, quantity );
 if(itemCost > 0.0)
 System.out.println("the price of  " +itemName+ " for  "+ quantity+" is "+ itemCost );


 
 
 }

}