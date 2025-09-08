package com.xworkz.institute;

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

           System.out.println("Enter subject name:");
           trainee.setSubject(scanner.next());

           System.out.println("Enter trainee phno:");
           trainee.setPhoneNumber(scanner.nextLong());

           System.out.println("Enter no of classes taken");
           trainee.setNoOfClassesTaken(scanner.nextInt());

           xworkz.addTrainee(trainee);

       }
       xworkz.getAllTraineeInfo();
    }
}
