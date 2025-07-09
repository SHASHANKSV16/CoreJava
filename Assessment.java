class Assessment {
    public static void takeLaptop(String user, String model) {
	System.out.println("user name is "+ user);
	System.out.println("Laptop model is " + model);
        System.out.println("Assessing user needs for " + user);
        
        InitialSetup.configureLaptop(user, model, "Windows 11 ");
    }
}