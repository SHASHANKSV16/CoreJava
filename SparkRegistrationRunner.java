class SparkRegistrationRunner {
    public static void main(String[] spark) {

        boolean user = SparkRegistration.registerUser("PEN123456", "Rahul Nair", "2000-07-15",123456789012L, 9876543210L, "spark@123", "spark@123");

        System.out.println("Registration Successful: " + user);
        if (user) {
            SparkRegistration.getDetails();
        }

        System.out.println();

        boolean user2 = SparkRegistration.registerUser("PEN123456", "Rahul Nair", null,0, 9876543210L, "spark@123", "spark@12");

        System.out.println("Registration Successful: " + user2);
        if (user2) {
            SparkRegistration.getDetails();
        }
    }
}
