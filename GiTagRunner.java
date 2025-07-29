class GiTagRunner {
    public static void main(String[] tags) {

        GiTag firstTag = new GiTag(1, "Darjeeling Tea", "Agricultural", "West Bengal", "2004-05");
        firstTag.getData();

        GiTag secondTag = new GiTag(2, "Aranmula Kannadi");
        System.out.println("The GiId is " + secondTag.GiId);
        System.out.println("The name is " + secondTag.name);
        System.out.println();

        GiTag thirdTag = new GiTag("Kerala", "Handicraft");
        System.out.println("The state is " + thirdTag.state);
        System.out.println("The type is " + thirdTag.type);
        System.out.println();

        GiTag fourthTag = new GiTag("2004-05");
        System.out.println("The year is " + fourthTag.year);
        System.out.println();

        GiTag fifthTag = new GiTag();
        fifthTag.GiId = 5;
        fifthTag.name = "Pochampalli Ikat";
        fifthTag.type = "Handicraft";
        fifthTag.state = "Telangana";
        fifthTag.year = "2004–05";
        fifthTag.getData();
    }
}
