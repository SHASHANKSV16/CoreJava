class IngramValidator {

    static String firstName;
    static String lastName;
    static long contactNumber;
    static String email;
    static String password;
    static String confirmPassword;

    public static boolean validator(String fName, String lName, long contactNo,String eMail, String pass, String confirmPass) {
          boolean isValidated = false;
		          boolean isValidFirstName = false;
        boolean isValidLastName = false;
        boolean isValidContact = false;
        boolean isValidEmail = false;
        boolean isValidPassword = false;
        boolean isValidConfirmPassword = false;

        if (fName != null) {
            firstName = fName;
            isValidFirstName = true;
        } else {
            System.out.println("First Name is required");
        }

        if (lName != null) {
            lastName = lName;
            isValidLastName = true;
        } else {
            System.out.println("Last Name is required");
        }

        if (contactNo != 0) {
            contactNumber = contactNo;
            isValidContact = true;
        } else {
            System.out.println("Contact Number is required");
        }

        if (eMail != null) {
            email = eMail;
            isValidEmail = true;
        } else {
            System.out.println("Email is required");
        }

        if (pass != null) {
            password = pass;
            isValidPassword = true;
        } else {
            System.out.println("Password is required");
        }

        if (confirmPass != null && confirmPass == pass) {
            confirmPassword = confirmPass;
            isValidConfirmPassword = true;
        } else {
            System.out.println("Confirm Password is required or does not match");
        }

        if (isValidFirstName && isValidLastName && isValidContact && isValidEmail &&
            isValidPassword && isValidConfirmPassword) {
				System.out.println("Ingram registration successful");
            isValidated = true;}
	return isValidated;}
}