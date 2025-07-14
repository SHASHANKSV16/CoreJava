class PramanRunner {
    public static void main(String[] args) {
        boolean user = Praman.registerUser(9876543210L, "Anjali", "Female", "1995-05-20",
                "anjali95", "pass123", "pass123");

        System.out.println("Registration Successful: " + user);
        if (user) 
            Praman.getDetails();
        

        System.out.println();

        boolean user2 = Praman.registerUser(9876543210L, null, null, null, null, "pass123", "pass12");
        System.out.println("Registration Successful: " + user2);
        if (user2) 
            Praman.getDetails();
        
    }
}
