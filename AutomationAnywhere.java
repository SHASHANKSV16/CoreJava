class AutomationAnywhere {

    static String firstName;
    static String lastName;
    static String email;
    static String country;
    static String stateOrProvince;
    static String businessRole;

    public static boolean registrationUser(String fName, String lName, String eMail, String nation, String state, String role) {

        boolean isRegistered = false;
        // boolean isValidFirstName = false;
        // boolean isValidLastName = false;
        // boolean isValidEmail = false;
        // boolean isValidCountry = false;
        // boolean isValidState = false;
        // boolean isValidRole = false;

        // if (fName != null) {
            // firstName = fName;
            // isValidFirstName = true;
        // } else {
            // System.out.println("Enter valid first name");
        // }

        // if (lName != null) {
            // lastName = lName;
            // isValidLastName = true;
        // } else {
            // System.out.println("Enter valid last name");
        // }

        // if (eMail != null) {
            // email = eMail;
            // isValidEmail = true;
        // } else {
            // System.out.println("Enter valid email");
        // }

        // if (nation != null) {
            // country = nation;
            // isValidCountry = true;
        // } else {
            // System.out.println("Enter valid country");
        // }

        // if (state != null) {
            // stateOrProvince = state;
            // isValidState = true;
        // } else {
            // System.out.println("Enter valid state/province");
        // }

        // if (role != null) {
            // businessRole = role;
            // isValidRole = true;
        // } else {
            // System.out.println("Enter valid business role");
        // }

        // if (isValidFirstName && isValidLastName && isValidEmail && isValidCountry && isValidState && isValidRole) {
            // System.out.println("All registration details are valid");
            // isRegistered = true;
        // }
 boolean isVaild = AutomationAnywhereValidtor.validator(fName, lName, eMail, nation, state, role);
		if(isVaild) 
			isRegistered = true;
		else
			System.out.println("data is not validated");
        return isRegistered;
    }

    public static void getDetails() {
		
	firstName = AutomationAnywhereValidtor.firstName;
    lastName = AutomationAnywhereValidtor.lastName;
    email =  AutomationAnywhereValidtor.email;
    country = AutomationAnywhereValidtor.country;
    stateOrProvince = AutomationAnywhereValidtor.stateOrProvince;
    businessRole = AutomationAnywhereValidtor.businessRole;
		
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Country: " + country);
        System.out.println("State/Province: " + stateOrProvince);
        System.out.println("Business Role: " + businessRole);
    }
}
