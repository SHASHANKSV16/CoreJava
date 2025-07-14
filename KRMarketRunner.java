class KRMarketRunner {
    public static void main(String[] market) {

        String location = KRMarket.getLocation();
        System.out.println("KR Market is located at: " + location);

        int shops = KRMarket.getNumberOfShops();
        System.out.println("Number of Shops: " + shops);

        boolean crowded = KRMarket.isItCrowded();
        System.out.println("Is it crowded? " + crowded);

        String famous = KRMarket.getFamousFor();
        System.out.println("Famous for: " + famous);

        String opening = KRMarket.getOpeningTime();
        System.out.println("Opens at  " + opening);
    }
}
