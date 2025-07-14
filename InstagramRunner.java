class InstagramRunner{

 public static void main(String []Insta){
 boolean user = Instagram.registrationUser(null ,  "123asd" ,"yogi", "yogi_123" ,0);
 System.out.println("the user is registered"+ user);
 if(user)Instagram.getDetails();
  boolean user1 = Instagram.registrationUser("yogi@gmail.com" ,  "123asd" ,"yogi", "yogi_123" ,1234567890l);
 System.out.println("the user is registered"+ user1);
 if(user1)Instagram.getDetails();
 
 
 
 }



}