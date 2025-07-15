class NetflixRunner{

	public static void main(String[] fb){
	String eMail = "upendra63@gmail.com";
	String password = "uppi123";
	long number = 9841231473l ;
	
	String msg = Netflix.login(eMail,password);
	System.out.println(msg);
	
	msg = Netflix.login(number,password);
	System.out.println(msg);

	}

}