package com.xworkz.companyapp;

import com.xworkz.companyapp.company.Company;
import com.xworkz.companyapp.project.Project;

import java.util.Scanner;

public class CompanyRunner {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of projects to be add : ");
        int size = scanner.nextInt();
        Company company = new Company(size);
        System.out.println("the projects available are : "+company.projects.length);

        for (int index = 0; index<size; index++){
            Project project = new Project();

            System.out.println("the project Id :");
            project.setProjectId(scanner.nextInt());

            System.out.println("Enter project name :");
            project.setProjectName(scanner.next());

            System.out.println("Enter companyName :");
            project.setCompanyName(scanner.next());

            System.out.println("Enter no of members :");
            project.setNoOfMembers(scanner.nextInt());

            System.out.println("Enter no of devlopers :");
            project.setNoOfDeveloper(scanner.nextInt());

            company.addProject(project);
        }

        company.getAllProjectDetails();
    }
}
