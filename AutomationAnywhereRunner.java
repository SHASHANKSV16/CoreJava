class AutomationAnywhereRunner {
    public static void main(String[] args) {
        boolean user = AutomationAnywhere.registrationUser(null,"Sharma","yogi@gmail.com",null,null,null );
        System.out.println("The user is registered: " + user);
        if(user)AutomationAnywhere.getDetails();

        System.out.println();

        boolean user1 = AutomationAnywhere.registrationUser("Yogi","Sharma","yogi@gmail.com","India","Karnataka","Developer" );
        System.out.println("The user is registered: " + user1);
        if(user1)AutomationAnywhere.getDetails();
    }
}