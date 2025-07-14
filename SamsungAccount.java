class SamsungAccount {

    static String email;
    static String password;
    static String confirmPassword;
    static String firstName;
    static String lastName;

    public static boolean registrationUser(String eMail, String pass, String confirmPass, String fName, String lName) {
        
        boolean isRegistered = false;

        boolean isValidEmail = false;
        boolean isValidPassword = false;
        boolean isValidConfirm = false;
        boolean isValidFirstName = false;
        boolean isValidLastName = false;

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

        if (confirmPass != null && confirmPass == pass) {
            confirmPassword = confirmPass;
            isValidConfirm = true;
        } else {
            System.out.println("Confirm password does not match ");
        }

        if (fName != null) {
            firstName = fName;
            isValidFirstName = true;
        } else {
            System.out.println("Enter a valid first name");
        }

        if (lName != null) {
            lastName = lName;
            isValidLastName = true;
        } else {
            System.out.println("Enter a valid last name");
        }

        if (isValidEmail && isValidPassword && isValidConfirm && isValidFirstName && isValidLastName) {
            System.out.println("Samsung account registration details are valid");
            isRegistered = true;
        }

        return isRegistered;
    }

    public static void getDetails() {
        System.out.println("Email Address : " + email);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password : " + confirmPassword);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }
}
