class BlazerRunner {
    public static void main(String[] blazer) {
		
		String colours[] = {"blue","black","grey"};
        Blazer firstBlazer = new Blazer(1, colours, 2, 3, "cotton", "casuals");
        firstBlazer.getData();

        Blazer secondBlazer = new Blazer(2,  3);
         System.out.println("The blazer id is " + secondBlazer.blazerId);
        System.out.println("The buttons are  " + secondBlazer.noOfButtons);

        Blazer thirdBlazer = new Blazer();
        thirdBlazer.blazerId = 3;
        thirdBlazer.colourAvailable = colours;
        thirdBlazer.noOfPockets = 3;
        thirdBlazer.noOfButtons = 2;
        thirdBlazer.typeOfMaterial = "wool";
        thirdBlazer.type = "formals";
        thirdBlazer.getData();

        Blazer fourthBlazer = new Blazer("cotton", "formals");
		 System.out.println("The material is " + fourthBlazer.typeOfMaterial);
        System.out.println("The type of blazer is " + fourthBlazer.type);
       

        
    }
}
