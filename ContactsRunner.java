class ContactsRunner{


 public static void main(String[] numbers){
 
 String contactName = "shehar";
 long contactNum = Contacts.getContactnumber(contactName);
 if(contactNum > 0)
 System.out.println("the number of " +contactName+ " is " + contactNum);
 
 
 }

}