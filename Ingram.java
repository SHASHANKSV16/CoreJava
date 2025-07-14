class Ingram {

    static String firstName;
    static String lastName;
    static long contactNumber;
    static String email;
    static String password;
    static String confirmPassword;

    public static boolean registerUser(String fName, String lName, long contactNo,
                                           String eMail, String pass, String confirmPass) {

        boolean isRegistered = false;

        // boolean isValidFirstName = false;
        // boolean isValidLastName = false;
        // boolean isValidContact = false;
        // boolean isValidEmail = false;
        // boolean isValidPassword = false;
        // boolean isValidConfirmPassword = false;

        // if (fName != null) {
            // firstName = fName;
            // isValidFirstName = true;
        // } else {
            // System.out.println("First Name is required");
        // }

        // if (lName != null) {
            // lastName = lName;
            // isValidLastName = true;
        // } else {
            // System.out.println("Last Name is required");
        // }

        // if (contactNo != 0) {
            // contactNumber = contactNo;
            // isValidContact = true;
        // } else {
            // System.out.println("Contact Number is required");
        // }

        // if (eMail != null) {
            // email = eMail;
            // isValidEmail = true;
        // } else {
            // System.out.println("Email is required");
        // }

        // if (pass != null) {
            // password = pass;
            // isValidPassword = true;
        // } else {
            // System.out.println("Password is required");
        // }

        // if (confirmPass != null && confirmPass == pass) {
            // confirmPassword = confirmPass;
            // isValidConfirmPassword = true;
        // } else {
            // System.out.println("Confirm Password is required or does not match");
        // }

        // if (isValidFirstName && isValidLastName && isValidContact && isValidEmail &&
            // isValidPassword && isValidConfirmPassword) {

            // System.out.println("Ingram registration successful");
            // isRegistered = true;
        // }
		boolean isVaild = IngramValidator.validator(fName, lName, contactNo,eMail, pass, confirmPass);
		if(isVaild) 
			isRegistered = true;
		else
			System.out.println("data is not validated");
        return isRegistered;
    }

    public static void getDetails() {
		
    firstName = IngramValidator.firstName;
    lastName= IngramValidator.lastName;
    contactNumber = IngramValidator.contactNumber;
    email=IngramValidator.email;
    password = IngramValidator.password;
    confirmPassword=IngramValidator.confirmPassword;
		
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name : " + lastName);
        System.out.println("Contact Number : " + contactNumber);
        System.out.println("Email  : " + email);
        System.out.println("Password   : " + password);
        System.out.println("Confirm Password : " + confirmPassword);
    }
}
