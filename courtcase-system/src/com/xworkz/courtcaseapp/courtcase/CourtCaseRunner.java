package com.xworkz.courtcaseapp.courtcase;

public class CourtCaseRunner {
    public static void main(String[] args) {
        CourtCase firstCase = new CourtCase(1, "Property Dispute", "Open", 2021, "High Court");
        firstCase.getData();

        CourtCase secondCase = new CourtCase(2, "Cyber Complaint", "Pending", 2023, "District Court");
        secondCase.getData();

    }
}
