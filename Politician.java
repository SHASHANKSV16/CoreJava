class Politician {

    int politicianId;
    String name;
    int age;
    String position;
    String party;

    Politician(int politicianId, String name, int age, String position, String party) {
        
        this.politicianId = politicianId;
        this.name = name;
        this.age = age;
        this.position = position;
        this.party = party;
    }

    Politician(String name, int age) {
        
        this.name = name;
        this.age = age;
    }

    Politician(String position, String party) {
       
        this.position = position;
        this.party = party;
    }

    public void getData() {
        System.out.println("the politician id is " + politicianId);
        System.out.println("the name is " + name);
        System.out.println("the age is " + age);
        System.out.println("the position is " + position);
        System.out.println("the party is " + party);
        System.out.println();
    }
}


