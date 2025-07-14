class PassPortSeva{
	
     static String givenName ;
	 static String surName ; 
	 static String password;
	 static String confirmPassword;
	 static String applyAt;
	 static String passPortOffice;
	 static String dateOfBirth;
	 static String emailId;
	 static int loginId;
	 static String hintQuestion;
	 static String hintAnswer;
	 static int captcha;
 
      public static boolean  registerUser(String gName , String sName,String pwd,String cPwd,String apply,String office,String dob,String mailId,int id,String questio,String answer){
                   
				   boolean isUserRegistered = false;
                   boolean givenNameValid = false;
			       boolean surNameValid  = false;
				   boolean passwordValid = false;
				   boolean confirmPasswordValid = false;
				   boolean applyAtValid = false;
				   boolean passPortOfficeValid = false;
				   boolean dateOfBirthValid = false;
				   boolean emailIdValid = false;
				   boolean loginIdValid = false;
				   boolean hintQuestionValid = false;
				   boolean hintAnswerValid = false;
				   
				   
		  if( gName != null){
			  givenName     =   gName  ; 
			  givenNameValid  = true ; 	       
		  }else System.out.println("provide valid given name...");	
		  
			if(sName != null){
				surName       = sName;
				surNameValid = true ; 
			}else System.out.println("provide valid surName ");
			
			if(pwd != null){
			password	= pwd;
			passwordValid = true;
			}else System.out.println("provide valid password");
			
			if(cPwd !=null && cPwd == pwd){
			confirmPassword	= cPwd;
			confirmPasswordValid = true;
			}else System.out.println("provide password and confirmPassword same");
			
			if(apply != null){
			applyAt	= apply;
			applyAtValid = true;
			}else{
				System.out.println("please enter correct option");
			} 
			
			if(office != null){
			passPortOffice	= office;
			passPortOfficeValid = true;
			} else System.out.println("enter valid office");
			
			if(dob != null){
			dateOfBirth	= dob;
			dateOfBirthValid = true;
			}else System.out.println("dateOfBirth is not valid");
			
			if(mailId != null){
			 emailId = mailId;
			 emailIdValid = true;
			}else System.out.println("emailId is not valid");
			
			if(id != 0){
				loginId = id;
				loginIdValid = true;
			}else System.out.println("loginId id not avaliability");
			
			if(questio != null){
			hintQuestion	= questio;
			hintQuestionValid = true;
			}else System.out.println("provide valid question");
			
			if(answer != null){
			hintAnswer	= answer;
			hintAnswerValid = true;
			}else System.out.println("provide valid answer");
			
			
				
			if(	 givenNameValid == true && surNameValid == true && passwordValid && confirmPasswordValid && applyAtValid && passPortOfficeValid && dateOfBirthValid && emailIdValid && loginIdValid && hintQuestionValid && hintAnswerValid ){
				System.out.println("the (givenName ,surName ,password ,confirmPassword,applyAt,passPortOffice,dateOefBirth,emailId,loginId,hintQuestion,hintAnswer,captcha)is Valid");
				isUserRegistered  = true;
			}			
	    return  isUserRegistered; 			
	  }
	  public static void getUserInfo(){
	   System.out.println("The given Name is :"+ givenName);
	   System.out.println ("The Sur Name is :"+ surName);
	   System.out.println ("The password is :"+ password);
	   System.out.println ("The confirmPassword is "+ confirmPassword);
	   System.out.println ("register to apply at :"+ applyAt);
	   System.out.println ("passPort Office is :"+ passPortOffice);
	   System.out.println ("Date Of Birthis :"+ dateOfBirth);
	   System.out.println ("The E mail ID is :"+ emailId);
	   System.out.println ("The login ID :"+ loginId);
	   System.out.println ("The hintQuestion is :"+ hintQuestion);
	   System.out.println ("The hintAnswer is :"+ hintAnswer);

	   
	   
	   }


}

