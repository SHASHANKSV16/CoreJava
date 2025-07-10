class PANRunner {
    public static void main(String[] card) {
        boolean user = PAN.registrationUser(null,"Sharma","Yogi","Kumar","01-01-2000",null,0L,null);
        System.out.println("The user is registered: " + user);
        PAN.getDetails();

        System.out.println();

        boolean user1 = PAN.registrationUser("Shri","Sharma","Yogi","Kumar","01-01-2000","yogi@gmail.com",9876543210L,"ABCDE1234F");
        System.out.println("The user is registered: " + user1);
        PAN.getDetails();
    }
}