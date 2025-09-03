package com.xworkz.institute;

import com.xworkz.institute.trainee.Trainee;
import com.xworkz.institute.xworkz.Xworkz;

public class XworkzRunner {
    public static void main(String[] args) {

        Trainee trainee1=new Trainee(1,"Veeresh",60,7204287213L,"Full Stack");
        Trainee trainee2=new Trainee(2,"Shashank",60,9620221944L,"Full Stack");
        Trainee trainee3=new Trainee(3,"Chethan",60,8521479635L,"Full Stack");
        Trainee trainee4=new Trainee(4,"Ramesh",55,9876543210L,"Java");
        Trainee trainee5=new Trainee(5,"Suresh",58,9123456780L,"Python");
        Trainee trainee6=new Trainee(6,"Mahesh",60,9012345678L,"JavaScript");
        Trainee trainee7=new Trainee(7,"Umesh",62,9345678901L,"C++");
        Trainee trainee8=new Trainee(8,"Ganesh",59,9456789012L,"Spring Boot");
        Trainee trainee9=new Trainee(9,"Rakesh",60,9567890123L,"SQL");
        Trainee trainee10=new Trainee(10,"Lokesh",57,9678901234L,"HTML/CSS");
        Trainee trainee11=new Trainee(11,"Harish",60,9789012345L,"Angular");
        Trainee trainee12=new Trainee(12,"Manoj",61,9890123456L,"React");
        Trainee trainee13=new Trainee(13,"Praveen",60,9901234567L,"Data Science");
        Trainee trainee14=new Trainee(14,"Vignesh",56,9812345678L,"DevOps");
        Trainee trainee15=new Trainee(15,"Rohit",60,9823456789L,"AI/ML");

        Xworkz xworkz=new Xworkz();
        if(xworkz.addTrainee(trainee1)&&xworkz.addTrainee(trainee2)&&xworkz.addTrainee(trainee3)&&
                xworkz.addTrainee(trainee4)&&xworkz.addTrainee(trainee5)&&xworkz.addTrainee(trainee6)&&
                xworkz.addTrainee(trainee7)&&xworkz.addTrainee(trainee8)&&xworkz.addTrainee(trainee9)&&
                xworkz.addTrainee(trainee10)&&xworkz.addTrainee(trainee11)&&xworkz.addTrainee(trainee12)&&
                xworkz.addTrainee(trainee13)&&xworkz.addTrainee(trainee14)&&xworkz.addTrainee(trainee15)){
            xworkz.getAllTraineeInfo();
        }



    }
}
