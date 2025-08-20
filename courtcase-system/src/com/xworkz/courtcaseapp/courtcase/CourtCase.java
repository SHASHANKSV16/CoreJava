package com.xworkz.courtcaseapp.courtcase;

public class CourtCase {
    int caseId;
    String caseTitle;
    String status;
    int yearFiled;
    String courtType;

    CourtCase(int caseId, String caseTitle, String status, int yearFiled, String courtType) {
        System.out.println("Parameterized constructor");
        this.caseId = caseId;
        this.caseTitle = caseTitle;
        this.status = status;
        this.yearFiled = yearFiled;
        this.courtType = courtType;
    }


    public void getData() {
        System.out.println("The case id is " + caseId);
        System.out.println("The case title is " + caseTitle);
        System.out.println("The status is " + status);
        System.out.println("The year filed is " + yearFiled);
        System.out.println("The court type is " + courtType);
        System.out.println();
    }
}
