package com.xworkz.companyapp;

import com.xworkz.companyapp.company.Company;
import com.xworkz.companyapp.constants.CompanyName;
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

            System.out.println("Enter companyName from TCS, INFOSYS, WIPRO,ACCENTURE,COGNIZANT:");
            project.setCompanyName(CompanyName.valueOf(scanner.next().toUpperCase()));

            System.out.println("Enter no of members :");
            project.setNoOfMembers(scanner.nextInt());

            System.out.println("Enter no of devlopers :");
            project.setNoOfDeveloper(scanner.nextInt());

            company.addProject(project);
        }

        company.getAllProjectDetails();


        System.out.println("want to get Company Name by projectID :yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter project Id ");
            System.out.println("the CompanyName of project is  "+company.getCompanyNameByProjectId(scanner.nextInt()));
        }
        System.out.println("want to get Company Name by project Name :yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter project name ");
            System.out.println("the CompanyName of project is  "+company.getCompanyNameByProjectName(scanner.next()));
        }
        System.out.println("want to get Project id  by project Name :yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter project name ");
            System.out.println("the Id of project is  "+company.getProjectIdByProjectName(scanner.next()));
        }
        System.out.println("want to get project Name by projectID :yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter project Id ");
            System.out.println("the name of project is  "+company.getProjectNameByProjectId(scanner.nextInt()));
        }
        System.out.println("want to get no of members by projectID :yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter project Id ");
            System.out.println("the members of project is  "+company.getNoOfMembersByProjectId(scanner.nextInt()));
        }
        System.out.println("want to get no of members by project Name :yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter project name ");
            System.out.println("the members of project is  "+company.getNoOfMembersByProjectName(scanner.next()));
        }
        System.out.println("want to get no of developers by project Name :yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter project name ");
            System.out.println("the developers of project is  "+company.getNoOfDeveloperByProjectName(scanner.next()));
        }
        System.out.println("want to get no of developers by projectID :yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter project Id ");
            System.out.println("the CompanyName of project is  "+company.getNoOfDeveloperByProjectId(scanner.nextInt()));
        }

        System.out.println("want to update Company name by project id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter project id");
            int projectId = scanner.nextInt();
            System.out.println("enter new CompanyName from TCS, INFOSYS, WIPRO, ACCENTURE, COGNIZANT");
            CompanyName companyName = CompanyName.valueOf(scanner.next().toUpperCase());
            if(company.updateCompanyNameByProjectId(projectId, companyName))
                company.getAllProjectDetails();
            else
                System.out.println("Company name not updated");
        }
        System.out.println("want to update Company name by project name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter project name");
            String projectName = scanner.next();
            System.out.println("enter new CompanyName from TCS, INFOSYS, WIPRO, ACCENTURE, COGNIZANT");
            CompanyName companyName = CompanyName.valueOf(scanner.next().toUpperCase());
            if(company.updateCompanyNameByProjectName(projectName, companyName))
                company.getAllProjectDetails();
            else
                System.out.println("Company name not updated");
        }
        System.out.println("want to update Project name by project id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter project id");
            int projectId = scanner.nextInt();
            System.out.println("enter new Project Name");
            String newProjectName = scanner.next();
            if(company.updateProjectNameByProjectId(projectId, newProjectName))
                company.getAllProjectDetails();
            else
                System.out.println("Project name not updated");
        }
        System.out.println("want to update No. of Members by project id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter project id");
            int projectId = scanner.nextInt();
            System.out.println("enter new No. of Members");
            int newNoOfMembers = scanner.nextInt();
            if(company.updateNoOfMembersByProjectId(projectId, newNoOfMembers))
                company.getAllProjectDetails();
            else
                System.out.println("No. of Members not updated");
        }
        System.out.println("want to update No. of Developers by project id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter project id");
            int projectId = scanner.nextInt();
            System.out.println("enter new No. of Developers");
            int newNoOfDeveloper = scanner.nextInt();
            if(company.updateNoOfDeveloperByProjectId(projectId, newNoOfDeveloper))
                company.getAllProjectDetails();
            else
                System.out.println("No. of Developers not updated");
        }


    }
}
