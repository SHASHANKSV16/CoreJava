class FacebookValidator{
	static String firstName;
    static String surname;
    static String dateOfBirth;
    static String gender;
    static long mobileNumber;
    static String email;
    static String password;

	public static boolean validator(String fName, String lName, String dob, String gen, long phone, String eMail, String pass){
	
		boolean isValidated = false;
		boolean isValidFirstName = false;
        boolean isValidSurname = false;
        boolean isValidDOB = false;
        boolean isValidGender = false;
        boolean isValidMobile = false;
        boolean isValidEmail = false;
        boolean isValidPassword = false;

        if (fName != null) {
            firstName = fName;
            isValidFirstName = true;
        } else {
            System.out.println("Enter a valid first name");
        }

        if (lName != null) {
            surname = lName;
            isValidSurname = true;
        } else {
            System.out.println("Enter a valid surname");
        }

        if (dob != null) {
            dateOfBirth = dob;
            isValidDOB = true;
        } else {
            System.out.println("Enter a valid date of birth");
        }

        if (gen != null) {
            gender = gen;
            isValidGender = true;
        } else {
            System.out.println("Enter a valid gender");
        }

        if (phone != 0) {
            mobileNumber = phone;
            isValidMobile = true;
        } else {
            System.out.println("Enter a valid mobile number");
        }
		if (eMail != null) {
            email = eMail;
            isValidEmail = true;
        } else {
            System.out.println("Enter a valid email");
        }

        if (pass != null) {
            password = pass;
            isValidPassword = true;
        } else {
            System.out.println("Enter a valid password");
        }
		if (isValidFirstName && isValidSurname && isValidDOB && isValidGender &&
            isValidMobile && isValidEmail && isValidPassword) {
            System.out.println("All Facebook registration details are valid");
            isValidated = true;
        }
		return isValidated;
	
	}
}