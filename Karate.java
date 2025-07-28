class Karate {
    int karateId;
    String style;     
    String beltColor; 
    int experience;  

Karate(int karateId, String style, String beltColor, int experience) {
        System.out.println("Parameterized constructor");
        this.karateId = karateId;
        this.style = style;
        this.beltColor = beltColor;
        this.experience = experience;
    }

    
    public void getData() {
        System.out.println("the karate id is " + karateId);
        System.out.println("the style is " + style);
        System.out.println("the belt color is " + beltColor);
        System.out.println("the experience is " + experience + " years");
        System.out.println();
    }	
}
