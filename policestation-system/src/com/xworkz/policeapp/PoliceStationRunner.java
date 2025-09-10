package com.xworkz.policeapp;

import com.xworkz.policeapp.constants.TypeOfPost;
import com.xworkz.policeapp.police.Police;
import com.xworkz.policeapp.policestation.PoliceStation;

import java.util.Scanner;

public class PoliceStationRunner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of police to be add :");
        int size = scanner.nextInt();

        PoliceStation policeStation = new PoliceStation(size);
        System.out.println("Enter no of polices are available :"+policeStation.polices.length);

        for (int index=0; index<size ; index++){
            Police police = new Police();

            System.out.println("Enter police Id :");
            police.setPoliceId(scanner.nextInt());

            System.out.println("Enter police name");
            police.setName(scanner.next());

            System.out.println("Enter type of post  from PI,API,SI,ASI,HC,SC,PC:");
            police.setTypeOfPost(TypeOfPost.valueOf(scanner.next().toUpperCase()));

            System.out.println("Enter salary :");
            police.setSalary(scanner.nextDouble());

            System.out.println("Enter Experience");
            police.setExperience(scanner.nextInt());

            policeStation.addPolice(police);
        }

        policeStation.getAllPoliceDetails();


        System.out.println("want to get Post by police Id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter police Id");
            System.out.println("the Post is " + policeStation.getPostById(scanner.nextInt()));
        }
        System.out.println("want to get Name by police Id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter police Id");
            System.out.println("the Name is " + policeStation.getNameById(scanner.nextInt()));
        }
        System.out.println("want to get Salary by police Id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter police Id");
            System.out.println("the Salary is " + policeStation.getSalaryById(scanner.nextInt()));
        }
        System.out.println("want to get Experience by police Id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter police Id");
            System.out.println("the Experience is " + policeStation.getExperienceById(scanner.nextInt()));
        }
        System.out.println("want to get Id by police Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter police Name");
            System.out.println("the Id is " + policeStation.getIdByName(scanner.next()));
        }
        System.out.println("want to get Post by police Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter police Name");
            System.out.println("the Post is " + policeStation.getPostByName(scanner.next()));
        }
        System.out.println("want to get Salary by police Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter police Name");
            System.out.println("the Salary is " + policeStation.getSalaryByName(scanner.next()));
        }
        System.out.println("want to get Experience by police Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter police Name");
            System.out.println("the Experience is " + policeStation.getExperienceByName(scanner.next()));
        }



        System.out.println("want to update Name by police Id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter police Id");
            int id = scanner.nextInt();
            System.out.println("enter new Name");
            String newName = scanner.next();
            if(policeStation.updateNameById(id, newName))
                policeStation.getAllPoliceDetails();
            else
                System.out.println("Name not updated");
        }
        System.out.println("want to update Post by police Id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter police Id");
            int id = scanner.nextInt();
            System.out.println("enter new Post (e.g., SI, INSPECTOR, CONSTABLE, DSP, SP)");
            TypeOfPost newPost = TypeOfPost.valueOf(scanner.next().toUpperCase());
            if(policeStation.updatePostById(id, newPost))
                policeStation.getAllPoliceDetails();
            else
                System.out.println("Post not updated");
        }
        System.out.println("want to update Salary by police Id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter police Id");
            int id = scanner.nextInt();
            System.out.println("enter new Salary");
            double newSalary = scanner.nextDouble();
            if(policeStation.updateSalaryById(id, newSalary))
                policeStation.getAllPoliceDetails();
            else
                System.out.println("Salary not updated");
        }
        System.out.println("want to update Experience by police Id : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter police Id");
            int id = scanner.nextInt();
            System.out.println("enter new Experience (in years)");
            int newExperience = scanner.nextInt();
            if(policeStation.updateExperienceById(id, newExperience))
                policeStation.getAllPoliceDetails();
            else
                System.out.println("Experience not updated");
        }


    }
}
