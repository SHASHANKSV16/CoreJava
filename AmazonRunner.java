class AmazonRunner{

	public static void main(String[] amazon){
	String eMail = "shivaji63@gmail.com";
	String password = "shiva123";
	long number = 9874512460l ;
	
	String msg = Amazon.login(eMail,password);
	System.out.println(msg);
	
	msg = Amazon.login(number,password);
	System.out.println(msg);

	}

}