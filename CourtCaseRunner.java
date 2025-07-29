class CourtCaseRunner {
    public static void main(String[] court) {

        CourtCase firstCase = new CourtCase(1, "Property Dispute", "Open", 2021, "High Court");
        firstCase.getData();

        CourtCase secondCase = new CourtCase(2, "Cyber Complaint");
        System.out.println("The case id is " + secondCase.caseId);
        System.out.println("The case title is " + secondCase.caseTitle);
        System.out.println();

        CourtCase thirdCase = new CourtCase("Closed", 2020);
        System.out.println("The status is " + thirdCase.status);
        System.out.println("The year filed is " + thirdCase.yearFiled);
        System.out.println();

        CourtCase fourthCase = new CourtCase("Consumer Court");
        System.out.println("The court type is " + fourthCase.courtType);
        System.out.println();

        CourtCase fifthCase = new CourtCase();
        fifthCase.caseId = 5;
        fifthCase.caseTitle = "Employment Dispute";
        fifthCase.status = "Pending";
        fifthCase.yearFiled = 2024;
        fifthCase.courtType = "District Court";
        fifthCase.getData();
    }
}
