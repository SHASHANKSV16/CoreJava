class SamsungAccount {
    static String email;
    static String password;
    static String confirmPassword;
    static String firstName;
    static String lastName;

    public static boolean registrationUser(String eMail,String pass,String confirmPass,String fName,String lName) {
        boolean isRegistered = false;

        boolean isValidEmail = false;
        boolean isValidPassword = false;
        boolean isValidConfirm = false;
        boolean isValidFirstName = false;
        boolean isValidLastName = false;

        if (eMail != null) {
            email = eMail;
            isValidEmail = true;
        }
        if (pass != null) {
            password = pass;
            isValidPassword = true;
        }
        if (confirmPass != null && confirmPass.equals(pass)) {
            confirmPassword = confirmPass;
            isValidConfirm = true;
        }
        if (fName != null) {
            firstName = fName;
            isValidFirstName = true;
        }
        if (lName != null) {
            lastName = lName;
            isValidLastName = true;
        }

        if (isValidEmail == true &&isValidPassword == true &&isValidConfirm == true &&isValidFirstName == true &&
            isValidLastName == true) {

            isRegistered = true;
        }

        return isRegistered;
    }

    public static void getDetails() {
        System.out.println("Email Address: " + email);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }
}
