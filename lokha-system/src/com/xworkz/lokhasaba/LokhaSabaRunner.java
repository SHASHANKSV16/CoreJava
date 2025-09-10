package com.xworkz.lokhasaba;

import com.xworkz.lokhasaba.lokasaba.LokhaSaba;
import com.xworkz.lokhasaba.nationality.Nationality;
import com.xworkz.lokhasaba.politician.Politician;

import java.util.Scanner;

public class LokhaSabaRunner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of politician :");
        int size = scanner.nextInt();

        LokhaSaba lokhaSaba = new LokhaSaba(size);
        System.out.println("Enter no of politician available are :"+lokhaSaba.politicians.length);

        for (int index=0; index<size ; index++){

            Politician politician = new Politician();

            System.out.println("Enter id :");
            politician.setId(scanner.nextInt());

            System.out.println("Enter name :");
            politician.setName(scanner.next());

            System.out.println("Enter Age :");
            politician.setAge(scanner.nextInt());

            System.out.println("Enter nationality");
            politician.setNationality(Nationality.valueOf(scanner.next().toUpperCase()));

            System.out.println("Enter constitution");
            politician.setConstitution(scanner.next());

            lokhaSaba.addPolitician(politician);

        }
        lokhaSaba.getAllPoliticiansInfo();


  
        System.out.println("want to get Name by ID : yes / no");
        if(scanner.next().equals("yes")) {
            System.out.println("enter Politician ID");
            System.out.println("Name: " + lokhaSaba.getNameById(scanner.nextInt()));
        }
        System.out.println("want to get ID by Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Politician Name");
            System.out.println("ID: " + lokhaSaba.getIdByName(scanner.next()));
        }
        System.out.println("want to get Constitution by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Politician ID");
            System.out.println("Constitution: " + lokhaSaba.getConstitutionById(scanner.nextInt()));
        }
        System.out.println("want to get Constitution by Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Politician Name");
            System.out.println("Constitution: " + lokhaSaba.getConstitutionByName(scanner.next()));
        }
        System.out.println("want to get Age by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Politician ID");
            System.out.println("Age: " + lokhaSaba.getAgeById(scanner.nextInt()));
        }
        System.out.println("want to get Age by Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Politician Name");
            System.out.println("Age: " + lokhaSaba.getAgeByName(scanner.next()));
        }
        System.out.println("want to get Nationality by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Politician ID");
            System.out.println("Nationality: " + lokhaSaba.getNationalityById(scanner.nextInt()));
        }
        System.out.println("want to get Nationality by Name : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Politician Name");
            System.out.println("Nationality: " + lokhaSaba.getNationalityByName(scanner.next()));
        }

        System.out.println("want to update Name by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Politician ID");
            int id = scanner.nextInt();
            System.out.println("enter new Name");
            String newName = scanner.next();
            if(lokhaSaba.updateNameById(id, newName)) lokhaSaba.getAllPoliticiansInfo();
            else System.out.println("Name not updated");
        }
        System.out.println("want to update Constitution by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Politician ID");
            int id = scanner.nextInt();
            System.out.println("enter new Constitution");
            String newConstitution = scanner.next();
            if(lokhaSaba.updateConstitutionById(id, newConstitution)) lokhaSaba.getAllPoliticiansInfo();
            else System.out.println("Constitution not updated");
        }

        System.out.println("want to update Age by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Politician ID");
            int id = scanner.nextInt();
            System.out.println("enter new Age");
            int newAge = scanner.nextInt();
            if(lokhaSaba.updateAgeById(id, newAge)) lokhaSaba.getAllPoliticiansInfo();
            else System.out.println("Age not updated");
        }

        System.out.println("want to update Nationality by ID : yes / no");
        if(scanner.next().equals("yes")){
            System.out.println("enter Politician ID");
            int id = scanner.nextInt();
            System.out.println("enter new Nationality from INDIA, USA, CANADA, AUSTRALIA, JAPAN");
            Nationality newNationality = Nationality.valueOf(scanner.next().toUpperCase());
            if(lokhaSaba.updateNationalityById(id, newNationality)) lokhaSaba.getAllPoliticiansInfo();
            else System.out.println("Nationality not updated");
        }

    }
}
