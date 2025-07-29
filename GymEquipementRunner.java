class GymEquipementRunner {
    public static void main(String[] gym) {

        double weightsAvailable[] = {10.0, 20.0, 30.0};

        GymEquipement firstEquipment = new GymEquipement(1, "Treadmill", "Cardio", "FitTrack", 55000.0, weightsAvailable);
        firstEquipment.getData();

        GymEquipement secondEquipment = new GymEquipement(2, "Dumbbell Set");
        System.out.println("The equipment id is " + secondEquipment.equipmentId);
        System.out.println("The name is " + secondEquipment.name);
        System.out.println();

        GymEquipement thirdEquipment = new GymEquipement("PedalPro", 35000.0);
        System.out.println("The brand is " + thirdEquipment.brand);
        System.out.println("The price is " + thirdEquipment.price);
        System.out.println();

        GymEquipement fourthEquipment = new GymEquipement();
        fourthEquipment.equipmentId = 4;
        fourthEquipment.name = "Rowing Machine";
        fourthEquipment.type = "Cardio";
        fourthEquipment.brand = "RowMax";
        fourthEquipment.price = 75000.0;
        fourthEquipment.weightsAvailable = weightsAvailable;
        fourthEquipment.getData();
    }
}
