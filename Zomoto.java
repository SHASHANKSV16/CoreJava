class Zomoto {
    public static double getFoodCost(String foodName){
        double foodCost = 0;

        if(foodName == "Chicken kebab")
            foodCost = 260.00;
        else if(foodName == "Chicken biryani")
            foodCost = 120.89;
        else if(foodName == "shawarma")
            foodCost = 60.00;
        else if(foodName == "grill chicken")
            foodCost = 80.00;
        else if(foodName == "alfaham chicken")
            foodCost = 190.00;
        else if(foodName == "mutton brain dry fry")
            foodCost = 139.99;
        else if(foodName == "popcorn chicken")
            foodCost = 80.99;
        else if(foodName == "chicken machurian")
            foodCost = 250.00;
        else if(foodName == " pepper chickem")
            foodCost = 297.99;
        else if(foodName == "mutton pepper")
            foodCost = 120.00;
        else if(foodName == "mutton raan")
            foodCost = 135.99;
        else if(foodName == "egg burji")
            foodCost = 214.99;
        else if(foodName == "kalmi kabab")
            foodCost = 160.00;
        else if(foodName == "murg tikka")
            foodCost = 140.00;
        else if(foodName == "chicken wings")
            foodCost = 89.99;
        else if(foodName == "fish fillet")
            foodCost = 89.99;
        else if(foodName == "fish tawa fry")
            foodCost = 79.99;
        else if(foodName == "chilly prawns")
            foodCost = 99.99;
        else if(foodName == "butter chicken")
            foodCost = 260.00;
        else if(foodName == "chicken machurian")
            foodCost = 229.99;
        else if(foodName == "chicken varaval")
            foodCost = 235.00;
        else if(foodName == "chicken kurma")
            foodCost = 250.00;
        else if(foodName == "mutton varaval")
            foodCost = 249.99;
        else if(foodName == " hyderabadi chicken")
            foodCost = 249.99;
        else if(foodName == "mutton kurma")
            foodCost = 267.00;
        else if(foodName == "egg parota")
            foodCost = 260.99;
        else if(foodName == "egg masala")
            foodCost = 249.99;
        else if(foodName == "bolied eggs")
            foodCost = 249.99;
        else if(foodName == "coraiander soup")
            foodCost = 226.99;
        else if(foodName == "mutton soup")
            foodCost = 257.99; 
        else System.out.println("food not found");

        return foodCost;
    }
}
