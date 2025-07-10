class PAN {
    static String title;
    static String surname;
    static String firstName;
    static String middleName;
    static String dateOfBirth;
    static String email;
    static long mobileNumber;
    static String panCard;

    public static boolean registrationUser(String selTitle,String lName,String fName,String mName,String dob,String eMail,long phone,String pan) {
        boolean isRegistrationUser = false;
		boolean isValidTitle       = false;
        boolean isValidSurname     = false;
        boolean isValidFirstName   = false;
        boolean isValidMiddleName  = false;
        boolean isValidDOB         = false;
        boolean isValidEmail       = false;
        boolean isValidMobile      = false;
        boolean isValidPanCard     = false;

        if (selTitle != null) {
            title = selTitle;
            isValidTitle = true;
        }
        if (lName != null) {
            surname = lName;
            isValidSurname = true;
        }
        if (fName != null) {
            firstName = fName;
            isValidFirstName = true;
        }
        if (mName != null) {
            middleName = mName;
            isValidMiddleName = true;
        }
        if (dob != null) {
            dateOfBirth = dob;
            isValidDOB = true;
        }
        if (eMail != null) {
            email = eMail;
            isValidEmail = true;
        }
        if (phone != 0) {
            mobileNumber = phone;
            isValidMobile = true;
        }
        if (pan != null) {
            panCard = pan;
            isValidPanCard = true;
        }

        if (isValidTitle    == true &&isValidSurname  == true &&isValidFirstName== true &&isValidMiddleName==true &&
            isValidDOB      == true &&isValidEmail    == true &&isValidMobile   == true &&isValidPanCard  == true) {

            isRegistrationUser = true;
        }

        return isRegistrationUser;
    }

    public static void getDetails() {
        System.out.println("Title "        + title);
        System.out.println("Surname "      + surname);
        System.out.println("First Name  "   + firstName);
        System.out.println("Middle Name  "  + middleName);
        System.out.println("Date of Birth  "+ dateOfBirth);
        System.out.println("Email "        + email);
        System.out.println("Mobile Number "+ mobileNumber);
        System.out.println("PAN Card "     + panCard);
    }
}
