class Zepto {
    public static double getItemCost(String itemName){
        double itemCost = 0;

        if(itemName == "samosa")
            itemCost = 62.00;
        else if(itemName == "tiramisu")
            itemCost = 119.89;
        else if(itemName == "cold coffee")
            itemCost = 189.00;
        else if(itemName == "panner maggi")
            itemCost = 139.00;
        else if(itemName == "museli")
            itemCost = 190.00;
        else if(itemName == "chicken puff")
            itemCost = 99.99;
        else if(itemName == "chocolate mousse")
            itemCost = 80.99;
        else if(itemName == "bun maska")
            itemCost = 69.00;
        else if(itemName == " corn cheese toast")
            itemCost = 155.99;
        else if(itemName == "croissants")
            itemCost = 120.00;
        else if(itemName == "hot chocolate")
            itemCost = 135.99;
        else if(itemName == "samosa pav")
            itemCost = 145.99;
        else if(itemName == "choco lava cake")
            itemCost = 79.00;
        else if(itemName == "garlic bread")
            itemCost = 140.00;
        else if(itemName == "chole kulche")
            itemCost = 189.99;
        else if(itemName == "medu vada")
            itemCost = 89.99;
        else if(itemName == "dal halwa")
            itemCost = 79.99;
        else if(itemName == "chai")
            itemCost = 99.99;
        else if(itemName == "ghee podi idli")
            itemCost = 260.00;
        else if(itemName == "aloo pyazz")
            itemCost = 229.99;
        else if(itemName == "dal makhani")
            itemCost = 235.00;
        else if(itemName == "kesari rasmalai")
            itemCost = 150.00;
        else if(itemName == "meat balls")
            itemCost = 249.99;
        else if(itemName == " channa jor")
            itemCost = 149.99;
        else if(itemName == "plain curd")
            itemCost = 67.00;
        else if(itemName == "aam panna")
            itemCost = 160.99;
        else if(itemName == "mixed berry cooler")
            itemCost = 149.99;
        else if(itemName == "rawa upma")
            itemCost = 69.99;
        else if(itemName == "poha")
            itemCost = 96.99;
        else if(itemName == "blue flower rose tea")
            itemCost = 99.99; 
        else System.out.println("food not found");

        return itemCost;
    }
}
