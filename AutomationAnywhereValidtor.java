class AutomationAnywhereValidtor{
	static String firstName;
    static String lastName;
    static String email;
    static String country;
    static String stateOrProvince;
    static String businessRole;
	public static boolean validator(String fName, String lName, String eMail, String nation, String state, String role){
	boolean isValidated = false;
	    boolean isValidFirstName = false;
        boolean isValidLastName = false;
        boolean isValidEmail = false;
        boolean isValidCountry = false;
        boolean isValidState = false;
        boolean isValidRole = false;

        if (fName != null) {
            firstName = fName;
            isValidFirstName = true;
        } else {
            System.out.println("Enter valid first name");
        }

        if (lName != null) {
            lastName = lName;
            isValidLastName = true;
        } else {
            System.out.println("Enter valid last name");
        }

        if (eMail != null) {
            email = eMail;
            isValidEmail = true;
        } else {
            System.out.println("Enter valid email");
        }

        if (nation != null) {
            country = nation;
            isValidCountry = true;
        } else {
            System.out.println("Enter valid country");
        }

        if (state != null) {
            stateOrProvince = state;
            isValidState = true;
        } else {
            System.out.println("Enter valid state/province");
        }

        if (role != null) {
            businessRole = role;
            isValidRole = true;
        } else {
            System.out.println("Enter valid business role");
        }

        if (isValidFirstName && isValidLastName && isValidEmail && isValidCountry && isValidState && isValidRole) {
            System.out.println("All registration details are valid");
            isValidated = true;
        }
	
	return isValidated;
	}
}