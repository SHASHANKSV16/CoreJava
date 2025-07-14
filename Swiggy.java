class Swiggy {
    public static double getFoodCost(String foodName){
        double foodCost = 0;

        if(foodName == "panner butter masala")
            foodCost = 260.00;
        else if(foodName == "gobi machurian")
            foodCost = 120.89;
        else if(foodName == "idli")
            foodCost = 60.00;
        else if(foodName == "dosa")
            foodCost = 80.00;
        else if(foodName == "dal kichidi")
            foodCost = 190.00;
        else if(foodName == "channa bature")
            foodCost = 139.99;
        else if(foodName == "poori sagu")
            foodCost = 80.99;
        else if(foodName == "meals")
            foodCost = 250.00;
        else if(foodName == "panner kurma")
            foodCost = 297.99;
        else if(foodName == "baby corn machurian")
            foodCost = 120.00;
        else if(foodName == "panner 65")
            foodCost = 135.99;
        else if(foodName == "kadai mixed veg")
            foodCost = 214.99;
        else if(foodName == "pav bhaji")
            foodCost = 160.00;
        else if(foodName == "panner machurian")
            foodCost = 140.00;
        else if(foodName == "masal puri")
            foodCost = 89.99;
        else if(foodName == "bhel puri")
            foodCost = 89.99;
        else if(foodName == "pani puri")
            foodCost = 79.99;
        else if(foodName == "dhai puri")
            foodCost = 99.99;
        else if(foodName == "panner tikka masala")
            foodCost = 260.00;
        else if(foodName == "kaju masala")
            foodCost = 229.99;
        else if(foodName == "vegetable curry")
            foodCost = 235.00;
        else if(foodName == "panner guchhi")
            foodCost = 250.00;
        else if(foodName == "veg hyderabad curry")
            foodCost = 249.99;
        else if(foodName == "mushroom masala")
            foodCost = 249.99;
        else if(foodName == "veg pepper masala")
            foodCost = 267.00;
        else if(foodName == "sagara special curry")
            foodCost = 260.99;
        else if(foodName == "malai kofta")
            foodCost = 249.99;
        else if(foodName == "palak gobi")
            foodCost = 249.99;
        else if(foodName == "navrathan kurma")
            foodCost = 226.99;
        else if(foodName == "capsicum masala")
            foodCost = 257.99; 
        else System.out.println("food not found");

        return foodCost;
    }
}
