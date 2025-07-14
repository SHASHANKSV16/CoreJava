class EatSureRunner{


 public static void main(String[] food){
 
 String foodName = "imli chutney";
 double foodCost = EatSure.getFoodCost(foodName);
 if(foodCost > 0.0)
 System.out.println("the price of  " +foodName+ " is " + foodCost );
 
 
 }

}