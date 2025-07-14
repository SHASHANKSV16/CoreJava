class PassPortSevaRunner{
     public static void main(String seva[]){
	    
		boolean userIsRegistered =   PassPortSeva.registerUser("pooja","hegde","Poojahegde@123","Poojahegde@123","passPortOffice","mangluru","04/03/1992","Poojahegde@gmail.com",203,"Fav colour","Blue");
	     System.out.println("Is USer Registered "+ userIsRegistered);
		 
		     if(userIsRegistered) PassPortSeva.getUserInfo();
	}
}