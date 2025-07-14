class MakeUpKit {

    static String brandName;
    static int numberOfItems;
    static boolean hasMirror;
    static double price;
   

    public static String getBrand() {
        brandName = "Lakme";
        return brandName;
    }

    public static int getItemCount() {
        numberOfItems = 10;
        return numberOfItems;
    }

    public static boolean hasMirrorInside() {
        hasMirror = true;
        return hasMirror;
    }

    public static double getPrice() {
        price = 1999.99;
        return price;
    }

   
}
