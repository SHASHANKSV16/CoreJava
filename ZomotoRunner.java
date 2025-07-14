class ZomotoRunner{


 public static void main(String[] food){
 
 String foodName = "grill chicken";
 double foodCost = Zomoto.getFoodCost(foodName);
 if(foodCost > 0.0)
 System.out.println("the price of  " +foodName+ " is " + foodCost );
 
 
 }

}