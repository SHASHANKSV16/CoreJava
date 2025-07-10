class SamsungAccountRunner {
    public static void main(String[] args) {
        boolean user = SamsungAccount.registrationUser(null,"pass123","pass123","Yogi","Sharma");
        System.out.println("The user is registered: " + user);
        SamsungAccount.getDetails();

        System.out.println();

        boolean user1 = SamsungAccount.registrationUser("yogi@gmail.com","123asd","123asd","Yogi","Sharma");
        System.out.println("The user is registered: " + user1);
        SamsungAccount.getDetails();
    }
}