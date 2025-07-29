class Karate {
    int karateId;
    String style;
    String beltColor;
    int experience;
    String[] trainers; 

    Karate() {

    }

    Karate(int karateId, String style) {
        this.karateId = karateId;
        this.style = style;
    }

    Karate(String beltColor, int experience) {
        this.beltColor = beltColor;
        this.experience = experience;
    }

    Karate(int karateId, String style, String beltColor, int experience, String[] trainers) {
        this.karateId = karateId;
        this.style = style;
        this.beltColor = beltColor;
        this.experience = experience;
        this.trainers = trainers;
    }

    public void getData() {
        System.out.println("the karate id is " + karateId);
        System.out.println("the style is " + style);
        System.out.println("the belt color is " + beltColor);
        System.out.println("the experience is " + experience + " years");

        
        if (trainers != null) {
            System.out.print("Trainers are  ");
            for (String trainer : trainers) {
                System.out.println(trainer);
            }
            
        }

        System.out.println();
    }
}
