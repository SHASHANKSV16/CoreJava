class PostValidator{
	static String firstName;
    static String lastName;
    static String address;
    static String country;
    static String state;
    static String cityOrDistrict;
    static int pincode;
    static String email;
    static long mobile;
public static boolean validateUser(String fName, String lName, String addr, String nation, String stateName, String city,int pin, String eMail, long phone){
		boolean isValidated = false;
		boolean isValidFirstName = false;
        boolean isValidLastName = false;
        boolean isValidAddress = false;
        boolean isValidCountry = false;
        boolean isValidState = false;
        boolean isValidCity = false;
        boolean isValidPincode = false;
        boolean isValidEmail = false;
        boolean isValidMobile = false;

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

        if (addr != null) {
            address = addr;
            isValidAddress = true;
        } else {
            System.out.println("Enter valid address");
        }

        if (nation != null) {
            country = nation;
            isValidCountry = true;
        } else {
            System.out.println("Enter valid country");
        }

        if (stateName != null) {
            state = stateName;
            isValidState = true;
        } else {
            System.out.println("Enter valid state");
        }

        if (city != null) {
            cityOrDistrict = city;
            isValidCity = true;
        } else {
            System.out.println("Enter valid city/district");
        }

        if (pin > 0) {
            pincode = pin;
            isValidPincode = true;
        } else {
            System.out.println("Enter valid pincode");
        }

        if (eMail != null) {
            email = eMail;
            isValidEmail = true;
        } else {
            System.out.println("Enter valid email");
        }

        if (phone > 0) {
            mobile = phone;
            isValidMobile = true;
        } else {
            System.out.println("Enter valid mobile number");
        }

        if (isValidFirstName && isValidLastName && isValidAddress &&
            isValidCountry && isValidState && isValidCity &&
            isValidPincode && isValidEmail && isValidMobile) {

            System.out.println("All user profile details are valid");
            isValidated = true;
        }
		return isValidated;

}


}