class FacebookRunner {
    public static void main(String[] fb) {
        boolean user = Facebook.registrationUser(null, "Sharma", "01-01-2000", "Male", 0L, null, "pass123");
        System.out.println("The user is registered: " + user);
        Facebook.getDetails();

        boolean user1 = Facebook.registrationUser("Yogi", "Sharma", "01-01-2000", "Male", 9876543210L, "yogi@gmail.com", "123asd");
        System.out.println("The user is registered: " + user1);
        Facebook.getDetails();
    }
}
