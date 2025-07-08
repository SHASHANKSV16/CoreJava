class SellerContact {
    public static void contactSeller(String name, String productDetails , String shopName) {
        System.out.println("the shop name is " + shopName);
        ComplaintFiling.fileComplaint(name, productDetails, 1000, shopName);
    }
}