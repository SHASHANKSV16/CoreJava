class AutomationAnywhere {
    static String firstName;
    static String lastName;
    static String email;
    static String country;
    static String stateOrProvince;
    static String businessRole;

    public static boolean registrationUser(String fName,String lName,String eMail,String nation,String state,String role ) {
        boolean isRegistered = false;

        boolean isValidFirstName = false;
        boolean isValidLastName = false;
        boolean isValidEmail = false;
        boolean isValidCountry = false;
        boolean isValidState = false;
        boolean isValidRole = false;

        if (fName != null) {
            firstName = fName;
            isValidFirstName = true;
        }
        if (lName != null) {
            lastName = lName;
            isValidLastName = true;
        }
        if (eMail != null) {
            email = eMail;
            isValidEmail = true;
        }
        if (nation != null) {
            country = nation;
            isValidCountry = true;
        }
        if (state != null) {
            stateOrProvince = state;
            isValidState = true;
        }
        if (role != null) {
            businessRole = role;
            isValidRole = true;
        }

        if (isValidFirstName == true &&isValidLastName == true &&isValidEmail == true &&isValidCountry == true &&isValidState == true &&isValidRole == true) {
			isRegistered = true;
        }

        return isRegistered;
    }

    public static void getDetails() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Country: " + country);
        System.out.println("State/Province: " + stateOrProvince);
        System.out.println("Business Role: " + businessRole);
    }
}
