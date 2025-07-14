class BannerRunner {
    public static void main(String[] poster) {

        String msg = Banner.getMessage();
        System.out.println("Banner Message: " + msg);

        String color = Banner.getColor();
        System.out.println("Banner Color: " + color);

        int width = Banner.getWidth();
        System.out.println("Banner Width: " + width );

        int height = Banner.getHeight();
        System.out.println("Banner Height: " + height );

        boolean animated = Banner.getIsAnimated();
        System.out.println("Is Banner Animated " + animated);
    }
}
