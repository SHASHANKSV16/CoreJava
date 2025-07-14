class PostRunner {
    public static void main(String[] post) {
        boolean user = Post.registrationUser("Anita", "Desai", "bengaluru",
                "India", "karnataka", "bengaluru", 560025, "anitadesai@gmail.com", 9876543210L);

        System.out.println("User Registered: " + user);
        if (user) Post.getDetails();
		
		user = Post.registrationUser("Anita", null, null,
                "India", null, "bengaluru", 0, "anitadesai@gmail.com", 9876543210L);

        System.out.println("User Registered: " + user);
        if (user) Post.getDetails();
    }
}
