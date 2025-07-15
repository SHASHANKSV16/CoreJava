class EatSure {
    public static double getFoodCost(String foodName){
        double foodCost = 0;

        if(foodName == "sabudana vada"){
            foodCost = 160.00;
		return foodCost;
		}
        else if(foodName == "gulab jamun"){
            foodCost = 30.89;
		return foodCost;
		}
        else if(foodName == "moong dal halwa"){
            foodCost = 99.00;
		return foodCost;
		}
        else if(foodName == "corn masala"){
            foodCost = 180.00;
		return foodCost;
		}
        else if(foodName == "shabnami murgh"){
            foodCost = 190.00;
		return foodCost;
		}
        else if(foodName == "red velvet"){
            foodCost = 139.99;
		return foodCost;
		}
        else if(foodName == "imli chutney"){
            foodCost = 80.99;
		return foodCost;
		}
        else if(foodName == "death by chocolate"){
            foodCost = 250.00;
		return foodCost;
		}
        else if(foodName == " rajgira halwa"){
            foodCost = 297.99;
		return foodCost;
		}
        else if(foodName == "choco chip brownie"){
            foodCost = 120.00;
		return foodCost;
		}
        else if(foodName == "biscoff cheesecake"){
            foodCost = 135.99;
		return foodCost;
		}
        else if(foodName == "mango cheesecake"){
            foodCost = 214.99;
		return foodCost;
		}
        else if(foodName == "caramel ice cream"){
            foodCost = 160.00;
		return foodCost;
		}
        else if(foodName == "red velvet mousse"){
            foodCost = 140.00;
		return foodCost;
		}
        else if(foodName == "quasadilla"){
            foodCost = 89.99;
		return foodCost;
		}
        else if(foodName == "kulfi"){
            foodCost = 89.99;
		return foodCost;
		}
        else if(foodName == "popcorn"){
            foodCost = 79.99;
		return foodCost;
		}
        else if(foodName == "brownies"){
            foodCost = 99.99;
		return foodCost;
		}
        else if(foodName == "pastries"){
            foodCost = 260.00;
		return foodCost;
		}
        else if(foodName == "cupcake"){
            foodCost = 229.99;
		return foodCost;
		}
        else if(foodName == "blueberry dragees"){
            foodCost = 135.00;
		return foodCost;
		}
        else if(foodName == "salted peanuts"){
            foodCost = 150.00;
		return foodCost;
		}
        else if(foodName == "pink salt with milk chocolate"){
            foodCost = 249.99;
		return foodCost;
		}
        else if(foodName == " french fries"){
            foodCost = 149.99;
		return foodCost;
		}
        else if(foodName == "pizza puff"){
            foodCost = 67.00;
		return foodCost;
		}
        else if(foodName == "potato wedges"){
            foodCost = 160.99;
		return foodCost;
		}
        else if(foodName == "smiles"){
            foodCost = 149.99;
		return foodCost;
		}
        else if(foodName == "nuggets"){
            foodCost = 149.99;
		return foodCost;
		}
        else if(foodName == "sweet pongal"){
            foodCost = 126.99;
		return foodCost;
		}
        else if(foodName == "kesari bath"){
            foodCost = 117.99; 
		return foodCost;
		}
        else System.out.println("food not found");

        return foodCost;
    }
	
	
	
	
	public static double getFoodCost(String foodName , int quantity){
		
	double foodCost = 0;

        if(foodName == "sabudana vada"){
            foodCost = 160.00 * quantity;
		return foodCost;
		}
        else if(foodName == "gulab jamun"){
            foodCost = 30.89* quantity;
		return foodCost;
		}
        else if(foodName == "moong dal halwa"){
            foodCost = 99.00* quantity;
		return foodCost;
		}
        else if(foodName == "corn masala"){
            foodCost = 180.00* quantity;
		return foodCost;
		}
        else if(foodName == "shabnami murgh"){
            foodCost = 190.00* quantity;
		return foodCost;
		}
        else if(foodName == "red velvet"){
            foodCost = 139.99* quantity;
		return foodCost;
		}
        else if(foodName == "imli chutney"){
            foodCost = 80.99* quantity;
		return foodCost;
		}
        else if(foodName == "death by chocolate"){
            foodCost = 250.00* quantity;
		return foodCost;
		}
        else if(foodName == " rajgira halwa"){
            foodCost = 297.99* quantity;
		return foodCost;
		}
        else if(foodName == "choco chip brownie"){
            foodCost = 120.00* quantity;
		return foodCost;
		}
        else if(foodName == "biscoff cheesecake"){
            foodCost = 135.99* quantity;
		return foodCost;
		}
        else if(foodName == "mango cheesecake"){
            foodCost = 214.99* quantity;
		return foodCost;
		}
        else if(foodName == "caramel ice cream"){
            foodCost = 160.00* quantity;
		return foodCost;
		}
        else if(foodName == "red velvet mousse"){
            foodCost = 140.00* quantity;
		return foodCost;
		}
        else if(foodName == "quasadilla"){
            foodCost = 89.99* quantity;
		return foodCost;
		}
        else if(foodName == "kulfi"){
            foodCost = 89.99* quantity;
		return foodCost;
		}
        else if(foodName == "popcorn"){
            foodCost = 79.99* quantity;
		return foodCost;
		}
        else if(foodName == "brownies"){
            foodCost = 99.99* quantity;
		return foodCost;
		}
        else if(foodName == "pastries"){
            foodCost = 260.00* quantity;
		return foodCost;
		}
        else if(foodName == "cupcake"){
            foodCost = 229.99* quantity;
		return foodCost;
		}
        else if(foodName == "blueberry dragees"){
            foodCost = 135.00* quantity;
		return foodCost;
		}
        else if(foodName == "salted peanuts"){
            foodCost = 150.00* quantity;
		return foodCost;
		}
        else if(foodName == "pink salt with milk chocolate"){
            foodCost = 249.99* quantity;
		return foodCost;
		}
        else if(foodName == " french fries"){
            foodCost = 149.99* quantity;
		return foodCost;
		}
        else if(foodName == "pizza puff"){
            foodCost = 67.00* quantity;
		return foodCost;
		}
        else if(foodName == "potato wedges"){
            foodCost = 160.99* quantity;
		return foodCost;
		}
        else if(foodName == "smiles"){
            foodCost = 149.99* quantity;
		return foodCost;
		}
        else if(foodName == "nuggets"){
            foodCost = 149.99* quantity;
		return foodCost;
		}
        else if(foodName == "sweet pongal"){
            foodCost = 126.99* quantity;
		return foodCost;
		}
        else if(foodName == "kesari bath"){
            foodCost = 117.99* quantity; 
		return foodCost;
		}
		else System.out.println("food not found");
	
	return foodCost;
		
		
	}
}
