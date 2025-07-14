class SparkRegistration {

    static String permanentEmployeeNumber;
    static String name;
    static String dateOfBirth;
    static long aadhaarNumber;
    static long mobileNumber;
    static String password;
    static String confirmPassword;

    public static boolean registerUser(String pen, String empName, String dob, long aadhaar,
                                       long phone, String pass, String confirmPass) {

        boolean isRegistered = false;

        boolean isValidPEN = false;
        boolean isValidName = false;
        boolean isValidDOB = false;
        boolean isValidAadhaar = false;
        boolean isValidMobile = false;
        boolean isValidPassword = false;
        boolean isValidConfirmPassword = false;

        if (pen != null) {
            permanentEmployeeNumber = pen;
            isValidPEN = true;
        } else {
            System.out.println("Permanent Employee Number (PEN) is required");
        }

        if (empName != null) {
            name = empName;
            isValidName = true;
        } else {
            System.out.println("Name is required");
        }

        if (dob != null) {
            dateOfBirth = dob;
            isValidDOB = true;
        } else {
            System.out.println("Date of Birth is required");
        }

        if (aadhaar > 0 ) {
            aadhaarNumber = aadhaar;
            isValidAadhaar = true;
        } else {
            System.out.println("Aadhaar Number is required");
        }

        if (phone > 0) {
            mobileNumber = phone;
            isValidMobile = true;
        } else {
            System.out.println("Mobile Number is required");
        }

        if (pass != null) {
            password = pass;
            isValidPassword = true;
        } else {
            System.out.println("Password is required");
        }

        if (confirmPass != null && confirmPass==pass) {
            confirmPassword = confirmPass;
            isValidConfirmPassword = true;
        } else {
            System.out.println("Confirm Password is required or does not match");
        }

        if (isValidPEN && isValidName && isValidDOB && isValidAadhaar &&
            isValidMobile && isValidPassword && isValidConfirmPassword) {

            System.out.println("SPARK registration successful");
            isRegistered = true;
        }

        return isRegistered;
    }

    public static void getDetails() {
        System.out.println("Permanent Employee Number : " + permanentEmployeeNumber);
        System.out.println("Name   : " + name);
        System.out.println("Date of Birth   : " + dateOfBirth);
        System.out.println("Aadhaar Number    : " + aadhaarNumber);
        System.out.println("Mobile Number  : " + mobileNumber);
        System.out.println("Password    : " + password);
        System.out.println("Confirm Password   : " + confirmPassword);
    }
}
