class PAN {
    
    static String surname;
    static String firstName;
    static String password;
    static String confirmPassword;
   

    public static boolean registrationUser(String lName,String fName,String pwd,String cpwd) {
        boolean isRegistrationUser = false;
        boolean isValidSurname     = false;
        boolean isValidFirstName   = false;
        boolean isValidPassword  = false;
        boolean isValidConfirmPassord = false;
       
      
        if (lName != null) {
            surname = lName;
            isValidSurname = true;
        }else 
			System.out.println("enter valid surname");
        if (fName != null) {
            firstName = fName;
            isValidFirstName = true;
        }else 
			System.out.println("enter valid firstname");
        if (pwd != null) {
            password = pwd;
            isValidPassword = true;
        }else
			System.out.println("enter valid password");
        if (cpwd != null && pwd == cpwd ) {
            confirmPassword = cpwd;
            isValidConfirmPassord = true;
        }else
			System.out.println("enter valid confirmPassword");
        if (isValidSurname  &&isValidFirstName &&isValidPassword  &&isValidConfirmPassord) {
          System.out.println("the surname , firstname , password , confirmpassword is valid");
            isRegistrationUser = true;
        }

        return isRegistrationUser;
    }

    public static void getDetails() {
        System.out.println("Surname "      + surname);
        System.out.println("First Name  "   + firstName);
        System.out.println("Password "  + password);
		System.out.println("confirm Password"        + confirmPassword);
        
    }
}
