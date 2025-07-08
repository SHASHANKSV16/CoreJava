class ConsumerComplaintRunner {
    static String consumer = "bhushan";
    static String issue = "Shopkeeper selling the  item above MRP";
    static String product = "lays - MRP 20, Sold for 30";

    public static void main(String[] stores) {
        System.out.println("Consumer complaint process started");

        IssueIdentification.gatherInfo(consumer, issue, product);

        System.out.println("Consumer complaint process completed");
    }
}
