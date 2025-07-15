class SnaccRunner{


 public static void main(String[] food){
 
 String foodName = "nuts sundae";
 double foodCost = Snacc.getFoodCost(foodName);
 if(foodCost > 0.0)
 System.out.println("the price of  " +foodName+ " is " + foodCost );
 
 int quantity = 3;
 foodCost = Snacc.getFoodCost(foodName , quantity);
 if(foodCost > 0.0)
 System.out.println("the price of  " +foodName+ " for "+quantity+" is " + foodCost );
 
 
 }

}