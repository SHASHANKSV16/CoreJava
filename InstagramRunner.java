class InstagramRunner{

	public static void main(String[] insta){
	String eMailOrUserName = "sudeep54@gmail.com";
	String password = "sudeep123";
	long number = 9814571473l ;
	
	String msg = Instagram.login(eMailOrUserName,password);
	System.out.println(msg);
	
	msg = Instagram.login(number,password);
	System.out.println(msg);

	}

}