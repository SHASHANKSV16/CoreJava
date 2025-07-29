class KingRunner {
    public static void main(String[] raja) {

        
        String[] battles = {"Kalinga War", "world war"};

        
        King firstKing = new King(1, "Chandragupta", "Maurya", "Rajasthan", "Jaipur", battles);
        firstKing.getData();

        
        King secondKing = new King(2, "Ashoka");
        System.out.println("the king id is " + secondKing.kingId);
        System.out.println("the name is " + secondKing.name);
        System.out.println();

       
        King thirdKing = new King("Gupta", "Manipur");
        System.out.println("the dynasty is " + thirdKing.dynasty);
        System.out.println("the kingdom is " + thirdKing.kingdom);
        System.out.println();

      
        King fourthKing = new King();
        fourthKing.kingId = 4;
        fourthKing.name = "Harshavardhana";
        fourthKing.dynasty = "Odeyar";
        fourthKing.kingdom = "Madhya Pradesh";
        fourthKing.capital = "Bhopal";
        
        fourthKing.getData();
    }
}
