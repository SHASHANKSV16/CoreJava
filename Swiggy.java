class Swiggy {
    public static double getFoodCost(String foodName){
        double foodCost = 0;

        if(foodName == "panner butter masala"){
            foodCost = 260.00;
			return foodCost ;
		}
        else if(foodName == "gobi machurian"){
            foodCost = 120.89;
			return foodCost; 
		}
        else if(foodName == "idli"){
            foodCost = 60.00;
			return foodCost ;
		}
        else if(foodName == "dosa"){
            foodCost = 80.00;
			return foodCost ;
		}

        else if(foodName == "dal kichidi"){
            foodCost = 190.00;
			return foodCost ;
		}
        else if(foodName == "channa bature"){
            foodCost = 139.99;
			return foodCost ;
		}
        else if(foodName == "poori sagu"){
            foodCost = 80.99;
			return foodCost ;
		}
        else if(foodName == "meals"){
            foodCost = 250.00;
			return foodCost ;
		}
        else if(foodName == "panner kurma"){
            foodCost = 297.99;
			return foodCost ;
		}
        else if(foodName == "baby corn machurian"){
            foodCost = 120.00;
			return foodCost ;
		}
        else if(foodName == "panner 65"){
            foodCost = 135.99;
			return foodCost ;
		}
        else if(foodName == "kadai mixed veg"){
            foodCost = 214.99;
			return foodCost ;
		}
        else if(foodName == "pav bhaji"){
            foodCost = 160.00;
			return foodCost ;
		}
        else if(foodName == "panner machurian"){
            foodCost = 140.00;
			return foodCost ;
		}
        else if(foodName == "masal puri"){
            foodCost = 89.99;
			return foodCost ;
		}
        else if(foodName == "bhel puri"){
            foodCost = 89.99;
			return foodCost ;
		}
        else if(foodName == "pani puri"){
            foodCost = 79.99;
			return foodCost ;
		}
        else if(foodName == "dhai puri"){
            foodCost = 99.99;
			return foodCost ;
		}
        else if(foodName == "panner tikka masala"){
            foodCost = 260.00;
			return foodCost ;
		}
        else if(foodName == "kaju masala"){
            foodCost = 229.99;
			return foodCost ;
		}
        else if(foodName == "vegetable curry"){
            foodCost = 235.00;
			return foodCost ;
		}
        else if(foodName == "panner guchhi"){
            foodCost = 250.00;
			return foodCost ;
		}
        else if(foodName == "veg hyderabad curry"){
            foodCost = 249.99;
			return foodCost ;
		}
        else if(foodName == "mushroom masala"){
            foodCost = 249.99;
			return foodCost ;
		}
        else if(foodName == "veg pepper masala"){
            foodCost = 267.00;
			return foodCost ;
		}
        else if(foodName == "sagara special curry"){
            foodCost = 260.99;
			return foodCost ;
		}
        else if(foodName == "malai kofta"){
            foodCost = 249.99;
			return foodCost ;
		}
        else if(foodName == "palak gobi"){
            foodCost = 249.99;
			return foodCost ;
		}
        else if(foodName == "navrathan kurma"){
            foodCost = 226.99;
			return foodCost ;
		}
        else if(foodName == "capsicum masala"){
            foodCost = 257.99; 
			return foodCost ;
		}
        else System.out.println("food not found");

        return foodCost;

		}
		
		
	public static double getFoodCost(String foodName , int quantity){
		
		double foodCost = 0;

        if(foodName == "panner butter masala"){
            foodCost = 260.00 * quantity;
			return foodCost ;
		}
        else if(foodName == "gobi machurian"){
            foodCost = 120.89* quantity;
			return foodCost; 
		}
        else if(foodName == "idli"){
            foodCost = 60.00* quantity;
			return foodCost ;
		}
        else if(foodName == "dosa"){
            foodCost = 80.00* quantity;
			return foodCost ;
		}

        else if(foodName == "dal kichidi"){
            foodCost = 190.00* quantity;
			return foodCost ;
		}
        else if(foodName == "channa bature"){
            foodCost = 139.99* quantity;
			return foodCost ;
		}
        else if(foodName == "poori sagu"){
            foodCost = 80.99* quantity;
			return foodCost ;
		}
        else if(foodName == "meals"){
            foodCost = 250.00* quantity;
			return foodCost ;
		}
        else if(foodName == "panner kurma"){
            foodCost = 297.99* quantity;
			return foodCost ;
		}
        else if(foodName == "baby corn machurian"){
            foodCost = 120.00* quantity;
			return foodCost ;
		}
        else if(foodName == "panner 65"){
            foodCost = 135.99* quantity;
			return foodCost ;
		}
        else if(foodName == "kadai mixed veg"){
            foodCost = 214.99 * quantity;
			return foodCost ;
		}
        else if(foodName == "pav bhaji"){
            foodCost = 160.00* quantity;
			return foodCost ;
		}
        else if(foodName == "panner machurian"){
            foodCost = 140.00* quantity;
			return foodCost ;
		}
        else if(foodName == "masal puri"){
            foodCost = 89.99* quantity;
			return foodCost ;
		}
        else if(foodName == "bhel puri"){
            foodCost = 89.99* quantity;
			return foodCost ;
		}
        else if(foodName == "pani puri"){
            foodCost = 79.99* quantity;
			return foodCost ;
		}
        else if(foodName == "dhai puri"){
            foodCost = 99.99* quantity;
			return foodCost ;
		}
        else if(foodName == "panner tikka masala"){
            foodCost = 260.00* quantity;
			return foodCost ;
		}
        else if(foodName == "kaju masala"){
            foodCost = 229.99* quantity;
			return foodCost ;
		}
        else if(foodName == "vegetable curry"){
            foodCost = 235.00* quantity;
			return foodCost ;
		}
        else if(foodName == "panner guchhi"){
            foodCost = 250.00* quantity;
			return foodCost ;
		}
        else if(foodName == "veg hyderabad curry"){
            foodCost = 249.99* quantity;
			return foodCost ;
		}
        else if(foodName == "mushroom masala"){
            foodCost = 249.99* quantity;
			return foodCost ;
		}
        else if(foodName == "veg pepper masala"){
            foodCost = 267.00* quantity;
			return foodCost ;
		}
        else if(foodName == "sagara special curry"){
            foodCost = 260.99* quantity;
			return foodCost ;
		}
        else if(foodName == "malai kofta"){
            foodCost = 249.99* quantity;
			return foodCost ;
		}
        else if(foodName == "palak gobi"){
            foodCost = 249.99* quantity;
			return foodCost ;
		}
        else if(foodName == "navrathan kurma"){
            foodCost = 226.99* quantity;
			return foodCost ;
		}
        else if(foodName == "capsicum masala"){
            foodCost = 257.99* quantity; 
			return foodCost ;
		}
        else System.out.println("food not found");
		
	return foodCost;
	}
		
		
		
		
		
}

