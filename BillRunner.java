class BillRunner{

	public static void main(String[] bills ){
	
		System.out.println("main started");
		
		Bill firstBill	= new Bill();
		firstBill.billId = 1;
		firstBill.planType= "monthly plan";
		firstBill.billAmountWithTax= 250.00;
		firstBill.billIssueDate="14/02/2025";
		firstBill.paymentMethod = "upi";
		firstBill.billDueDate = "15/03/2025";
		firstBill.isTaxInclusive = true;
		firstBill.isBillPaid = false;
		firstBill.isBillOverDue = true;
		
		System.out.println("the bill id is " +firstBill.billId);
		System.out.println("the plan type is " + firstBill.planType);
		System.out.println("the billAmount With Tax is "+ firstBill.billAmountWithTax);
		System.out.println("the issue date is "+ firstBill.billIssueDate);
		System.out.println("the paymentMethod is " + firstBill.paymentMethod);
		System.out.println("the due date is " + firstBill.billDueDate);
		System.out.println("is  tax included " + firstBill.isTaxInclusive);
		System.out.println("is bill paid "+ firstBill.isBillPaid);
		System.out.println("is bill over due " + firstBill.isBillOverDue);
		System.out.println("");
		
		Bill secondBill = new Bill();
		secondBill.billId = 2;
		secondBill.planType = "yearly plan";
		secondBill.billAmountWithTax = 1200.00;
		secondBill.billIssueDate = "01/01/2025";
		secondBill.paymentMethod = "credit card";
		secondBill.billDueDate = "01/01/2026";
		secondBill.isTaxInclusive = true;
		secondBill.isBillPaid = true;
		secondBill.isBillOverDue = false;
		
		System.out.println("the bill id is " + secondBill.billId);
		System.out.println("the plan type is " + secondBill.planType);
		System.out.println("the billAmount With Tax is " + secondBill.billAmountWithTax);
		System.out.println("the issue date is " + secondBill.billIssueDate);
		System.out.println("the paymentMethod is " + secondBill.paymentMethod);
		System.out.println("the due date is " + secondBill.billDueDate);
		System.out.println("is tax included " + secondBill.isTaxInclusive);
		System.out.println("is bill paid " + secondBill.isBillPaid);
		System.out.println("is bill over due " + secondBill.isBillOverDue);
		System.out.println();
		
		Bill thirdBill = new Bill();
		thirdBill.billId = 3;
		thirdBill.planType = "weekly plan";
		thirdBill.billAmountWithTax = 99.99;
		thirdBill.billIssueDate = "07/03/2025";
		thirdBill.paymentMethod = "debit card";
		thirdBill.billDueDate = "14/03/2025";
		thirdBill.isTaxInclusive = false;
		thirdBill.isBillPaid = true;
		thirdBill.isBillOverDue = false;
		
		System.out.println("the bill id is " + thirdBill.billId);
		System.out.println("the plan type is " + thirdBill.planType);
		System.out.println("the billAmount With Tax is " + thirdBill.billAmountWithTax);
		System.out.println("the issue date is " + thirdBill.billIssueDate);
		System.out.println("the paymentMethod is " + thirdBill.paymentMethod);
		System.out.println("the due date is " + thirdBill.billDueDate);
		System.out.println("is tax included " + thirdBill.isTaxInclusive);
		System.out.println("is bill paid " + thirdBill.isBillPaid);
		System.out.println("is bill over due " + thirdBill.isBillOverDue);
		System.out.println();
		
		Bill fourthBill = new Bill();
		fourthBill.billId = 4;
		fourthBill.planType = "quarterly plan";
		fourthBill.billAmountWithTax = 450.75;
		fourthBill.billIssueDate = "10/04/2025";
		fourthBill.paymentMethod = "net banking";
		fourthBill.billDueDate = "10/07/2025";
		fourthBill.isTaxInclusive = true;
		fourthBill.isBillPaid = false;
		fourthBill.isBillOverDue = false;
		
		System.out.println("the bill id is " + fourthBill.billId);
		System.out.println("the plan type is " + fourthBill.planType);
		System.out.println("the billAmount With Tax is " + fourthBill.billAmountWithTax);
		System.out.println("the issue date is " + fourthBill.billIssueDate);
		System.out.println("the paymentMethod is " + fourthBill.paymentMethod);
		System.out.println("the due date is " + fourthBill.billDueDate);
		System.out.println("is tax included " + fourthBill.isTaxInclusive);
		System.out.println("is bill paid " + fourthBill.isBillPaid);
		System.out.println("is bill over due " + fourthBill.isBillOverDue);
		System.out.println();
		
		Bill fifthBill = new Bill();
		fifthBill.billId = 5;
		fifthBill.planType = "monthly plan";
		fifthBill.billAmountWithTax = 320.50;
		fifthBill.billIssueDate = "18/05/2025";
		fifthBill.paymentMethod = "upi";
		fifthBill.billDueDate = "18/06/2025";
		fifthBill.isTaxInclusive = false;
		fifthBill.isBillPaid = true;
		fifthBill.isBillOverDue = false;
		
		System.out.println("the bill id is " + fifthBill.billId);
		System.out.println("the plan type is " + fifthBill.planType);
		System.out.println("the billAmount With Tax is " + fifthBill.billAmountWithTax);
		System.out.println("the issue date is " + fifthBill.billIssueDate);
		System.out.println("the paymentMethod is " + fifthBill.paymentMethod);
		System.out.println("the due date is " + fifthBill.billDueDate);
		System.out.println("is tax included " + fifthBill.isTaxInclusive);
		System.out.println("is bill paid " + fifthBill.isBillPaid);
		System.out.println("is bill over due " + fifthBill.isBillOverDue);
		System.out.println();
		
		
		Bill sixthBill = new Bill();
		sixthBill.billId = 6;
		sixthBill.planType = "yearly plan";
		sixthBill.billAmountWithTax = 1350.90;
		sixthBill.billIssueDate = "01/06/2025";
		sixthBill.paymentMethod = "cash";
		sixthBill.billDueDate = "01/06/2026";
		sixthBill.isTaxInclusive = true;
		sixthBill.isBillPaid = true;
		sixthBill.isBillOverDue = false;
		
		System.out.println("the bill id is " + sixthBill.billId);
		System.out.println("the plan type is " + sixthBill.planType);
		System.out.println("the billAmount With Tax is " + sixthBill.billAmountWithTax);
		System.out.println("the issue date is " + sixthBill.billIssueDate);
		System.out.println("the paymentMethod is " + sixthBill.paymentMethod);
		System.out.println("the due date is " + sixthBill.billDueDate);
		System.out.println("is tax included " + sixthBill.isTaxInclusive);
		System.out.println("is bill paid " + sixthBill.isBillPaid);
		System.out.println("is bill over due " + sixthBill.isBillOverDue);
		System.out.println();

		Bill seventhBill = new Bill();
		seventhBill.billId = 7;
		seventhBill.planType = "monthly plan";
		seventhBill.billAmountWithTax = 215.75;
		seventhBill.billIssueDate = "12/07/2025";
		seventhBill.paymentMethod = "upi";
		seventhBill.billDueDate = "12/08/2025";
		seventhBill.isTaxInclusive = false;
		seventhBill.isBillPaid = false;
		seventhBill.isBillOverDue = true;
		
		System.out.println("the bill id is " + seventhBill.billId);
		System.out.println("the plan type is " + seventhBill.planType);
		System.out.println("the billAmount With Tax is " + seventhBill.billAmountWithTax);
		System.out.println("the issue date is " + seventhBill.billIssueDate);
		System.out.println("the paymentMethod is " + seventhBill.paymentMethod);
		System.out.println("the due date is " + seventhBill.billDueDate);
		System.out.println("is tax included " + seventhBill.isTaxInclusive);
		System.out.println("is bill paid " + seventhBill.isBillPaid);
		System.out.println("is bill over due " + seventhBill.isBillOverDue);
		System.out.println();
		
		Bill eighthBill = new Bill();
		eighthBill.billId = 8;
		eighthBill.planType = "quarterly plan";
		eighthBill.billAmountWithTax = 599.99;
		eighthBill.billIssueDate = "01/03/2025";
		eighthBill.paymentMethod = "net banking";
		eighthBill.billDueDate = "01/06/2025";
		eighthBill.isTaxInclusive = true;
		eighthBill.isBillPaid = true;
		eighthBill.isBillOverDue = false;
		
		System.out.println("the bill id is " + eighthBill.billId);
		System.out.println("the plan type is " + eighthBill.planType);
		System.out.println("the billAmount With Tax is " + eighthBill.billAmountWithTax);
		System.out.println("the issue date is " + eighthBill.billIssueDate);
		System.out.println("the paymentMethod is " + eighthBill.paymentMethod);
		System.out.println("the due date is " + eighthBill.billDueDate);
		System.out.println("is tax included " + eighthBill.isTaxInclusive);
		System.out.println("is bill paid " + eighthBill.isBillPaid);
		System.out.println("is bill over due " + eighthBill.isBillOverDue);
		System.out.println();
		
		Bill ninthBill = new Bill();
		ninthBill.billId = 9;
		ninthBill.planType = "weekly plan";
		ninthBill.billAmountWithTax = 75.00;
		ninthBill.billIssueDate = "22/02/2025";
		ninthBill.paymentMethod = "credit card";
		ninthBill.billDueDate = "27/02/2025";
		ninthBill.isTaxInclusive = false;
		ninthBill.isBillPaid = false;
		ninthBill.isBillOverDue = true;
		
		System.out.println("the bill id is " + ninthBill.billId);
		System.out.println("the plan type is " + ninthBill.planType);
		System.out.println("the billAmount With Tax is " + ninthBill.billAmountWithTax);
		System.out.println("the issue date is " + ninthBill.billIssueDate);
		System.out.println("the paymentMethod is " + ninthBill.paymentMethod);
		System.out.println("the due date is " + ninthBill.billDueDate);
		System.out.println("is tax included " + ninthBill.isTaxInclusive);
		System.out.println("is bill paid " + ninthBill.isBillPaid);
		System.out.println("is bill over due " + ninthBill.isBillOverDue);
		System.out.println();
		
		Bill tenthBill = new Bill();
		tenthBill.billId = 10;
		tenthBill.planType = "monthly plan";
		tenthBill.billAmountWithTax = 299.99;
		tenthBill.billIssueDate = "15/04/2025";
		tenthBill.paymentMethod = "upi";
		tenthBill.billDueDate = "15/05/2025";
		tenthBill.isTaxInclusive = true;
		tenthBill.isBillPaid = false;
		tenthBill.isBillOverDue = false;
		
		System.out.println("the bill id is " + tenthBill.billId);
		System.out.println("the plan type is " + tenthBill.planType);
		System.out.println("the billAmount With Tax is " + tenthBill.billAmountWithTax);
		System.out.println("the issue date is " + tenthBill.billIssueDate);
		System.out.println("the paymentMethod is " + tenthBill.paymentMethod);
		System.out.println("the due date is " + tenthBill.billDueDate);
		System.out.println("is tax included " + tenthBill.isTaxInclusive);
		System.out.println("is bill paid " + tenthBill.isBillPaid);
		System.out.println("is bill over due " + tenthBill.isBillOverDue);
		System.out.println();
		
		Bill eleventhBill = new Bill();
		eleventhBill.billId = 11;
		eleventhBill.planType = "yearly plan";
		eleventhBill.billAmountWithTax = 1800.00;
		eleventhBill.billIssueDate = "01/05/2025";
		eleventhBill.paymentMethod = "credit card";
		eleventhBill.billDueDate = "01/05/2026";
		eleventhBill.isTaxInclusive = true;
		eleventhBill.isBillPaid = true;
		eleventhBill.isBillOverDue = false;
		
		System.out.println("the bill id is " + eleventhBill.billId);
		System.out.println("the plan type is " + eleventhBill.planType);
		System.out.println("the billAmount With Tax is " + eleventhBill.billAmountWithTax);
		System.out.println("the issue date is " + eleventhBill.billIssueDate);
		System.out.println("the paymentMethod is " + eleventhBill.paymentMethod);
		System.out.println("the due date is " + eleventhBill.billDueDate);
		System.out.println("is tax included " + eleventhBill.isTaxInclusive);
		System.out.println("is bill paid " + eleventhBill.isBillPaid);
		System.out.println("is bill over due " + eleventhBill.isBillOverDue);
		System.out.println();
		
		Bill twelthBill = new Bill();
		twelthBill.billId = 12;
		twelthBill.planType = "weekly plan";
		twelthBill.billAmountWithTax = 89.49;
		twelthBill.billIssueDate = "05/06/2025";
		twelthBill.paymentMethod = "net banking";
		twelthBill.billDueDate = "12/06/2025";
		twelthBill.isTaxInclusive = false;
		twelthBill.isBillPaid = false;
		twelthBill.isBillOverDue = true;
		
		System.out.println("the bill id is " + twelthBill.billId);
		System.out.println("the plan type is " + twelthBill.planType);
		System.out.println("the billAmount With Tax is " + twelthBill.billAmountWithTax);
		System.out.println("the issue date is " + twelthBill.billIssueDate);
		System.out.println("the paymentMethod is " + twelthBill.paymentMethod);
		System.out.println("the due date is " + twelthBill.billDueDate);
		System.out.println("is tax included " + twelthBill.isTaxInclusive);
		System.out.println("is bill paid " + twelthBill.isBillPaid);
		System.out.println("is bill over due " + twelthBill.isBillOverDue);
		System.out.println();
		
		Bill thirteenthBill = new Bill();
		thirteenthBill.billId = 13;
		thirteenthBill.planType = "quarterly plan";
		thirteenthBill.billAmountWithTax = 620.00;
		thirteenthBill.billIssueDate = "10/07/2025";
		thirteenthBill.paymentMethod = "cash";
		thirteenthBill.billDueDate = "10/10/2025";
		thirteenthBill.isTaxInclusive = true;
		thirteenthBill.isBillPaid = true;
		thirteenthBill.isBillOverDue = false;
		
		System.out.println("the bill id is " + thirteenthBill.billId);
		System.out.println("the plan type is " + thirteenthBill.planType);
		System.out.println("the billAmount With Tax is " + thirteenthBill.billAmountWithTax);
		System.out.println("the issue date is " + thirteenthBill.billIssueDate);
		System.out.println("the paymentMethod is " + thirteenthBill.paymentMethod);
		System.out.println("the due date is " + thirteenthBill.billDueDate);
		System.out.println("is tax included " + thirteenthBill.isTaxInclusive);
		System.out.println("is bill paid " + thirteenthBill.isBillPaid);
		System.out.println("is bill over due " + thirteenthBill.isBillOverDue);
		System.out.println();
		
		Bill fourteenthBill = new Bill();
		fourteenthBill.billId = 14;
		fourteenthBill.planType = "monthly plan";
		fourteenthBill.billAmountWithTax = 275.75;
		fourteenthBill.billIssueDate = "21/03/2025";
		fourteenthBill.paymentMethod = "upi";
		fourteenthBill.billDueDate = "21/04/2025";
		fourteenthBill.isTaxInclusive = true;
		fourteenthBill.isBillPaid = false;
		fourteenthBill.isBillOverDue = true;
		
		System.out.println("the bill id is " + fourteenthBill.billId);
		System.out.println("the plan type is " + fourteenthBill.planType);
		System.out.println("the billAmount With Tax is " + fourteenthBill.billAmountWithTax);
		System.out.println("the issue date is " + fourteenthBill.billIssueDate);
		System.out.println("the paymentMethod is " + fourteenthBill.paymentMethod);
		System.out.println("the due date is " + fourteenthBill.billDueDate);
		System.out.println("is tax included " + fourteenthBill.isTaxInclusive);
		System.out.println("is bill paid " + fourteenthBill.isBillPaid);
		System.out.println("is bill over due " + fourteenthBill.isBillOverDue);
		System.out.println();
				
		Bill fifteenthBill = new Bill();
		fifteenthBill.billId = 15;
		fifteenthBill.planType = "weekly plan";
		fifteenthBill.billAmountWithTax = 60.00;
		fifteenthBill.billIssueDate = "08/08/2025";
		fifteenthBill.paymentMethod = "debit card";
		fifteenthBill.billDueDate = "15/08/2025";
		fifteenthBill.isTaxInclusive = false;
		fifteenthBill.isBillPaid = true;
		fifteenthBill.isBillOverDue = false;
		
		System.out.println("the bill id is " + fifteenthBill.billId);
		System.out.println("the plan type is " + fifteenthBill.planType);
		System.out.println("the billAmount With Tax is " + fifteenthBill.billAmountWithTax);
		System.out.println("the issue date is " + fifteenthBill.billIssueDate);
		System.out.println("the paymentMethod is " + fifteenthBill.paymentMethod);
		System.out.println("the due date is " + fifteenthBill.billDueDate);
		System.out.println("is tax included " + fifteenthBill.isTaxInclusive);
		System.out.println("is bill paid " + fifteenthBill.isBillPaid);
		System.out.println("is bill over due " + fifteenthBill.isBillOverDue);
		System.out.println();
		
		Bill sixteenthBill = new Bill();
		sixteenthBill.billId = 16;
		sixteenthBill.planType = "monthly plan";
		sixteenthBill.billAmountWithTax = 345.00;
		sixteenthBill.billIssueDate = "10/09/2025";
		sixteenthBill.paymentMethod = "upi";
		sixteenthBill.billDueDate = "10/10/2025";
		sixteenthBill.isTaxInclusive = true;
		sixteenthBill.isBillPaid = true;
		sixteenthBill.isBillOverDue = false;
		
		System.out.println("the bill id is " + sixteenthBill.billId);
		System.out.println("the plan type is " + sixteenthBill.planType);
		System.out.println("the billAmount With Tax is " + sixteenthBill.billAmountWithTax);
		System.out.println("the issue date is " + sixteenthBill.billIssueDate);
		System.out.println("the paymentMethod is " + sixteenthBill.paymentMethod);
		System.out.println("the due date is " + sixteenthBill.billDueDate);
		System.out.println("is tax included " + sixteenthBill.isTaxInclusive);
		System.out.println("is bill paid " + sixteenthBill.isBillPaid);
		System.out.println("is bill over due " + sixteenthBill.isBillOverDue);
		System.out.println();
		
		Bill seventeenthBill = new Bill();
		seventeenthBill.billId = 17;
		seventeenthBill.planType = "quarterly plan";
		seventeenthBill.billAmountWithTax = 675.45;
		seventeenthBill.billIssueDate = "15/10/2025";
		seventeenthBill.paymentMethod = "credit card";
		seventeenthBill.billDueDate = "15/01/2026";
		seventeenthBill.isTaxInclusive = false;
		seventeenthBill.isBillPaid = false;
		seventeenthBill.isBillOverDue = true;
		
		System.out.println("the bill id is " + seventeenthBill.billId);
		System.out.println("the plan type is " + seventeenthBill.planType);
		System.out.println("the billAmount With Tax is " + seventeenthBill.billAmountWithTax);
		System.out.println("the issue date is " + seventeenthBill.billIssueDate);
		System.out.println("the paymentMethod is " + seventeenthBill.paymentMethod);
		System.out.println("the due date is " + seventeenthBill.billDueDate);
		System.out.println("is tax included " + seventeenthBill.isTaxInclusive);
		System.out.println("is bill paid " + seventeenthBill.isBillPaid);
		System.out.println("is bill over due " + seventeenthBill.isBillOverDue);
		System.out.println();
		
		Bill eighteenthBill = new Bill();
		eighteenthBill.billId = 18;
		eighteenthBill.planType = "monthly plan";
		eighteenthBill.billAmountWithTax = 300.00;
		eighteenthBill.billIssueDate = "20/11/2025";
		eighteenthBill.paymentMethod = "net banking";
		eighteenthBill.billDueDate = "20/12/2025";
		eighteenthBill.isTaxInclusive = true;
		eighteenthBill.isBillPaid = true;
		eighteenthBill.isBillOverDue = false;
		
		System.out.println("the bill id is " + eighteenthBill.billId);
		System.out.println("the plan type is " + eighteenthBill.planType);
		System.out.println("the billAmount With Tax is " + eighteenthBill.billAmountWithTax);
		System.out.println("the issue date is " + eighteenthBill.billIssueDate);
		System.out.println("the paymentMethod is " + eighteenthBill.paymentMethod);
		System.out.println("the due date is " + eighteenthBill.billDueDate);
		System.out.println("is tax included " + eighteenthBill.isTaxInclusive);
		System.out.println("is bill paid " + eighteenthBill.isBillPaid);
		System.out.println("is bill over due " + eighteenthBill.isBillOverDue);
		System.out.println();
		
		Bill nineteenthBill = new Bill();
		nineteenthBill.billId = 19;
		nineteenthBill.planType = "yearly plan";
		nineteenthBill.billAmountWithTax = 1500.00;
		nineteenthBill.billIssueDate = "01/12/2025";
		nineteenthBill.paymentMethod = "upi";
		nineteenthBill.billDueDate = "01/12/2026";
		nineteenthBill.isTaxInclusive = false;
		nineteenthBill.isBillPaid = false;
		nineteenthBill.isBillOverDue = true;
		
		System.out.println("the bill id is " + nineteenthBill.billId);
		System.out.println("the plan type is " + nineteenthBill.planType);
		System.out.println("the billAmount With Tax is " + nineteenthBill.billAmountWithTax);
		System.out.println("the issue date is " + nineteenthBill.billIssueDate);
		System.out.println("the paymentMethod is " + nineteenthBill.paymentMethod);
		System.out.println("the due date is " + nineteenthBill.billDueDate);
		System.out.println("is tax included " + nineteenthBill.isTaxInclusive);
		System.out.println("is bill paid " + nineteenthBill.isBillPaid);
		System.out.println("is bill over due " + nineteenthBill.isBillOverDue);
		System.out.println();
		
		Bill twentiethBill = new Bill();
		twentiethBill.billId = 20;
		twentiethBill.planType = "weekly plan";
		twentiethBill.billAmountWithTax = 85.25;
		twentiethBill.billIssueDate = "27/12/2025";
		twentiethBill.paymentMethod = "debit card";
		twentiethBill.billDueDate = "03/01/2026";
		twentiethBill.isTaxInclusive = true;
		twentiethBill.isBillPaid = true;
		twentiethBill.isBillOverDue = false;
		
		System.out.println("the bill id is " + twentiethBill.billId);
		System.out.println("the plan type is " + twentiethBill.planType);
		System.out.println("the billAmount With Tax is " + twentiethBill.billAmountWithTax);
		System.out.println("the issue date is " + twentiethBill.billIssueDate);
		System.out.println("the paymentMethod is " + twentiethBill.paymentMethod);
		System.out.println("the due date is " + twentiethBill.billDueDate);
		System.out.println("is tax included " + twentiethBill.isTaxInclusive);
		System.out.println("is bill paid " + twentiethBill.isBillPaid);
		System.out.println("is bill over due " + twentiethBill.isBillOverDue);
		System.out.println();
				
		System.out.println("main ended");
	
	}

}