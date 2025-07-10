class Facebook {
    static String firstName;
    static String surname;
    static String dateOfBirth;
    static String gender;
    static long mobileNumber;
    static String email;
    static String password;

    public static boolean registrationUser(String fName, String lName, String dob, String gen, long phone, String eMail, String pass) {
    boolean isRegistrationUser = false;
    
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
    }
    if (lName != null) {
        surname = lName;
        isValidSurname = true;
    }
    if (dob != null) {
        dateOfBirth = dob;
        isValidDOB = true;
    }
    if (gen != null) {
        gender = gen;
        isValidGender = true;
    }
    if (phone != 0) {
        mobileNumber = phone;
        isValidMobile = true;
    }
    if (eMail != null) {
        email = eMail;
        isValidEmail = true;
    }
    if (pass != null) {
        password = pass;
        isValidPassword = true;
    }
    
        if (isValidFirstName == true && isValidSurname == true && isValidDOB == true &&
            isValidGender == true && isValidMobile == true && isValidEmail == true && isValidPassword == true) {
            isRegistrationUser = true;
        }

        return isRegistrationUser;
    }

    public static void getDetails() {
        System.out.println("First Name " + firstName);
        System.out.println("Surname " + surname);
        System.out.println("Date of Birth " + dateOfBirth);
        System.out.println("Gender " + gender);
        System.out.println("Mobile Number " + mobileNumber);
        System.out.println("Email " + email);
        System.out.println("Password " + password);
    }
}
