class IngramRunner {
    public static void main(String[] gram) {

        boolean user1 = Ingram.registerUser("Ravi", "Verma", 9876543210L,
                "ravi.verma@gmail.com", "pass123", "pass123");

        System.out.println("Registration Successful: " + user1);
        if (user1) 
            Ingram.getDetails();
        
        

        boolean user2 = Ingram.registerUser(null, null, 9876543210L,
                "ravi.verma@gmail.com", "pass123", "pass12");

        System.out.println("Registration Successful: " + user2);
        if (user2) 
            Ingram.getDetails();
        
    }
}
