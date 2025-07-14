class VFS {

    static String firstName;
    static String lastName;
    static String emailId;
    static long mobileNumber;
    static String password;
    static String confirmPassword;

    public static boolean registrationUser(String fName, String lName, String email, long phone, String pass, String confirmPass) {

        boolean isRegistered = false;

        // boolean isValidFirstName = false;
        // boolean isValidLastName = false;
        // boolean isValidEmail = false;
        // boolean isValidMobile = false;
        // boolean isValidPassword = false;
        // boolean isValidConfirm = false;

        // if (fName != null) {
            // firstName = fName;
            // isValidFirstName = true;
        // } else {
            // System.out.println("Enter a valid first name");
        // }

        // if (lName != null) {
            // lastName = lName;
            // isValidLastName = true;
        // } else {
            // System.out.println("Enter a valid last name");
        // }

        // if (email != null) {
            // emailId = email;
            // isValidEmail = true;
        // } else {
            // System.out.println("Enter a valid email ID");
        // }

        // if (phone != 0) {
            // mobileNumber = phone;
            // isValidMobile = true;
        // } else {
            // System.out.println("Enter a valid mobile number");
        // }

        // if (pass != null) {
            // password = pass;
            // isValidPassword = true;
        // } else {
            // System.out.println("Enter a valid password");
        // }

        // if (confirmPass != null && confirmPass == pass) {
            // confirmPassword = confirmPass;
            // isValidConfirm = true;
        // } else {
            // System.out.println("Confirm password doesn't match or is null");
        // }

        // if (isValidFirstName && isValidLastName && isValidEmail &&
            // isValidMobile && isValidPassword && isValidConfirm) {
            // System.out.println("User registration is successful");
            // isRegistered = true;
        // }
 boolean isVaild = VFSValidator.validator(fName, lName, email, phone, pass, confirmPass);
		if(isVaild) 
			isRegistered = true;
		else
			System.out.println("data is not validated");
        return isRegistered;
    }

    public static void getDetails() {
		
	 firstName = VFSValidator.firstName;
     lastName= VFSValidator.lastName;
     emailId = VFSValidator.emailId;
     mobileNumber = VFSValidator.mobileNumber;
     password = VFSValidator.password;
     confirmPassword = VFSValidator.confirmPassword;
		
		
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name : " + lastName);
        System.out.println("Email ID : " + emailId);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Password     : " + password);
        System.out.println("Confirm Password : " + confirmPassword);
    }
}
