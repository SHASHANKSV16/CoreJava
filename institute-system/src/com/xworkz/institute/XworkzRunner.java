package com.xworkz.institute;

import com.xworkz.institute.constants.Subject;
import com.xworkz.institute.trainee.Trainee;
import com.xworkz.institute.xworkz.Xworkz;

import java.util.Scanner;

public class XworkzRunner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of trainees to be add");
        int size = scanner.nextInt();

        Xworkz xworkz = new Xworkz(size);
        System.out.println("the no of trainee available are : "+xworkz.trainees.length);

       for (int index = 0;index<size;index++) {
           Trainee trainee = new Trainee();

           System.out.println("Enter id :");
           trainee.setId(scanner.nextInt());

           System.out.println("Enter name:");
           trainee.setName(scanner.next());

           System.out.println("Enter subject from these JAVAFULLSTACK , FRONTEND , SQL , DATA;:");
           trainee.setSubject(Subject.valueOf(scanner.next().toUpperCase()));

           System.out.println("Enter trainee phno:");
           trainee.setPhoneNumber(scanner.nextLong());

           System.out.println("Enter no of classes taken");
           trainee.setNoOfClassesTaken(scanner.nextInt());

           xworkz.addTrainee(trainee);

       }
       xworkz.getAllTraineeInfo();


        System.out.println("want to get Subject by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter ID");
            System.out.println("The Subject is: " + xworkz.getSubjectNameByTraineeId(scanner.nextInt()));
        }
        System.out.println("want to get Subject by Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Name");
            System.out.println("The Subject is: " + xworkz.getSubjectByTraineeName(scanner.next()));
        }
        System.out.println("want to get Phone Number by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter ID");
            System.out.println("The Phone Number is: " + xworkz.getPhoneNumberByTraineeId(scanner.nextInt()));
        }
        System.out.println("want to get Phone Number by Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Name");
            System.out.println("The Phone Number is: " + xworkz.getPhoneNumberByName(scanner.next()));
        }
        System.out.println("want to get No. of Classes Taken by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter ID");
            System.out.println("No. of Classes Taken: " + xworkz.getNoOfClassesTakenByTraineeId(scanner.nextInt()));
        }
        System.out.println("want to get No. of Classes Taken by Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Name");
            System.out.println("No. of Classes Taken: " + xworkz.getNoOfClassesTakenByName(scanner.next()));
        }
        System.out.println("want to get Trainee ID by Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Name");
            System.out.println("The Trainee ID is: " + xworkz.getTraineeIdByName(scanner.next()));
        }
        System.out.println("want to get Trainee Name by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter ID");
            System.out.println("The Trainee Name is: " + xworkz.getTraineeNameById(scanner.nextInt()));
        }

        System.out.println("want to update Trainee Name by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Trainee ID");
            int traineeId = scanner.nextInt();
            System.out.println("enter new Name");
            String newName = scanner.next();
            if(xworkz.updateTraineeNameById(traineeId, newName))
                System.out.println("Trainee Name updated successfully");
            else
                System.out.println("Trainee Name not updated");
        }

        System.out.println("want to update Subject by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Trainee ID");
            int traineeId = scanner.nextInt();
            System.out.println("enter new Subject from JAVAFULLSTACK , FRONTEND , SQL , DATA;:");
            Subject subject = Subject.valueOf(scanner.next().toUpperCase());
            if(xworkz.updateSubjectByTraineeId(traineeId, subject))
                System.out.println("Subject updated successfully");
            else
                System.out.println("Subject not updated");
        }
        System.out.println("want to update Phone Number by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Trainee ID");
            int traineeId = scanner.nextInt();
            System.out.println("enter new Phone Number");
            long phoneNumber = scanner.nextLong();
            if(xworkz.updatePhoneNumberByTraineeId(traineeId, phoneNumber))
                System.out.println("Phone Number updated successfully");
            else
                System.out.println("Phone Number not updated");
        }
        System.out.println("want to update No. of Classes Taken by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Trainee ID");
            int traineeId = scanner.nextInt();
            System.out.println("enter new No. of Classes Taken");
            int noOfClasses = scanner.nextInt();
            if(xworkz.updateNoOfClassesTakenByTraineeId(traineeId, noOfClasses))
                System.out.println("No. of Classes Taken updated successfully");
            else
                System.out.println("No. of Classes Taken not updated");
        }




    }
}
