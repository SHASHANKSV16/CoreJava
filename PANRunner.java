class PANRunner {
    public static void main(String[] card) {
        
        System.out.println();

        boolean isUserRegistered = PAN.registrationUser("Shri","Sharma","Sharma@123","Sharma@123");
        System.out.println("The user is registered: " + isUserRegistered);
		if(isUserRegistered)
           PAN.getDetails();
    }
}