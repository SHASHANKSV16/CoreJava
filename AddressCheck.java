class AddressCheck {
    public static void verifyTitle(String property, String seller) {
	 System.out.println("Seller name is " + seller);
        System.out.println("Verifying address of property" + property);
        AgreementDraft.prepareAgreement(property, PropertyRegistrationRunner.buyer, seller, 7500000);
    }
}