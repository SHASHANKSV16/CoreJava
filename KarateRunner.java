class KarateRunner {
    public static void main(String[] karates) {

        String[] trainers = {"Sensei", "Master"};

        Karate firstKarate = new Karate(1, "Shotokan", "White", 1, trainers);
        firstKarate.getData();

        Karate secondKarate = new Karate(2, "Goju-Ryu");
        System.out.println("the karate id is " + secondKarate.karateId);
        System.out.println("the style is " + secondKarate.style);
        System.out.println();

        Karate thirdKarate = new Karate("Green", 3);
        System.out.println("the belt color is " + thirdKarate.beltColor);
        System.out.println("the experience is " + thirdKarate.experience + " years");
        System.out.println();

        Karate fourthKarate = new Karate();
        fourthKarate.karateId = 4;
        fourthKarate.style = "Kyokushin";
        fourthKarate.beltColor = "Blue";
        fourthKarate.experience = 4;
        fourthKarate.getData();
    }
}
