class SwiggyRunner{


 public static void main(String[] food){
 
 String foodName = "panner guchhi";
 double foodCost = Swiggy.getFoodCost(foodName);
 if(foodCost > 0)
 System.out.println("the price of  " +foodName+ " is " + foodCost);
 
 
 }

}