class CountryRunner{


 public static void main(String[] code){
 
 String countryName = "Antarctica";
 int countryCode = Country.getCountryCode(countryName);
 if(countryCode > 0)
 System.out.println("the code of the " +countryName+ " is " + countryCode);
 
 
 }

}