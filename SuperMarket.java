class SuperMarket {
    public static void main(String market[]) {

        String iceCreams[] = {
            "Vanilla", "Chocolate", "Strawberry", "Mango", "Butterscotch",
            "Black Currant", "Pista", "Kulfi", "Choco Chips", "Blueberry"
        };

        String perfumes[] = {
            "Axe", "Fogg", "Park Avenue", "Wild Stone", "Denver",
            "Skinn", "Engage", "Layer'r Shot", "Bella Vita", "Beardo"
        };

        String groceries[] = {
            "Rice", "Wheat", "Sugar", "Salt", "Dal",
            "Oil", "Ragi", "Atta", "Besan", "Poha"
        };

        String cosmetics[] = {
            "Lipstick", "Eyeliner", "Foundation", "Compact", "Face Wash",
            "Shampoo", "Conditioner", "Body Lotion", "Perfume", "Face Cream"
        };

        System.out.println(iceCreams[0]);
        System.out.println(iceCreams[1]);
        System.out.println(iceCreams[2]);
        System.out.println(iceCreams[3]);
        System.out.println(iceCreams[4]);
        System.out.println(iceCreams[5]);
        System.out.println(iceCreams[6]);
        System.out.println(iceCreams[7]);
        System.out.println(iceCreams[8]);
        System.out.println(iceCreams[9]);

        System.out.println(perfumes[0]);
        System.out.println(perfumes[1]);
        System.out.println(perfumes[2]);
        System.out.println(perfumes[3]);
        System.out.println(perfumes[4]);
        System.out.println(perfumes[5]);
        System.out.println(perfumes[6]);
        System.out.println(perfumes[7]);
        System.out.println(perfumes[8]);
        System.out.println(perfumes[9]);

        System.out.println(groceries[0]);
        System.out.println(groceries[1]);
        System.out.println(groceries[2]);
        System.out.println(groceries[3]);
        System.out.println(groceries[4]);
        System.out.println(groceries[5]);
        System.out.println(groceries[6]);
        System.out.println(groceries[7]);
        System.out.println(groceries[8]);
        System.out.println(groceries[9]);

        System.out.println(cosmetics[0]);
        System.out.println(cosmetics[1]);
        System.out.println(cosmetics[2]);
        System.out.println(cosmetics[3]);
        System.out.println(cosmetics[4]);
        System.out.println(cosmetics[5]);
        System.out.println(cosmetics[6]);
        System.out.println(cosmetics[7]);
        System.out.println(cosmetics[8]);
        System.out.println(cosmetics[9]);

        
        for (String item : iceCreams) {
            System.out.println(item);
        }

        for (String item : perfumes) {
            System.out.println(item);
        }

        for (String item : groceries) {
            System.out.println(item);
        }

        for (String item : cosmetics) {
            System.out.println(item);
        }
    }
}
