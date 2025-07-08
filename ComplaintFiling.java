class ComplaintFiling {
    public static void fileComplaint(String name, String productDetails, int fee, String shopName) {
        System.out.println("Filing complaint against " +  shopName);
        System.out.println("the fees is " + fee);
        Verdict.receiveVerdict(name);
    }
}