class IssueIdentification {
    public static void gatherInfo(String name, String problem, String productDetails) {
        System.out.println("complaint filed by " + name);
        System.out.println("the raeson is  " + problem);
        System.out.println("Product details  " + productDetails);
        SellerContact.contactSeller(name, productDetails, "hello stores");
    }
}