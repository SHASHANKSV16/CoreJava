class Snacc {
    public static double getFoodCost(String foodName){
        double foodCost = 0;

        if(foodName == "orange juice")
            foodCost = 160.00;
        else if(foodName == "corn sandwich")
            foodCost = 30.89;
        else if(foodName == "butter naan")
            foodCost = 99.00;
        else if(foodName == "twistato")
            foodCost = 180.00;
        else if(foodName == "momos")
            foodCost = 190.00;
        else if(foodName == "pepsi")
            foodCost = 139.99;
        else if(foodName == "coco cola")
            foodCost = 80.99;
        else if(foodName == "vanilla")
            foodCost = 250.00;
        else if(foodName == "nuts sundae")
            foodCost = 297.99;
        else if(foodName == "mango milkshake")
            foodCost = 120.00;
        else if(foodName == "dabeli")
            foodCost = 135.99;
        else if(foodName == "puliogare")
            foodCost = 114.99;
        else if(foodName == "chitrana")
            foodCost = 160.00;
        else if(foodName == "akki roti")
            foodCost = 140.00;
        else if(foodName == "holige")
            foodCost = 89.99;
        else if(foodName == "chakli")
            foodCost = 89.99;
        else if(foodName == "nippat")
            foodCost = 79.99;
        else if(foodName == "banana chips")
            foodCost = 99.99;
        else if(foodName == "white rice with dal")
            foodCost = 260.00;
        else if(foodName == "kachori")
            foodCost = 129.99;
        else if(foodName == "sev puri")
            foodCost = 135.00;
        else if(foodName == "jackfruit juice")
            foodCost = 150.00;
        else if(foodName == "masala soda")
            foodCost = 149.99;
        else if(foodName == "virgin mojito")
            foodCost = 149.99;
        else if(foodName == "tacos")
            foodCost = 67.00;
        else if(foodName == "hot dogs")
            foodCost = 160.99;
        else if(foodName == "soan papdi")
            foodCost = 149.99;
        else if(foodName == "jolad roti")
            foodCost = 149.99;
        else if(foodName == "noodles")
            foodCost = 126.99;
        else if(foodName == "kulcha")
            foodCost = 117.99; 
        else System.out.println("food not found");

        return foodCost;
    }
}
