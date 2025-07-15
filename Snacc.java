class Snacc {
    public static double getFoodCost(String foodName){
        double foodCost = 0;

        if(foodName == "orange juice"){
            foodCost = 160.00;
			return foodCost;
	    }
        else if(foodName == "corn sandwich"){
            foodCost = 30.89;
			return foodCost;
	    }
        else if(foodName == "butter naan"){
            foodCost = 99.00;
			return foodCost;
	    }
        else if(foodName == "twistato"){
            foodCost = 180.00;
			return foodCost;
	    }
        else if(foodName == "momos"){
            foodCost = 190.00;
			return foodCost;
	    }
        else if(foodName == "pepsi"){
            foodCost = 139.99;
			return foodCost;
	    }
        else if(foodName == "coco cola"){
            foodCost = 80.99;
			return foodCost;
	    }
        else if(foodName == "vanilla"){
            foodCost = 250.00;
			return foodCost;
	    }
        else if(foodName == "nuts sundae"){
            foodCost = 297.99;
			return foodCost;
	    }
        else if(foodName == "mango milkshake"){
            foodCost = 120.00;
			return foodCost;
	    }
        else if(foodName == "dabeli"){
            foodCost = 135.99;
			return foodCost;
	    }
        else if(foodName == "puliogare"){
            foodCost = 114.99;
			return foodCost;
	    }
        else if(foodName == "chitrana"){
            foodCost = 160.00;
			return foodCost;
	    }
        else if(foodName == "akki roti"){
            foodCost = 140.00;
			return foodCost;
	    }
        else if(foodName == "holige"){
            foodCost = 89.99;
			return foodCost;
	    }
        else if(foodName == "chakli"){
            foodCost = 89.99;
			return foodCost;
	    }
        else if(foodName == "nippat"){
            foodCost = 79.99;
			return foodCost;
	    }
        else if(foodName == "banana chips"){
            foodCost = 99.99;
			return foodCost;
	    }
        else if(foodName == "white rice with dal"){
            foodCost = 260.00;
			return foodCost;
	    }
        else if(foodName == "kachori"){
            foodCost = 129.99;
			return foodCost;
	    }
        else if(foodName == "sev puri"){
            foodCost = 135.00;
			return foodCost;
	    }
        else if(foodName == "jackfruit juice"){
            foodCost = 150.00;
			return foodCost;
	    }
        else if(foodName == "masala soda"){
            foodCost = 149.99;
			return foodCost;
	    }
        else if(foodName == "virgin mojito"){
            foodCost = 149.99;
			return foodCost;
	    }
        else if(foodName == "tacos"){
            foodCost = 67.00;
			return foodCost;
	    }
        else if(foodName == "hot dogs"){
            foodCost = 160.99;
			return foodCost;
	    }
        else if(foodName == "soan papdi"){
            foodCost = 149.99;
			return foodCost;
	    }
        else if(foodName == "jolad roti"){
            foodCost = 149.99;
			return foodCost;
	    }
        else if(foodName == "noodles"){
            foodCost = 126.99;
			return foodCost;
	    }
        else if(foodName == "kulcha"){
            foodCost = 117.99;
			return foodCost;
	    }		
        else System.out.println("food not found");

        return foodCost;
    }
	
	public static double getFoodCost(String foodName , int quantity){
        double foodCost = 0;

        if(foodName == "orange juice"){
            foodCost = 160.00 * quantity;
			return foodCost;
	    }
        else if(foodName == "corn sandwich"){
            foodCost = 30.89 * quantity;
			return foodCost;
	    }
        else if(foodName == "butter naan"){
            foodCost = 99.00 * quantity;
			return foodCost;
	    }
        else if(foodName == "twistato"){
            foodCost = 180.00* quantity;
			return foodCost;
	    }
        else if(foodName == "momos"){
            foodCost = 190.00 * quantity;
			return foodCost;
	    }
        else if(foodName == "pepsi"){
            foodCost = 139.99 * quantity;
			return foodCost;
	    }
        else if(foodName == "coco cola"){
            foodCost = 80.99* quantity;
			return foodCost;
	    }
        else if(foodName == "vanilla"){
            foodCost = 250.00* quantity;
			return foodCost;
	    }
        else if(foodName == "nuts sundae"){
            foodCost = 297.99 * quantity;
			return foodCost;
	    }
        else if(foodName == "mango milkshake"){
            foodCost = 120.00* quantity;
			return foodCost;
	    }
        else if(foodName == "dabeli"){
            foodCost = 135.99* quantity;
			return foodCost;
	    }
        else if(foodName == "puliogare"){
            foodCost = 114.99* quantity;
			return foodCost;
	    }
        else if(foodName == "chitrana"){
            foodCost = 160.00* quantity;
			return foodCost;
	    }
        else if(foodName == "akki roti"){
            foodCost = 140.00* quantity;
			return foodCost;
	    }
        else if(foodName == "holige"){
            foodCost = 89.99* quantity;
			return foodCost;
	    }
        else if(foodName == "chakli"){
            foodCost = 89.99* quantity;
			return foodCost;
	    }
        else if(foodName == "nippat"){
            foodCost = 79.99* quantity;
			return foodCost;
	    }
        else if(foodName == "banana chips"){
            foodCost = 99.99* quantity;
			return foodCost;
	    }
        else if(foodName == "white rice with dal"){
            foodCost = 260.00* quantity;
			return foodCost;
	    }
        else if(foodName == "kachori"){
            foodCost = 129.99* quantity;
			return foodCost;
	    }
        else if(foodName == "sev puri"){
            foodCost = 135.00* quantity;
			return foodCost;
	    }
        else if(foodName == "jackfruit juice"){
            foodCost = 150.00* quantity;
			return foodCost;
	    }
        else if(foodName == "masala soda"){
            foodCost = 149.99* quantity;
			return foodCost;
	    }
        else if(foodName == "virgin mojito"){
            foodCost = 149.99* quantity;
			return foodCost;
	    }
        else if(foodName == "tacos"){
            foodCost = 67.00* quantity;
			return foodCost;
	    }
        else if(foodName == "hot dogs"){
            foodCost = 160.99* quantity;
			return foodCost;
	    }
        else if(foodName == "soan papdi"){
            foodCost = 149.99* quantity;
			return foodCost;
	    }
        else if(foodName == "jolad roti"){
            foodCost = 149.99* quantity;
			return foodCost;
	    }
        else if(foodName == "noodles"){
            foodCost = 126.99* quantity;
			return foodCost;
	    }
        else if(foodName == "kulcha"){
            foodCost = 117.99* quantity;
			return foodCost;
	    }		
        else System.out.println("food not found");

        return foodCost;
    }
	
}
