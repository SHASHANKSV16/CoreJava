class FacebookRunner{

	public static void main(String[] fb){
	String eMail = "prabhas63@gmail.com";
	String password = "prabhas123";
	long number = 9845721473l ;
	
	String msg = Facebook.login(eMail,password);
	System.out.println(msg);
	
	msg = Facebook.login(number,password);
	System.out.println(msg);

	}

}