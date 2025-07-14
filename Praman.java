class Praman {

    static long mobileNumber;
    static String givenName;
    static String gender;
    static String dateOfBirth;
    static String username;
    static String password;
    static String confirmPassword;

    public static boolean registerUser(long phone, String name, String gen, String dob,
                                       String userName, String pass, String confirmPass) {

        boolean isRegistered = false;

        boolean isValidMobile = false;
        boolean isValidName = false;
        boolean isValidGender = false;
        boolean isValidDOB = false;
        boolean isValidUsername = false;
        boolean isValidPassword = false;
        boolean isValidConfirmPassword = false;

        if (phone > 0) {
            mobileNumber = phone;
            isValidMobile = true;
        } else {
            System.out.println("Enter a valid mobile number");
        }

        if (name != null) {
            givenName = name;
            isValidName = true;
        } else {
            System.out.println("Enter a valid given name");
        }

        if (gen != null) {
            gender = gen;
            isValidGender = true;
        } else {
            System.out.println("Enter a valid gender");
        }

        if (dob != null) {
            dateOfBirth = dob;
            isValidDOB = true;
        } else {
            System.out.println("Enter a valid date of birth");
        }

        if (userName != null) {
            username = userName;
            isValidUsername = true;
        } else {
            System.out.println("Enter a valid username");
        }

        if (pass != null) {
            password = pass;
            isValidPassword = true;
        } else {
            System.out.println("Enter a valid password");
        }

        if (confirmPass != null && confirmPass==pass) {
            confirmPassword = confirmPass;
            isValidConfirmPassword = true;
        } else {
            System.out.println("Confirm password is invalid or does not match");
        }

        if (isValidMobile && isValidName && isValidGender && isValidDOB &&
            isValidUsername && isValidPassword && isValidConfirmPassword) {

            System.out.println("UserIngram registration successful");
            isRegistered = true;
        }

        return isRegistered;
    }

    public static void getDetails() {
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Given Name: " + givenName);
        System.out.println("Gender    : " + gender);
        System.out.println("Date of Birth : " + dateOfBirth);
        System.out.println("Username : " + username);
        System.out.println("Password    : " + password);
        System.out.println("Confirm Password: " + confirmPassword);
}}
