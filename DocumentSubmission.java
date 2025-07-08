class DocumentSubmission {
    public static void submitDocuments(String buyer, String seller, String documents) {
        System.out.println("the documents submitted are " + documents);
        VerificationAndRegistration.verifyAndRegister(buyer, seller);
    }
}