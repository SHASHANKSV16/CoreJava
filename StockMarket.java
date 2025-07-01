class StockMarket {
    public static void main(String market[]) {

        String stockNames[] = { "TCS", "Infosys", "Reliance", "HDFC Bank", "Wipro", "HCL Tech",
		"ICICI Bank", "Kotak Bank", "SBI", "Bajaj Finance" };

        System.out.println(stockNames[0]);
        System.out.println(stockNames[1]);
        System.out.println(stockNames[2]);
        System.out.println(stockNames[3]);
        System.out.println(stockNames[4]);
        System.out.println(stockNames[5]);
        System.out.println(stockNames[6]);
        System.out.println(stockNames[7]);
        System.out.println(stockNames[8]);
        System.out.println(stockNames[9]);

        for (String stock : stockNames) {
            System.out.println(stock);
        }
    }
}
