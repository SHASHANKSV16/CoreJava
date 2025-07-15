class Zomoto {
    public static double getFoodCost(String foodName){
        double foodCost = 0;

        if(foodName == "Chicken kebab"){
            foodCost = 260.00;
		return foodCost;
		}
        else if(foodName == "Chicken biryani"){
            foodCost = 120.89;
			return foodCost;
		}
        else if(foodName == "shawarma"){
            foodCost = 60.00;
			return foodCost;
		}
        else if(foodName == "grill chicken"){
            foodCost = 80.00;
			return foodCost;
		}
        else if(foodName == "alfaham chicken"){
            foodCost = 190.00;
			return foodCost;
		}
        else if(foodName == "mutton brain dry fry"){
            foodCost = 139.99;
			return foodCost;
		}
        else if(foodName == "popcorn chicken"){
            foodCost = 80.99;
			return foodCost;
		}
        else if(foodName == "chicken machurian"){
            foodCost = 250.00;
			return foodCost;
		}
        else if(foodName == " pepper chickem"){
            foodCost = 297.99;
			return foodCost;
		}
        else if(foodName == "mutton pepper"){
            foodCost = 120.00;
			return foodCost;
		}
        else if(foodName == "mutton raan"){
            foodCost = 135.99;
			return foodCost;
		}
        else if(foodName == "egg burji"){
            foodCost = 214.99;
			return foodCost;
		}
        else if(foodName == "kalmi kabab"){
            foodCost = 160.00;
			return foodCost;
		}
        else if(foodName == "murg tikka"){
            foodCost = 140.00;
			return foodCost;
		}
        else if(foodName == "chicken wings"){
            foodCost = 89.99;
			return foodCost;
		}
        else if(foodName == "fish fillet"){
            foodCost = 89.99;
			return foodCost;
		}
        else if(foodName == "fish tawa fry"){
            foodCost = 79.99;
			return foodCost;
		}
        else if(foodName == "chilly prawns"){
            foodCost = 99.99;
			return foodCost;
		}
        else if(foodName == "butter chicken"){
            foodCost = 260.00;
			return foodCost;
		}
        else if(foodName == "chicken machurian"){
            foodCost = 229.99;
			return foodCost;
		}
        else if(foodName == "chicken varaval"){
            foodCost = 235.00;
			return foodCost;
		}
        else if(foodName == "chicken kurma"){
            foodCost = 250.00;
			return foodCost;
		}
        else if(foodName == "mutton varaval"){
            foodCost = 249.99;
			return foodCost;
		}
        else if(foodName == " hyderabadi chicken"){
            foodCost = 249.99;
			return foodCost;
		}
        else if(foodName == "mutton kurma"){
            foodCost = 267.00;
			return foodCost;
		}
        else if(foodName == "egg parota"){
            foodCost = 260.99;
			return foodCost;
		}
        else if(foodName == "egg masala"){
            foodCost = 249.99;
			return foodCost;
		}
        else if(foodName == "bolied eggs"){
            foodCost = 249.99;
			return foodCost;
		}
        else if(foodName == "coraiander soup"){
            foodCost = 226.99;
			return foodCost;
		}
        else if(foodName == "mutton soup"){
            foodCost = 257.99; 
			return foodCost;
		}
        else System.out.println("food not found");

        return foodCost;
    }
	
	
	public static double getFoodCost(String foodName , int quantity){
        double foodCost = 0;

        if(foodName == "Chicken kebab"){
            foodCost = 260.00 * quantity;
		return foodCost;
		}
        else if(foodName == "Chicken biryani"){
            foodCost = 120.89 * quantity;
			return foodCost;
		}
        else if(foodName == "shawarma"){
            foodCost = 60.00* quantity;
			return foodCost;
		}
        else if(foodName == "grill chicken"){
            foodCost = 80.00* quantity;
			return foodCost;
		}
        else if(foodName == "alfaham chicken"){
            foodCost = 190.00* quantity;
			return foodCost;
		}
        else if(foodName == "mutton brain dry fry"){
            foodCost = 139.99* quantity;
			return foodCost;
		}
        else if(foodName == "popcorn chicken"){
            foodCost = 80.99* quantity;
			return foodCost;
		}
        else if(foodName == "chicken machurian"){
            foodCost = 250.00* quantity;
			return foodCost;
		}
        else if(foodName == " pepper chickem"){
            foodCost = 297.99* quantity;
			return foodCost;
		}
        else if(foodName == "mutton pepper"){
            foodCost = 120.00* quantity;
			return foodCost;
		}
        else if(foodName == "mutton raan"){
            foodCost = 135.99* quantity;
			return foodCost;
		}
        else if(foodName == "egg burji"){
            foodCost = 214.99 * quantity;
			return foodCost;
		}
        else if(foodName == "kalmi kabab"){
            foodCost = 160.00* quantity;
			return foodCost;
		}
        else if(foodName == "murg tikka"){
            foodCost = 140.00 * quantity;
			return foodCost;
		}
        else if(foodName == "chicken wings"){
            foodCost = 89.99 * quantity;
			return foodCost;
		}
        else if(foodName == "fish fillet"){
            foodCost = 89.99* quantity;
			return foodCost;
		}
        else if(foodName == "fish tawa fry"){
            foodCost = 79.99 * quantity;
			return foodCost;
		}
        else if(foodName == "chilly prawns"){
            foodCost = 99.99* quantity;
			return foodCost;
		}
        else if(foodName == "butter chicken"){
            foodCost = 260.00* quantity;
			return foodCost;
		}
        else if(foodName == "chicken machurian"){
            foodCost = 229.99 * quantity;
			return foodCost;
		}
        else if(foodName == "chicken varaval"){
            foodCost = 235.00* quantity;
			return foodCost;
		}
        else if(foodName == "chicken kurma"){
            foodCost = 250.00 * quantity;
			return foodCost;
		}
        else if(foodName == "mutton varaval"){
            foodCost = 249.99 * quantity;
			return foodCost;
		}
        else if(foodName == " hyderabadi chicken"){
            foodCost = 249.99 * quantity;
			return foodCost;
		}
        else if(foodName == "mutton kurma"){
            foodCost = 267.00* quantity;
			return foodCost;
		}
        else if(foodName == "egg parota"){
            foodCost = 260.99 * quantity;
			return foodCost;
		}
        else if(foodName == "egg masala"){
            foodCost = 249.99 * quantity;
			return foodCost;
		}
        else if(foodName == "bolied eggs"){
            foodCost = 249.99 * quantity;
			return foodCost;
		}
        else if(foodName == "coraiander soup"){
            foodCost = 226.99 * quantity;
			return foodCost;
		}
        else if(foodName == "mutton soup"){
            foodCost = 257.99 * quantity; 
			return foodCost;
		}
        else System.out.println("food not found");

        return foodCost;
    }
	
}


