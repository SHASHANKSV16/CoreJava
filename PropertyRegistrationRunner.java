class PropertyRegistrationRunner {
    static String propertyAddress = "#40, 7th cross laggere";
    static String buyer = "Sindhu";
    static String seller = "Tejas";

    public static void main(String[] property) {
        System.out.println("Property registration process started");

        AddressCheck.verifyTitle(propertyAddress, seller);

        System.out.println("Property registration process completed");
    }
}










