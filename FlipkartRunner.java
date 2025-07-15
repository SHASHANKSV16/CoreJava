class FlipkartRunner{

	public static void main(String[] flipkart){
	String eMail = "naidu63@gmail.com";
	String password = "naidu123";
	long number = 9845722573l ;
	
	String msg = Flipkart.login(eMail,password);
	System.out.println(msg);
	
	msg = Flipkart.login(number,password);
	System.out.println(msg);

	}

}