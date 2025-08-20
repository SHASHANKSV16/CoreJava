package com.xworkz.gymequipementapp.gymequipement;

public class GymEquipementRunner {
    public static void main(String[] args) {

        GymEquipement firstEquipment = new GymEquipement(1, "Treadmill", "Cardio", "FitTrack", 55000.0, 80.0);
        firstEquipment.getData();

        GymEquipement secondEquipment = new GymEquipement(2, "Dumbbell Set", "Strength", "IronBulk", 3000.0, 20.0);
        secondEquipment.getData();
    }
}
